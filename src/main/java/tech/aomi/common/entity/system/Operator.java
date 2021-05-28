package tech.aomi.common.entity.system;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.Set;

/**
 * 操作员信息
 *
 * @author Sean(sean.snow @ live.com) Create At 2019-11-19
 */
@Getter
@Setter
public class Operator<R extends Role> implements java.io.Serializable {

    private static final long serialVersionUID = -6663136478071053644L;

    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String phoneNo;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色信息
     */
    @DBRef
    private Set<R> roles;

    /**
     * 对应的权限信息
     */
    private Set<String> authorities;

    /**
     * 操作员备注
     */
    private String remark;

    /**
     * 创建日期
     */
    private Date createAt;

    /**
     * 单点登录系统中的用户ID
     */
    private String userId;
}
