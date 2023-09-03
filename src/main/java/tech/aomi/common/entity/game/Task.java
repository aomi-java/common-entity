package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

/**
 * 任务信息表
 */
@Getter
@Setter
public class Task<TaskType> implements java.io.Serializable {

    /**
     * 任务ID
     */
    private String id;

    /**
     * 任务名称
     */
    private String name;

    /**
     * 任务描述
     */
    private String describe;


    /**
     * 任务阶段步骤
     */
    private List<TaskStage> stages;

    /**
     * 奖励信息
     * 全部完成以后的奖励
     */
    private List<Reward> rewards;

    /**
     * 任务类型
     */
    private TaskType type;

    /**
     * 任务触发类型
     */
    private TriggerType triggerType;

    /**
     * 任务开始时间，
     * 在该时间之前，该任务无法领取
     */
    private Instant startAt;

    /**
     * 任务的结束日期，表示任务何时过期不可完成。可以为空表示没有截止日期。
     */
    private Instant endAt;

    /**
     * 任务有效期
     * 单位业务系统自行规定
     */
    private Long validityDuration;

    /**
     * 任务创建时间
     */
    private Instant createAt;
    /**
     * 任务更新时间
     */
    private Instant updateAt;

}
