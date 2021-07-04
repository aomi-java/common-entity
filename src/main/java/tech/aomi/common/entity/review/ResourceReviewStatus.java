package tech.aomi.common.entity.review;

import java.util.Arrays;
import java.util.List;

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
     * 新增审核中
     */
    ADD_REVIEWING,

    /**
     * 新增通过
     */
    ADD_RESOLVE,

    /**
     * 新增拒绝
     */
    ADD_REJECTED,

    /**
     * 编辑待审核
     */
    EDIT_WAIT_REVIEW,
    /**
     * 审核中
     */
    EDIT_REVIEWING,
    /**
     * 审核通过
     */
    EDIT_RESOLVE,
    /**
     * 审核拒绝
     */
    EDIT_REJECTED;

    /**
     * 新增审核中状态
     */
    public static final List<ResourceReviewStatus> ADD_REVIEW_STATUS = Arrays.asList(
            ADD_WAIT_REVIEW,
            ADD_REVIEWING
    );

    /**
     * 编辑审核中状态
     */
    public static final List<ResourceReviewStatus> EDIT_REVIEW_STATUS = Arrays.asList(
            EDIT_WAIT_REVIEW,
            EDIT_REVIEWING
    );

    /**
     * 审核中状态
     */
    public static final List<ResourceReviewStatus> IN_REVIEW_STATUS = Arrays.asList(
            ADD_WAIT_REVIEW,
            ADD_REVIEWING,
            EDIT_WAIT_REVIEW,
            EDIT_REVIEWING
    );
}
