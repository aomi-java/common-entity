package tech.aomi.common.entity.media;

import lombok.Getter;
import lombok.Setter;

/**
 * 媒体信息
 *
 * @author Sean createAt 2021/8/21
 */
@Getter
@Setter
public class Media implements java.io.Serializable {

    private static final long serialVersionUID = 6268679931026060385L;

    /**
     * 媒体类型
     */
    private Type type;

    /**
     * 媒体地址
     */
    private String source;

    /**
     * 缩略图
     */
    private String thumbnail;

    /**
     * 封面
     */
    private String cover;

    /**
     * 中等大小
     */
    private String medium;
}
