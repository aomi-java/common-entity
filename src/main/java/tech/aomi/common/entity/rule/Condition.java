package tech.aomi.common.entity.rule;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors
public class Condition implements java.io.Serializable {

    private static final long serialVersionUID = 841377957017351637L;

    @Deprecated
    private String key;

    /**
     * 多key
     */
    private List<String> keys;

    /**
     * 规则值
     */
    private Object value;

    /**
     * gt 大于
     * ge 大于等于
     * lt 小于
     * le 小于登陆
     * eq 等于
     * 比较操作符
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
