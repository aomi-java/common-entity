package tech.aomi.common.entity.review;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author 田尘殇Sean Create At 2018/10/15 12:01
 */
@Getter
@Setter
public class ReviewHistory implements java.io.Serializable {

    private static final long serialVersionUID = -6709130005744679130L;

    /**
     * 审核用户
     */
    private ReviewUser user;

    /**
     * 审核结果
     */
    private ReviewResult result;

    /**
     * 审核结果说明
     */
    private String describe;

    /**
     * 审核日期
     */
    private Date reviewAt;
}
