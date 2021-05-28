package tech.aomi.common.entity.bank;

/**
 * 银行卡类型
 *
 * @author 田尘殇Sean(sean.snow@live.com) Create At 16/8/9
 */
public enum BankCardType {

    /**
     * 借记卡/储蓄卡
     */
    DEBIT_CARD,

    /**
     * 贷记卡/信用卡
     */
    CREDIT_CARD,
    /**
     * 准贷记卡
     */
    SEMI_CREDIT_CARD,
    /**
     * 预付费卡
     */
    PREPAID_CARD
}
