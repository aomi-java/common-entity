package tech.aomi.common.entity.business;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 费率信息
 *
 * @author Sean(sean.snow@live.com) createAt 18-1-11.
 */
@Data
public class FeeRate implements Serializable {

    private static final long serialVersionUID = 6942935784558318235L;

    /**
     * 费率类型
     */
    private Type type;

    /**
     * 费率
     */
    private BigDecimal value;

    /**
     * 最低收费
     */
    private BigDecimal min;

    /**
     * 封顶值
     */
    private BigDecimal max;

    public FeeRate() {
    }

    public FeeRate(BigDecimal value) {
        this(Type.PERCENTAGE, value);
    }

    public FeeRate(Type type, BigDecimal value) {
        this(type, value, BigDecimal.ZERO);
    }

    public FeeRate(Type type, BigDecimal value, BigDecimal min) {
        this(type, value, min, BigDecimal.ZERO);
    }

    public FeeRate(Type type, BigDecimal value, BigDecimal min, BigDecimal max) {
        this.type = type;
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public enum Type {
        // 封顶
        CAP,
        // 百分比
        PERCENTAGE,
        // 封顶加百分比
        CAP_PERCENTAGE
    }
}
