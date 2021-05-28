package tech.aomi.common.entity.common;

import lombok.Getter;
import lombok.Setter;
import tech.aomi.common.entity.StringIdAbstractEntity;

@Getter
@Setter
public class Calendar extends StringIdAbstractEntity {

    private static final long serialVersionUID = 5999663694143610565L;

    /**
     * 日期
     */
    private String date;

    /**
     * 是否是节假日
     */
    private Boolean holiday;

    /**
     * 上一个工作日
     */
    private String prevWorkDay;

    /**
     * 下一个工作日
     */
    private String nextWorkDay;

    /**
     * 备注
     */
    private String remark;
}
