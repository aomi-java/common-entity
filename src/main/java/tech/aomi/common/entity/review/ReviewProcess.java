package tech.aomi.common.entity.review;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 审核流程表
 *
 * @author 田尘殇Sean Create At 2018/10/15 10:02
 */
@Getter
@Setter
public class ReviewProcess implements java.io.Serializable {

    private static final long serialVersionUID = 4764095371181624367L;

    private String id;

    /**
     * 审核名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 审核链
     */
    private List<ReviewUser> chain;
}
