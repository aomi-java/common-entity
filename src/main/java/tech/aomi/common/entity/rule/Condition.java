package tech.aomi.common.entity.rule;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Condition implements java.io.Serializable {

    @Serial
    private static final long serialVersionUID = 841377957017351637L;

    /**
     * 多key
     */
    private List<String> keys;

    /**
     * 规则值
     */
    private Object value;

    /**
     * 操作符扩展参数, 由具体 operator 定义语义.
     * 例如 mod 操作符: params.remainder = 期望余数(缺省0)
     */
    private Map<String, Object> params;

    /**
     * 比较操作符, 见 {@link Operator}
     */
    private String operator;

    /**
     * 数据类型
     */
    private Type type;

    /**
     * 条件描述
     */
    private String describe;

    public enum Type {
        string,
        number
    }
}
