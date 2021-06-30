package tech.aomi.common.entity.review;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Set;

/**
 * 审核用户信息
 *
 * @author Sean createAt 2021/6/30
 */
@Getter
@Setter
public class ReviewUser implements java.io.Serializable {

    private static final long serialVersionUID = -2591098275733823638L;

    /**
     * 审核用户ID
     */
    private String id;

    /**
     * 审核用户代码
     */
    private String code;

    /**
     * 审核用户名称
     */
    private String name;

    private Set<ReviewRole> roles;

    /**
     * 注释
     * 用户满足用户记录其他信息
     */
    private Map<String, Object> annotations;

}
