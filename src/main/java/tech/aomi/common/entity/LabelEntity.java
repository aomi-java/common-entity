package tech.aomi.common.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Sean createAt 2021/7/6
 */
public interface LabelEntity extends java.io.Serializable {

    Map<String, Object> getLabels();

    void setLabels(Map<String, Object> labels);

    default Object getLabel(String key) {
        return Optional.ofNullable(getLabels()).map(labels -> labels.get(key)).orElse(null);
    }

    default void addLabel(String key, Object value) {
        if (null == getLabels()) {
            setLabels(new HashMap<>());
        }
        getLabels().put(key, value);
    }

    default Object removeLabel(String key) {
        if (null == getLabels())
            return null;
        return getLabels().remove(key);
    }

}
