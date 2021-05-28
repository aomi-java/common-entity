package tech.aomi.common.entity.business;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 区间费率
 *
 * @author Sean(sean.snow @ live.com) Create At 2019-10-08
 */
@Getter
@Setter
public class RangeFeeRate implements java.io.Serializable {

    private static final long serialVersionUID = -9028411568663341414L;
    /**
     * 最低值
     */
    private BigDecimal min;

    /**
     * 最大值
     */
    private BigDecimal max;

    /**
     * 费率
     */
    private FeeRate feeRate;

}
