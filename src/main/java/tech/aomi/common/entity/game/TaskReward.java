package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;
import tech.aomi.common.entity.LabelEntity;

import java.util.Map;

/**
 * 奖励
 */
@Getter
@Setter
public class TaskReward implements LabelEntity {


    /**
     * 奖励类型
     * 物品、经验、货币
     */
    private String type;

    /**
     * 奖励数量
     */
    private Long amount;

    /**
     * 如果是物品可以填写物品ID
     * 如快递
     */
    private String itemId;

    /**
     * 标签信息，用于扩展其他数据
     */
    private Map<String, Object> labels;
}
