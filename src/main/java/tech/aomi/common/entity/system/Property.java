package tech.aomi.common.entity.system;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/9/5
 */
@Getter
@Setter
public class Property implements java.io.Serializable {

    private static final long serialVersionUID = -640187267532576374L;

    /**
     * 字段名
     */
    private String name;

    /**
     * 描述
     */
    private String describe;

}
