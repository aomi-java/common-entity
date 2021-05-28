package tech.aomi.common.entity.address;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Sean(sean.snow @ live.com) createAt 17-12-21.
 */
@Data
public class Position implements Serializable {

    private static final long serialVersionUID = -129369896092051667L;

    private Double timestamp;

    private Coords coords;

    @Data
    public static class Coords implements Serializable {

        private static final long serialVersionUID = 7962984659762293873L;

        private Integer accuracy;

        private Integer altitude;

        private Integer altitudeAccuracy;

        private Double latitude;

        private Double longitude;

        private Integer speed;
    }
}
