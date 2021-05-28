package tech.aomi.common.entity.address;

import lombok.Getter;
import lombok.Setter;


/**
 * 通用的属性 地址信息
 *
 * @author 田尘殇(Sean sean.snow @ live.com)
 * date 2015/4/26-10:15
 */
@Getter
@Setter
public class Address implements java.io.Serializable {

    private static final long serialVersionUID = 21590844759998808L;

    /**
     * 国家名字
     */
    private String country;

    private String countryCode;

    /**
     * 省份
     */
    private String province;

    private String provinceCode;

    /**
     * 城市
     */
    private String city;

    private String cityCode;

    /**
     * 县
     */
    private String county;

    private String countyCode;

    /**
     * 街道信息
     */
    private String street;

    private String zipCode;

}
