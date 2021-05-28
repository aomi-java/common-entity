package tech.aomi.common.entity.system;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * 资源信息
 *
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/8/24
 */
@Getter
@Setter
public class Resource implements java.io.Serializable {

    private static final long serialVersionUID = 9189320009401502147L;

    /**
     * id
     */
    private String id;

    /**
     * 资源描述
     */
    private String describe;

    /**
     * 资源属性
     */
    private Set<Property> properties;

}
