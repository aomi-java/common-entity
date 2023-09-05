package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 任务阶段
 */
@Getter
@Setter
public class TaskStage implements java.io.Serializable {

    /**
     * 阶段名称
     */
    private String name;

    /**
     * 阶段说明
     */
    private String describe;

    /**
     * 当前阶段任务要求
     * 任务指标
     * 分享 SHARE - 40 个
     */
    private List<TaskRequirement> requirements;

    /**
     * 奖励信息
     * 当前阶段完成奖励
     */
    private List<TaskReward> rewards;


    public Number getRequirement(String key) {
        if (null == requirements) {
            return null;
        }
        return requirements.stream()
                .filter(item -> item.getKey().equals(key)).findFirst()
                .map(TaskRequirement::getValue).orElse(null);

    }

    public void addRequirement(String key, Number value) {
        if (null == getRequirements()) {
            setRequirements(new ArrayList<>());
        }
        getRequirements().add(new TaskRequirement(key, value));
    }

    public void removeRequirement(String key) {
        if (null == getRequirements())
            return;

        this.requirements = this.requirements.stream()
                .filter(item -> !(item.getKey().equals(key)))
                .collect(Collectors.toList());
    }

}
