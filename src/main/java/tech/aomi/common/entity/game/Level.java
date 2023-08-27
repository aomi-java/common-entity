package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;
import tech.aomi.common.entity.LabelEntity;

import java.time.Instant;
import java.util.Map;

/**
 * 等级表
 */
@Getter
@Setter
public class Level implements java.io.Serializable, LabelEntity {

    private String id;

    /**
     * 等级编号
     */
    private Integer number;

    /**
     * 经验要求
     */
    private Long experienceRequired;

    /**
     * 标签
     * 用于记录一些额外的信息
     */
    private Map<String, Object> labels;

    /**
     * 创建时间
     */
    private Instant createAt;
}
