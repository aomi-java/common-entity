package tech.aomi.common.entity.review;

/**
 * 资源审核状态
 *
 * @author Sean createAt 2021/6/26
 */
public enum ResourceReviewStatus {
    /**
     * 新增待审核
     */
    ADD_WAIT_REVIEW,
    /**
     * 编辑待审核
     */
    EDIT_WAIT_REVIEW,
    /**
     * 审核中
     */
    REVIEWING,
    /**
     * 审核通过
     */
    REVIEW_RESOLVE,
    /**
     * 审核拒绝
     */
    REVIEW_REJECTED
}
