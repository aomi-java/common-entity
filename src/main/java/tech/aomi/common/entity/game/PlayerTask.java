package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Instant;

/**
 * 玩家任务信息表
 */
@Getter
@Setter
public class PlayerTask<P extends Player, T> implements java.io.Serializable {

    private String id;

    /**
     * 玩家ID
     */
    private String playerId;

    @DBRef
    private P player;

    /**
     * 任务ID
     */
    private String taskId;

    /**
     * 任务信息
     */
    @DBRef
    private T task;

    /**
     * 任务状态
     */
    private TaskStatus status;

    /**
     * 进度
     */
    private Integer progress;

//    /**
//     * 需求进度
//     * 对应任务表中的
//     * stages
//     * 如
//     * A 小怪 已经击杀50只
//     * 改数据和 stages 数组一一对应
//     */
//    具体进度根据明细表统计，这里有并发问题
//    private List<List<TaskRequirement>> requirementsProgress;

    /**
     * 开始时间
     */
    private Instant startAt;

    /**
     * 过期时间
     */
    private Instant expirationAt;

    /**
     * 任务完成时间
     */
    private Instant completionAt;

    /**
     * 任务放弃时间
     */
    private Instant abandonedAt;

    /**
     * 创建时间
     */
    private Instant createAt;
}

