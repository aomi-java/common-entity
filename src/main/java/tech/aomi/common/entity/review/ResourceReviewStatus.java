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
    EDIT_REJECTED,

    DEL_WAIT_REVIEW,
    DEL_REVIEWING,
    DEL_RESOLVE,
    DEL_REJECTED;

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

    public static final List<ResourceReviewStatus> DEL_REVIEW_STATUS = Arrays.asList(
            DEL_WAIT_REVIEW,
            DEL_REVIEWING
    );

    /**
     * 审核中状态
     */
    public static final List<ResourceReviewStatus> IN_REVIEW_STATUS = Arrays.asList(
            ADD_WAIT_REVIEW,
            ADD_REVIEWING,
            EDIT_WAIT_REVIEW,
            EDIT_REVIEWING,

            DEL_WAIT_REVIEW,
            DEL_REVIEWING
    );

    /**
     * 获取当前审核中状态对应的审核结果状态
     *
     * @param status 当前状态
     * @param result 审核结果
     * @return 资源审核状态
     */
    public static ResourceReviewStatus getResultStatus(ResourceReviewStatus status, ReviewResult result) {
        if (ADD_REVIEW_STATUS.contains(status)) {
            return result == ReviewResult.RESOLVE ? ADD_RESOLVE : ADD_REJECTED;
        } else if (EDIT_REVIEW_STATUS.contains(status)) {
            return result == ReviewResult.RESOLVE ? EDIT_RESOLVE : EDIT_REJECTED;
        } else if (DEL_REVIEW_STATUS.contains(status)) {
            return result == ReviewResult.RESOLVE ? DEL_RESOLVE : DEL_REJECTED;
        }
        return status;
    }

    /**
     * 获取审核中状态
     *
     * @param status 当前状态
     * @return 审核中状态
     */
    public static ResourceReviewStatus getReviewStatus(ResourceReviewStatus status) {
        if (status == ADD_WAIT_REVIEW) {
            return ADD_REVIEWING;
        } else if (status == EDIT_WAIT_REVIEW) {
            return EDIT_REVIEWING;
        } else if (status == DEL_WAIT_REVIEW) {
            return DEL_REVIEWING;
        }
        return status;
    }

    public boolean isAdd() {
        return this.name().startsWith("ADD");
    }

    public boolean isEdit() {
        return this.name().startsWith("EDIT");
    }

    public boolean isDel() {
        return this.name().startsWith("DEL");
    }
}
