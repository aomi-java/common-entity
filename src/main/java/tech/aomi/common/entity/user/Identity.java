package tech.aomi.common.entity.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * 证件信息
 *
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/7/13
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Identity implements java.io.Serializable {

    private static final long serialVersionUID = -7577867332585239750L;

    /**
     * 证件类型
     */
    private Type type;

    /**
     * 编号
     */
    private String number;

    /**
     * hash值
     */
    private String numberHash;

    /**
     * 脱敏值
     */
    private String numberMask;
    /**
     * 生效日期
     */
    private Date effectiveAt;

    /**
     * 有效期
     * 如果 是永久填写 9999-12-30 年
     */
    private Date expireAt;

    public Identity(Type type, String number) {
        this.type = type;
        this.number = number;
    }
}
