package tech.aomi.common.entity.game;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
     * 分享 SHARE - 40 个
     */
    private Map<String, Object> requirements;

    /**
     * 奖励信息
     * 当前阶段完成奖励
     */
    private List<Reward> rewards;


    public Object getRequirement(String key) {
        return Optional.ofNullable(getRequirements()).map(requirements -> requirements.get(key)).orElse(null);
    }

    public void addRequirement(String key, Object value) {
        if (null == getRequirements()) {
            setRequirements(new HashMap<>());
        }
        getRequirements().put(key, value);
    }

    public Object removeRequirement(String key) {
        if (null == getRequirements())
            return null;
        return getRequirements().remove(key);
    }

}
