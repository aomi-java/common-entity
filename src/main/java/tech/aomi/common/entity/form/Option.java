package tech.aomi.common.entity.form;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Sean(sean.snow @ live.com) Create At 2019-11-12
 */
@Getter
@Setter
public class Option implements java.io.Serializable {

    private static final long serialVersionUID = -221229925856666788L;

    private String label;

    private String value;
}
