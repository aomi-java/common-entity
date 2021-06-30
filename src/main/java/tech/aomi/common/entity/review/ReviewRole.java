package tech.aomi.common.entity.review;

import lombok.Getter;
import lombok.Setter;

/**
 * 审核的角色
 *
 * @author Sean createAt 2021/6/30
 */
@Getter
@Setter
public class ReviewRole implements java.io.Serializable {
    private static final long serialVersionUID = -743466121695492714L;

    private String id;

    private String name;
}
