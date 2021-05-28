package tech.aomi.common.entity.system;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Set;

/**
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/9/5
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Rule {

    private static final long serialVersionUID = 2910119541516593746L;

    @DBRef
    private Resource resource;

    @DBRef
    private Set<Permission> permissions;

    /**
     * 可访问的资源
     */
    private Set<String> properties;
}
