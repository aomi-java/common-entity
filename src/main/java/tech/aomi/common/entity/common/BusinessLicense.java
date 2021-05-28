package tech.aomi.common.entity.common;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author 田尘殇Sean Create At 2019/3/7 11:28
 */
@Getter
@Setter
public class BusinessLicense implements java.io.Serializable {

    private static final long serialVersionUID = -3151756623258134422L;

    private Type type;

    private String number;

    /**
     * 生效日期
     */
    private Date effectiveAt;

    /**
     * 有效期
     * 如果 是永久填写 9999-12-30 年
     */
    private Date expireAt;

    public enum Type {
        /**
         * 营业执照
         */
        BUSINESS_LICENSE,

        /**
         * 多证合一
         */
        BUSINESS_LICENSE_ALL_ONE,

        /**
         * 事业单位证书
         */
        INSTITUTION
    }
}
