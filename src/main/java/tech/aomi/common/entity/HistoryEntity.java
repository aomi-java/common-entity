package tech.aomi.common.entity;

import tech.aomi.common.entity.common.History;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Sean createAt 2021/7/6
 */
public interface HistoryEntity extends java.io.Serializable {

    List<History> getHistories();

    void setHistories(List<History> histories);

    default void addHistory(String describe) {
        addHistory(Instant.now(), describe);
    }

    default void addHistory(Instant actionAt, String describe) {
        addHistory(new History(actionAt, describe));
    }

    default void addHistory(History history) {
        if (null == getHistories()) {
            setHistories(new ArrayList<>());
        }
        getHistories().add(history);
    }

}
