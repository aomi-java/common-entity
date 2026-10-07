package tech.aomi.common.entity.rule;

/**
 * 规则条件比较操作符常量.
 * 各操作符对 {@link Condition#getValue()} 与 {@link Condition#getParams()} 的语义约定:
 * <ul>
 * <li>GT/GE/LT/LE/EQ/NE: value 为标量比较值, 数值按 BigDecimal 比较</li>
 * <li>IN/NOT_IN: value 为集合</li>
 * <li>STARTS_WITH/ENDS_WITH/CONTAINS/REGEX: value 为字符串</li>
 * <li>BETWEEN: value 为下界, params.max 为上界</li>
 * <li>MOD: value 为除数, params.remainder 为期望余数(缺省0), 判断整数时 value=1</li>
 * <li>EXISTS/IS_NULL: 无值操作符, 判断字段是否存在/为空</li>
 * </ul>
 */
public final class Operator {

    /** 大于 */
    public static final String GT = "gt";
    /** 大于等于 */
    public static final String GE = "ge";
    /** 小于 */
    public static final String LT = "lt";
    /** 小于等于 */
    public static final String LE = "le";
    /** 等于 */
    public static final String EQ = "eq";
    /** 不等于 */
    public static final String NE = "ne";
    /** 在集合中 */
    public static final String IN = "in";
    /** 不在集合中 */
    public static final String NOT_IN = "notIn";
    /** 以指定字符串开头 */
    public static final String STARTS_WITH = "startsWith";
    /** 以指定字符串结尾 */
    public static final String ENDS_WITH = "endsWith";
    /** 包含指定字符串 */
    public static final String CONTAINS = "contains";
    /** 不包含指定字符串 */
    public static final String NOT_CONTAINS = "notContains";
    /** 正则匹配 */
    public static final String REGEX = "regex";
    /** 区间, value 为下界, params.max 为上界 */
    public static final String BETWEEN = "between";
    /** 不在区间内, value 为下界, params.max 为上界 */
    public static final String NOT_BETWEEN = "notBetween";
    /** 取模, value 为除数, params.remainder 为期望余数(缺省0) */
    public static final String MOD = "mod";
    /** 字段存在 */
    public static final String EXISTS = "exists";
    /** 字段为空 */
    public static final String IS_NULL = "isNull";
    /** 字段不为空 */
    public static final String NOT_NULL = "notNull";
    /** 不以指定字符串开头 */
    public static final String NOT_STARTS_WITH = "notStartsWith";
    /** 不以指定字符串结尾 */
    public static final String NOT_ENDS_WITH = "notEndsWith";

    private Operator() {
    }
}
