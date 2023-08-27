package tech.aomi.common.entity.game;

public enum Status {
    /**
     * 任务已创建但尚未被玩家接受。
     */
    PENDING,
    /**
     * 任务已被玩家接受并正在进行中。
     */
    IN_PROGRESS,
    /**
     * 任务已被玩家完成
     */
    COMPLETED,
    /**
     * 玩家放弃了正在进行中的任务。
     */
    ABANDONED,
    /**
     * 任务已经过期
     */
    EXPIRATION
}
