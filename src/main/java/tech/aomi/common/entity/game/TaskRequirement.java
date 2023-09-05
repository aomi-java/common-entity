package tech.aomi.common.entity.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 任务要求和
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequirement implements java.io.Serializable {

    /**
     * 要求
     */
    private String key;

    /**
     * 要求值
     */
    private Number value;

}
