package tech.aomi.common.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StringIdAbstractEntity implements java.io.Serializable {

    private static final long serialVersionUID = -3960561818708256504L;

    private String id;

    public StringIdAbstractEntity() {
    }

    public StringIdAbstractEntity(String id) {
        this.id = id;
    }

}
