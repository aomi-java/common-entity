package tech.aomi.common.entity.form;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 表单字段
 *
 * @author Sean(sean.snow @ live.com) Create At 2019-11-12
 */
@Getter
@Setter
public class Field implements java.io.Serializable {

    private static final long serialVersionUID = 62959570141553276L;

    private Type type = Type.TEXT;

    /**
     * 显示的文字
     */
    private String label;
    /**
     * 实际提交对象key
     */
    private String name;

    /**
     * 当type为select时存在
     */
    private List<Option> options;

}
