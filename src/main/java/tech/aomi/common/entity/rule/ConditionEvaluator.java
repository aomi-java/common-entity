package tech.aomi.common.entity.rule;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/**
 * {@link Condition} 求值器: 对提取出的实际值与条件进行比较.
 * 内置 {@link Operator} 中定义的操作符, 可通过 {@link #register(String, OperatorHandler)}
 * 注册自定义操作符或覆盖内置实现.
 */
public class ConditionEvaluator {

    private static final ConditionEvaluator INSTANCE = new ConditionEvaluator();

    private final Map<String, OperatorHandler> handlers = new ConcurrentHashMap<>();

    public ConditionEvaluator() {
        registerDefaults();
    }

    /**
     * 共享实例, 无自定义操作符时直接使用
     */
    public static ConditionEvaluator shared() {
        return INSTANCE;
    }

    /**
     * 注册操作符处理器, operator 相同时覆盖已有实现
     */
    public ConditionEvaluator register(String operator, OperatorHandler handler) {
        handlers.put(operator, handler);
        return this;
    }

    public boolean evaluate(Object actual, Condition condition) {
        return compare(actual, condition.getOperator(), condition.getValue(), condition.getParams());
    }

    public boolean compare(Object actual, String operator, Object value, Map<String, Object> params) {
        OperatorHandler handler = handlers.get(operator);
        if (handler == null) {
            return false;
        }
        return handler.test(actual, value, params);
    }

    protected void registerDefaults() {
        register(Operator.GT, (actual, value, params) -> compareValues(actual, value) > 0);
        register(Operator.GE, (actual, value, params) -> compareValues(actual, value) >= 0);
        register(Operator.LT, (actual, value, params) -> compareValues(actual, value) < 0);
        register(Operator.LE, (actual, value, params) -> compareValues(actual, value) <= 0);
        register(Operator.EQ, (actual, value, params) -> equalsValue(actual, value));
        register(Operator.NE, (actual, value, params) -> !equalsValue(actual, value));
        register(Operator.IN, (actual, value, params) -> containsValue(value, actual));
        register(Operator.NOT_IN, (actual, value, params) -> !containsValue(value, actual));
        register(Operator.STARTS_WITH, (actual, value, params) -> asString(actual).startsWith(asString(value)));
        register(Operator.NOT_STARTS_WITH, (actual, value, params) -> !asString(actual).startsWith(asString(value)));
        register(Operator.ENDS_WITH, (actual, value, params) -> asString(actual).endsWith(asString(value)));
        register(Operator.NOT_ENDS_WITH, (actual, value, params) -> !asString(actual).endsWith(asString(value)));
        register(Operator.CONTAINS, (actual, value, params) -> asString(actual).contains(asString(value)));
        register(Operator.NOT_CONTAINS, (actual, value, params) -> !asString(actual).contains(asString(value)));
        register(Operator.REGEX, (actual, value, params) -> actual != null && value != null
                && Pattern.matches(asString(value), asString(actual)));
        register(Operator.BETWEEN, this::between);
        register(Operator.NOT_BETWEEN, (actual, value, params) -> !between(actual, value, params));
        register(Operator.MOD, this::modMatches);
        register(Operator.EXISTS, (actual, value, params) -> actual != null);
        register(Operator.IS_NULL, (actual, value, params) -> actual == null);
        register(Operator.NOT_NULL, (actual, value, params) -> actual != null);
    }

    /**
     * 区间匹配: value 为下界, params.max 为上界(含边界)
     */
    protected boolean between(Object actual, Object value, Map<String, Object> params) {
        Object max = params == null ? null : params.get("max");
        return compareValues(actual, value) >= 0 && compareValues(actual, max) <= 0;
    }

    /**
     * 取模匹配: value 为除数, params.remainder 为期望余数(缺省0)
     * 例如判断是否为整数: value=1; 判断是否为100的倍数: value=100
     */
    protected boolean modMatches(Object actual, Object value, Map<String, Object> params) {
        if (actual == null || value == null) {
            return false;
        }
        try {
            BigDecimal divisor = new BigDecimal(value.toString());
            if (divisor.compareTo(BigDecimal.ZERO) == 0) {
                return false;
            }
            BigDecimal remainder = BigDecimal.ZERO;
            Object r = params == null ? null : params.get("remainder");
            if (r != null) {
                remainder = new BigDecimal(r.toString());
            }
            return new BigDecimal(actual.toString()).remainder(divisor).compareTo(remainder) == 0;
        } catch (ArithmeticException | NumberFormatException e) {
            return false;
        }
    }

    protected boolean equalsValue(Object actual, Object value) {
        if (actual == null || value == null) {
            return false;
        }
        if (actual instanceof Number && value instanceof Number) {
            return new BigDecimal(actual.toString()).compareTo(new BigDecimal(value.toString())) == 0;
        }
        return Objects.equals(actual.toString(), value.toString());
    }

    protected boolean containsValue(Object value, Object actual) {
        if (value instanceof Collection<?> collection) {
            return collection.contains(actual);
        }
        if (value instanceof String string) {
            return actual != null && string.contains(asString(actual));
        }
        return false;
    }

    protected int compareValues(Object actual, Object value) {
        if (actual == null || value == null) {
            return -1;
        }
        if (actual instanceof Number && value instanceof Number) {
            return new BigDecimal(actual.toString()).compareTo(new BigDecimal(value.toString()));
        }
        return asString(actual).compareTo(asString(value));
    }

    protected String asString(Object value) {
        return value == null ? "" : value.toString();
    }

    @FunctionalInterface
    public interface OperatorHandler {

        /**
         * @param actual 实际值
         * @param value  条件配置的主操作数
         * @param params 条件配置的扩展参数, 可为 null
         */
        boolean test(Object actual, Object value, Map<String, Object> params);
    }
}
