package tech.aomi.common.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

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
    private Date actionAt;

    private String describe = "";

    public History(String describe) {
        this("DEFAULT", new Date(), describe);
    }

    public History(String actionType, String describe) {
        this(actionType, new Date(), describe);
    }

    public History(Date actionAt, String describe) {
        this("DEFAULT", actionAt, describe);
    }

}
