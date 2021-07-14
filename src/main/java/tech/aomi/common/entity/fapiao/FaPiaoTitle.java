package tech.aomi.common.entity.fapiao;

import lombok.Getter;
import lombok.Setter;

/**
 * 发票抬头
 *
 * @author Sean createAt 2021/7/14
 */
@Getter
@Setter
public class FaPiaoTitle implements java.io.Serializable {

    private static final long serialVersionUID = 1875486710657081200L;

    /**
     * 公司名称
     * 必填
     */
    private String name;

    /**
     * 税号
     * 纳税人识别号
     * 必填
     */
    private String taxId;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 电话号码
     */
    private String mobile;

    /**
     * 开户行名称
     */
    private String openBankName;

    /**
     * 银行账号
     */
    private String bankAccountNo;
}
