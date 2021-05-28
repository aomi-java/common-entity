package tech.aomi.common.entity.system;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

/**
 * 角色信息
 *
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/8/24
 */
@Getter
@Setter
public class Role implements java.io.Serializable {

    private static final long serialVersionUID = 4561352429779172592L;

    private String id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色对应的权限
     */
    private Set<Rule> rules;

    /**
     * 角色拥有的权限
     */
    private Set<String> authorities;

    /**
     * 锁
     */
    private Boolean locked;

    /**
     * 是否是系统内置角色
     */
    private Boolean builtin;

    /**
     * 描述
     */
    private String describe;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;
}
