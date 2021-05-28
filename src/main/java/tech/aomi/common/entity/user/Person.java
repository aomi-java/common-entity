package tech.aomi.common.entity.user;

import lombok.Getter;
import lombok.Setter;
import tech.aomi.common.entity.address.Address;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/7/13
 */
@Getter
@Setter
public class Person implements java.io.Serializable {

    private static final long serialVersionUID = -2575389915833958526L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 名字
     */
    private String firstName;

    /**
     * 姓氏
     */
    private String lastName;

    private Gender gender;

    /**
     * 证件信息
     */
    private Set<Identity> identities;

    private String phoneNo;

    private String email;

    private Date birthday;

    private Address address;

    /**
     * 获取身份证信息
     *
     * @return 身份证信息
     */
    public Identity idCard() {
        return getIdentity(Type.ID_CARD);
    }

    public Identity getIdentity(Type type) {
        if (null == this.identities || identities.size() == 0)
            return null;
        return identities.stream()
                .filter(identity -> identity.getType() == type)
                .findFirst()
                .orElse(null);
    }

    public void addIdCard(String idNo) {
        addIdentity(Type.ID_CARD, idNo);
    }

    public void addIdentity(Type type, String number) {
        if (null == this.identities) {
            this.identities = new HashSet<>();
        }
        this.identities.add(new Identity(type, number));
    }
}
