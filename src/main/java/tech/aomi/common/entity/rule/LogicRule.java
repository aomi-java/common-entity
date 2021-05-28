package tech.aomi.common.entity.rule;

import lombok.Data;

import java.util.List;

/**
 * @author 田尘殇Sean Create At 2018/10/12 11:49
 */
@Data
public class LogicRule implements java.io.Serializable {

    private static final long serialVersionUID = 3746172009608370788L;

    private String id;

    /**
     * 描述
     */
    private String describe;

    /**
     * 条件
     */
    private List<Condition> conditions;

    /**
     * 必要条件
     */
    private List<Condition> requireAllOf;

    /**
     * 首选条件
     */
    private List<Condition> preferAnyOf;

    /**
     * 最好符合
     */
    private List<Condition> requireAnyOf;

    /**
     * 条件表达式
     */
    private String conditionExpr;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 当前权重
     */
    private Integer currentWeight;

    /**
     * 匹配规则后返回的值
     */
    private Object value;

    private Boolean enabled = true;
}
