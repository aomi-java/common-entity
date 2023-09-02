package tech.aomi.common.entity.coupon;

import lombok.Getter;
import lombok.Setter;
import tech.aomi.common.entity.StringIdAbstractEntity;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class Coupon extends StringIdAbstractEntity {

    /**
     * 优惠券代码
     */
    private String code; // 优惠码

    /**
     * 优惠券描述
     */
    private String description; // 优惠券描述

    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;

    /**
     * 最低购买金额
     */
    private BigDecimal minimumPurchaseAmount;

    /**
     * 指定生效日期
     */
    private Instant startAt; // 优惠券开始日期
    /**
     * 指定结束、过期日期
     */
    private Instant endAt; // 优惠券结束日期

    /**
     * 是否激活
     */
    private Boolean activated; // 优惠券是否激活
    /**
     * 有效期
     * 领取时用来计算有效期
     * 0 或者 null 为不限制
     */
    private Long validityDuration;


    private Instant createAt;

    private Instant updateAt;
}
