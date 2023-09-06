package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Instant;
import java.util.List;

/**
 * 玩家奖励信息表
 * <p>
 * 需要对 playerId playerTaskId stage 做联合唯一索引
 *
 * @param <S>  来源，例如：击杀怪物、任务、平台
 * @param <UT> 用户任务 业务方根据自定义需求定义用户任务表
 * @param <TT> 任务类型
 */
@Getter
@Setter
public class PlayerReward<S, UT, TT> implements java.io.Serializable {

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
     * 任务要求
     */
    private List<TaskRequirement> requirements;

    /**
     * 奖励信息
     */
    private List<TaskReward> rewards;

    private String playerTaskId;

    @DBRef
    private UT playerTask;

    /**
     * 如果是任务，则记录任务id
     */
    private String taskId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务类型
     */
    private TT taskType;

    /**
     * 任务阶段
     */
    private Integer stage;

    /**
     * 创建时间
     */
    private Instant createAt;
}
