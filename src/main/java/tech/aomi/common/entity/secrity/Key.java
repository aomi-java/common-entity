package tech.aomi.common.entity.secrity;

import lombok.Data;

/**
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/7/2
 */
@Data
public class Key implements java.io.Serializable {

    private static final long serialVersionUID = -96827481124699474L;

    /**
     * 公钥
     */
    private String publicKey;

    /**
     * 私钥
     */
    private String privateKey;

    /**
     * 其他安全密钥
     */
    private String secretKey;
}
