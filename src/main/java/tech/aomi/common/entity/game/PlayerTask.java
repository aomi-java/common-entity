package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Instant;
import java.util.Map;

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

    /**
     * 需求进度
     * 如
     * A 小怪 已经击杀50只
     */
    private Map<String, Object> requirementsProgress;

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

