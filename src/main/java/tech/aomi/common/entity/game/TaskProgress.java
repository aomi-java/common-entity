package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import tech.aomi.common.entity.LabelEntity;

import java.time.Instant;
import java.util.Map;

/**
 * 进度明细表
 */
@Getter
@Setter
public class TaskProgress<PlayerTask> implements java.io.Serializable, LabelEntity {

    private String id;

    /**
     * 玩家id
     */
    private String playerId;
    /**
     * 玩家任务ID
     */
    private String playerTaskId;

    /**
     * 玩家任务详情
     */
    @DBRef
    private PlayerTask playerTask;

    /**
     * 玩家任务信息
     */
    private String taskId;

    /**
     * 对应的阶段
     */
    private Integer stage;

    /**
     * 要求
     */
    private String requirement;

    /**
     * 达成数量
     */
    private Number number;

    /**
     * 附加数据
     */
    private Map<String, Object> labels;

    /**
     * 创建时间
     */
    private Instant createAt;
}
