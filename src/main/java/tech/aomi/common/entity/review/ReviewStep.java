package tech.aomi.common.entity.review;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 审核步骤
 *
 * @author 田尘殇Sean Create At 2018/10/15 10:05
 */
@Getter
@Setter
@ToString
public class ReviewStep implements java.io.Serializable {

    private static final long serialVersionUID = 3704685294171136708L;

    /**
     * 审核的角色ID
     * 指定那个角色可以审核
     */
    private String roleId;

    private String roleName;

    /**
     * 审核用户ID
     * 指定特定的用户来审核,优先级大于角色
     */
    private String userId;

    private String userName;

    /**
     * 审核说明
     */
    private String describe;

}
