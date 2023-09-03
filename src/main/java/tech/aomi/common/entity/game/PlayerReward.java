package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

/**
 * 玩家奖励信息表
 *
 * @param <S> 来源，例如：击杀怪物、任务、平台
 */
@Getter
@Setter
public class PlayerReward<S> implements java.io.Serializable {

    /**
     * 记录ID
     */
    private String id;

    /**
     * 玩家id
     */
    private String playerId;

    /**
     * 来源
     */
    private S source;

    /**
     * 奖励信息
     */
    private List<TaskReward> rewards;

    /**
     * 如果是任务，则记录任务id
     */
    private String taskId;

    /**
     * 创建时间
     */
    private Instant createAt;
}
