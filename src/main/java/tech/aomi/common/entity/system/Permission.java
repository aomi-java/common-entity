package tech.aomi.common.entity.system;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/8/24
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = {"describe"})
public class Permission implements java.io.Serializable {

    private static final long serialVersionUID = -7498838069923113147L;

    private String id;

    /**
     * 权限动作
     */
    private String method;

    /**
     * 资源uri
     */
    private String uri;

    /**
     * 权限描述
     */
    private String describe;

    /**
     * 资源ID
     */
    private String resourceId;

    @DBRef
    private Resource resource;

}
