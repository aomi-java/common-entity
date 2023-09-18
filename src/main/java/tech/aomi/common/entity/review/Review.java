package tech.aomi.common.entity.review;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.time.Instant;
import java.util.List;

/**
 * @author 田尘殇Sean Create At 2018/10/15 11:59
 */
@Getter
@Setter
public class Review<T> implements java.io.Serializable {

    @Serial
    private static final long serialVersionUID = -4057791930223229701L;

    private String id;

    /**
     * 修改之前的数据
     */
    private T before;

    /**
     * 修改之后的数据
     */
    private T after;

    /**
     * 使用的审核信息
     */
    private ReviewProcess reviewProcess;

    /**
     * 当前审核用户下标
     */
    private Integer currentReviewUserIndex;

    /**
     * 下一个审核用户下标
     */
    private Integer nextReviewUserIndex;

    /**
     * 当前状态
     */
    private ReviewStatus status;

    /**
     * 审核结果
     */
    private ReviewResult result;

    /**
     * 审核结果说明
     */
    private String resultDescribe;

    /**
     * 审核历史
     */
    private List<ReviewHistory> histories;

    /**
     * 资源状态
     */
    private ResourceReviewStatus resourceReviewStatus;

    /**
     * 变更描述
     */
    private String describe;

    /**
     * 创建时间
     */
    private Instant createAt;

    /**
     * 最后审核时间
     */
    public Instant getLastReviewAt() {
        // 第一个是新增的历史
        if (null == histories || histories.size() <= 1) {
            return null;
        }
        var history = histories.get(1);
        return history.getReviewAt();
    }
}
