package tech.aomi.common.entity.game;

public interface Player {


    /**
     * 获取玩家等级
     *
     * @return 玩家等级
     */
    Integer getLevel();

    /**
     * 获取当前的经验
     *
     * @return 经验值
     */
    Long getExperience();

}
