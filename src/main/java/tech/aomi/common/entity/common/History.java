package tech.aomi.common.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author Sean createAt 2018/12/10
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class History implements Serializable {

    private static final long serialVersionUID = -2755275798724694602L;

    private String actionType;

    /**
     * 操作时间
     */
    private Instant actionAt;

    private String describe = "";

    public History(String describe) {
        this("DEFAULT", Instant.now(), describe);
    }

    public History(String actionType, String describe) {
        this(actionType, Instant.now(), describe);
    }

    public History(Instant actionAt, String describe) {
        this("DEFAULT", actionAt, describe);
    }

}
