package tech.aomi.common.entity.bank;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 银行枚举信息
 * <p>
 * 我国银行分为中央银行、政策性银行、国有商业银行、股份制商业银行、地方性商业银行等几大类。
 * 1、中央银行
 * 中央银行是国家中居主导地位的金融中心结构，负责制定并执行国家货币信用政策，干预和调控国家经济发展，
 * 中央银行独具货币发行权，实行金融监管，不对个人和企业办理银行业务。我国的中央银行仅有一家，即中国人民银行。
 * <p>
 * 2、政策性银行
 * 政策性银行是由政府创立，专门为贯彻、配合政府社会经济政策或意图，在特定业务领域开展直接或间接的金融业务，
 * 非盈利目的专业性金融机构，充当政府发展经济、促进社会进步、进行宏观经济管理的工具。包括：国家开发银行、中国进出口银行、
 * 中国农业发展银行。国家开发银行是全球最大的开发性金融机构，中国最大的对外投融资合作银行、中国长期信贷银行和债券银行（2015年3月从政策性银行剥离，成为开发性金融机构
 * <p>
 * 3、国有商业银行
 * 国有商业银行，是由国家（财政部、中央汇金公司）直接管控的大型商业银行。包括：中国工商银行、中国农业银行、中国银行、中国建设银行（四大银行）、交通银行、中国邮政储蓄银行。
 * <p>
 * 4、全国性质的股份制商业银行
 * 股份制商业银行是相对国有商业银行公有制性质的,股份制商业银行属于股份制,有许多投资资金在里面，换句话说，就是非国有资本参股银行。
 * 包括：招商银行、浦发银行、中信银行、中国光大银行、华夏银行、中国民生银行、广发银行、兴业银行、平安银行、浙商银行、恒丰银行、渤海银行（十二大股份制商业银行）
 * <p>
 * 5、城市商业银行
 * 城市商业银行是中国银行业的特殊群体，前身是20世纪80年代设立的城市信用社，业务定位为中小企业提供金融支持，为地方经济搭桥铺路。
 * 严格来说，城市商业银行属于商业银行的一种，我国共有144家城市商业银行。
 * 包括：北京银行、上海银行、江苏银行、南京银行、宁波银行等。
 * <p>
 * 6、农村信用社
 * 农村信用合作社是由中国人民银行批准、社员入股组成的农村合作金融机构、主要任务是筹集农村闲散资金，为农业、农民和农村经济发展提供金融服务。我国共有2265家农村信用社。
 * <p>
 * 7、农村商业银行
 * 农村商业银行，是由地方农民、农村工商户、企业法人和其他经济组织共同入股组成的股份制的地方性金融机构。我国共有212家农村商业银行和190家农村合作银行。
 * <p>
 * 8、村镇银行
 * 村镇银行是由中国银行业监督管理委员会批准，由境内外金融机构、境内非金融机构企业法人、境内自然人出资，在农村地区设立的银行业金融机构，主要职责为当地农民、农业和农村经济发展提供金融服务我国共有635家村镇银行。
 *
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2017/2/24
 */
public enum Bank {

    // 国有银行 start

    /**
     * 交通银行
     */
    BCM("交通银行"),

    /**
     * 农业银行
     */
    ABC("农业银行"),

    /**
     * 中国银行
     */
    BOC("中国银行"),

    /**
     * 工商银行
     */
    ICBC("工商银行"),

    /**
     * 建设银行
     */
    CCB("建设银行"),

    /**
     * 中国邮政储蓄银行
     */
    PSBC("中国邮政储蓄银行"),

    // 国有银行 end


    // 全国性股份制商业银行 start

    /**
     * 中信银行
     */
    CITIC("中信银行"),

    /**
     * 平安银行
     */
    PING_AN_BANK("平安银行"),

    /**
     * 招商银行
     */
    CMB("招商银行"),

    /**
     * 广东发展银行
     */
    GDB("广东发展银行"),

    /**
     * 上海浦东发展银行
     */
    SPDB("上海浦东发展银行"),

    /**
     * 华夏银行
     */
    HXB("华夏银行"),

    /**
     * 中国光大银行
     */
    CEB("中国光大银行"),

    /**
     * 兴业银行
     */
    CIB("兴业银行"),

    /**
     * 中国民生银行
     */
    CMBC("中国民生银行"),

    XIB("厦门国际银行"),

    // 全国性股份制商业银行 end


    // 外资银行start

    /**
     * 花旗银行
     */
    CITI("花旗银行"),

    /**
     * 渣打银行
     */
    SCB("渣打银行"),

    /**
     * 东亚银行
     */
    BEA("东亚银行"),

    /**
     * 恒生银行
     */
    HANG_SENG("恒生银行"),

    /**
     * 中信银行国际
     */
    CITIC_INTERNATIONAL("中信银行国际"),

    /**
     * 大新银行
     */
    DAH_SING("大新银行"),

    /**
     * 南洋商业银行
     */
    NCB("南洋商业银行"),

    /**
     * 汇丰银行
     */
    HSBC("汇丰银行"),

    // 外资银行end

    //
    // 地方银行 start
    //


    /**
     * 苏州银行
     */
    SZCB("苏州银行"),

    /**
     * 广州银行
     */
    GZCB("广州银行"),

    /**
     * 上海银行
     */
    SHCB("上海银行"),

    /**
     * 宁波银行
     */
    NBCB("宁波银行"),
    /**
     * 宁波通商银行
     */
    NINGBOCB("宁波通商银行"),

    /**
     * 宁波东海银行
     */
    NDHB("宁波东海银行"),

    /**
     * 1. 历史名称: 包商银行
     * 蒙商银行
     */
    BSB("蒙商银行"),

    /**
     * 江苏银行
     */
    JSBC("江苏银行"),

    /**
     * 江南农村商业银行
     */
    JNRCB("江南农村商业银行"),

    /**
     * 江苏长江商业银行
     */
    JSCJCB("江苏长江商业银行"),

    /**
     * 江阴农商银行
     */
    JYRCB("江阴农商银行"),

    /**
     * 哈尔滨银行
     */
    HRBCB("哈尔滨银行"),

    /**
     * 北京银行
     */
    BOB("北京银行"),

    /**
     * 杭州银行
     */
    HZCB("杭州银行"),

    /**
     * 上海农商银行
     */
    SRCB("上海农商银行"),

    /**
     * 温州银行
     */
    WZCB("温州银行"),

    /**
     * 徽商银行
     */
    HSCB("徽商银行"),

    /**
     * 重庆银行
     */
    CQCB("重庆银行"),

    /**
     * 重庆农村商业银行
     */
    CQRCB("重庆农村商业银行"),

    /**
     * 重庆三峡银行
     */
    CCQTGB("重庆三峡银行"),

    /**
     * 汉口银行
     */
    HKBC("汉口银行"),

    /**
     * 南京银行
     */
    NJCB("南京银行"),

    /**
     * 盛京银行
     */
    SJBC("盛京银行"),

    /**
     * 大连银行
     */
    DLCB("大连银行"),

    /**
     * 天津银行
     */
    TCCB("天津银行"),

    /**
     * 北京农商银行
     */
    BJRCB("北京农商银行"),

    /**
     * 浙江稠州商业银行
     */
    CZCB("浙江稠州商业银行"),

    /**
     * 威海市商业银行
     */
    WHCCB("威海市商业银行"),

    /**
     * 富滇银行
     */
    FUDIANBC("富滇银行"),

    /**
     * 广州农村商业银行
     */
    GRCB("广州农村商业银行"),


    /**
     * 河北银行
     */
    HEBBANK("河北银行"),

    /**
     * 宁夏银行
     */
    YCCCB("宁夏银行"),

    /**
     * 青海银行
     */
    BANKQH("青海银行"),

    /**
     * 青海省农村信用社联合社
     */
    QHRCCB("青海省农村信用社联合社"),

    /**
     * 珠海华润银行
     */
    CRBANK("珠海华润银行"),

    /**
     * 珠海市农村商业银行
     */
    ZRCB("珠海市农村商业银行"),

    /**
     * 上饶银行
     */
    SRBANK("上饶银行"),

    /**
     * 天津农商银行
     */
    TRCBANK("天津农商银行"),

    /**
     * 潍坊银行
     */
    WFCCB("潍坊银行"),

    /**
     * 齐鲁银行
     */
    QLBCHINA("齐鲁银行"),

    /**
     * 锦州银行
     */
    BANK_OF_JINZHOU("锦州银行"),

    /**
     * 九江银行
     */
    JJCCB("九江银行"),

    /**
     * 湖州银行
     */
    HZCCB("湖州银行"),

    /**
     * 台州银行
     */
    TZBANK("台州银行"),

    /**
     * 广东南粤银行
     */
    GDNYBANK("广东南粤银行"),

    /**
     * 兰州银行
     */
    LZBANK("兰州银行"),

    /**
     * 常熟农商银行
     */
    CSRCB("常熟农商银行"),

    /**
     * 顺德农村商业银行
     * 广东顺德农村商业银行
     */
    SDEBANK("顺德农村商业银行"),

    /**
     * 江西银行
     */
    NCCBANK("江西银行"),

    /**
     * 江西省农村信用社联合社
     * 江西省农村信用社
     */
    JXNXS("江西省农村信用社联合社"),

    /**
     * 泉州银行
     */
    QZCCBANK("泉州银行"),

    /**
     * 青岛银行
     */
    QDCCB("青岛银行"),

    /**
     * 莱商银行
     */
    LSBANKCHINA("莱商银行"),

    /**
     * 赣州银行
     */
    GZCCB("赣州银行"),

    /**
     * 国家开发银行
     */
    CDB("国家开发银行"),

    /**
     * 恒丰银行
     */
    HFB("恒丰银行"),

    /**
     * 烟台银行
     */
    BANK_OF_YANTAI("烟台银行"),

    /**
     * 浙商银行
     */
    CZBANK("浙商银行"),

    /**
     * 渤海银行
     */
    CBHB("渤海银行"),

    /**
     * 友利银行
     */
    WOORI("友利银行"),

    /**
     * 新韩银行
     */
    SHINHAN("新韩银行"),

    /**
     * 韩亚银行
     */
    HANA("韩亚银行"),

    /**
     * 企业银行
     */
    IBK("企业银行"),

    /**
     * 厦门银行
     */
    XMCCB("厦门银行"),

    /**
     * 福建海峡银行
     */
    FJHXBANK("福建海峡银行"),

    /**
     * 福建省农村信用社联合社
     */
    FJNX("福建省农村信用社联合社"),

    /**
     * 吉林银行
     */
    JLBANK("吉林银行"),

    /**
     * 吉林九台农村商业银行
     * 九台农商银行
     */
    JTRCB("吉林九台农村商业银行"),

    /**
     * 长春发展农村商业银行
     */
    CCCDCB("长春发展农村商业银行"),

    /**
     * 洛阳银行
     */
    BANK_OF_LUOYANG("洛阳银行"),

    /**
     * 东莞银行
     */
    BANK_OF_DONGGUAN("东莞银行"),

    /**
     * 乌鲁木齐市商业银行
     * 乌鲁木齐银行
     */
    UCCB("乌鲁木齐银行"),

    /**
     * 绍兴银行
     */
    SXCCB("绍兴银行"),

    /**
     * 成都银行
     */
    BOCD("成都银行"),

    /**
     * 成都农商银行
     * 成都农村商业银行股份有限公司
     */
    CDRCB("成都农商银行"),

    /**
     * 临商银行
     */
    LSBC("临商银行"),

    /**
     * 郑州银行
     */
    ZZBANK("郑州银行"),

    /**
     * 葫芦岛银行
     */
    BANK_OF_HULUDAO("葫芦岛银行"),

    /**
     * 齐商银行
     */
    QSBANK("齐商银行"),

    /**
     * 贵阳银行
     */
    GYCCB("贵阳银行"),

    /**
     * 晋商银行
     */
    JSHBANK("晋商银行"),

    /**
     * 日照银行
     */
    BANK_OF_RIZHAO("日照银行"),

    /**
     * 鞍山银行
     */
    BANK_OF_ANSHAN("鞍山银行"),

    /**
     * 长沙银行
     */
    CSCB("长沙银行"),

    /**
     * 阜新银行
     */
    FUXINBANK("阜新银行"),

    /**
     * 嘉兴银行
     */
    JXCCB("嘉兴银行"),

    /**
     * 廊坊银行
     */
    LCCB("廊坊银行"),

    /**
     * 浙江泰隆商业银行
     */
    ZJTLCB("浙江泰隆商业银行"),

    /**
     * 浙江农信
     */
    ZJRC("浙江农信"),

    /**
     * 内蒙古银行
     */
    BOIMC("内蒙古银行"),

    /**
     * 沧州银行
     */
    CZCCB("沧州银行"),

    /**
     * 攀枝花市商业银行
     */
    PZHCCB("攀枝花市商业银行"),

    /**
     * 绵阳市商业银行
     */
    MYSYYH("绵阳市商业银行"),

    /**
     * 张家口银行
     * 张家口市商业银行
     */
    ZJKCCB("张家口市商业银行"),

    /**
     * 龙江银行
     */
    BANK_OF_LONGJIANG("龙江银行"),

    /**
     * 柳州银行
     */
    LZCCB("柳州银行"),

    /**
     * 长城华西银行
     * 德阳银行
     */
    GWBANK("长城华西银行/德阳银行"),

    /**
     * 晋城银行
     */
    BANK_OF_JINCHENG("晋城银行"),

    /**
     * 承德银行
     * 承德商业银行
     */
    BANK_OF_CHEGNDE("承德银行"),

    /**
     * 德州银行
     */
    BANK_OF_DEZHOU("德州银行"),

    /**
     * 邯郸银行
     */
    HDCB("邯郸银行"),

    /**
     * 浙江民泰商业银行
     */
    BANK_OF_MINTAI("浙江民泰商业银行"),

    /**
     * 东营银行
     */
    BANK_OF_DONGYING("东营银行"),

    /**
     * 泰安银行
     */
    TACCB("泰安银行"),

    /**
     * 自贡市银行
     */
    BANK_OF_ZIGONG("自贡市银行"),

    /**
     * 鄂尔多斯银行
     */
    ORDOS("鄂尔多斯银行"),

    /**
     * 济宁银行
     */
    BANK_OF_JINING("济宁银行"),

    /**
     * 长安银行
     */
    CCAB("长安银行"),

    /**
     * 昆仑银行
     */
    KLB("昆仑银行"),

    /**
     * 邢台银行
     */
    BANK_OF_XINGTAI("邢台银行"),

    /**
     * 营口沿海银行
     */
    COASTAL("营口沿海银行"),

    /**
     * 营口银行
     */
    BANK_OF_YINGKOU("营口银行"),

    /**
     * 常熟农村商业银行
     */
    CSRC("常熟农村商业银行"),

    /**
     * 湖北农信
     */
    HBXH("湖北省农村信用社联合社"),

    /**
     * 湖北银行
     */
    BANK_OF_HUBEI("湖北银行"),
    /**
     * 武汉农村商业银行
     */
    WHRCB("武汉农村商业银行"),

    /**
     * 山东省农村信用社联合社
     */
    SDNXS("山东省农村信用社联合社"),

    /**
     * 东莞农村商业银行
     */
    DRC("东莞农村商业银行"),

    /**
     * 张家港农村商业银行
     */
    ZRC("张家港农村商业银行"),

    /**
     * 天津农村商业银行
     */
    TRC("天津农村商业银行"),

    /**
     * 江苏省农村信用社联合社
     */
    JPRC("江苏省农村信用社联合社"),

    /**
     * 昆山农村商业银行
     */
    KSRCB("昆山农村商业银行"),
    /**
     * 太仓农村商业银行
     */
    TCRCB("太仓农村商业银行"),
    /**
     * 无锡农村商业银行
     */
    WXRCB("无锡农村商业银行"),
    /**
     * 苏州农村商业银行
     * 苏州农商银行
     * 吴江农村商业银行
     */
    WJRCB("苏州农商银行"),
    /**
     * 黄河农村商业银行
     */
    YRRCB("黄河农村商业银行"),

    /**
     * 安徽省农村信用社联合社
     */
    AHRCU("安徽省农村信用社联合社"),

    /**
     * 海南省农村信用社
     * 海口农村商业银行
     */
    HNRC("海南省农村信用社/海口农村商业银行"),

    /**
     * 海南银行
     */
    HNB("海南银行"),

    /**
     * 广西北部湾银行
     */
    BANK_OF_GUANGXI_BEIBU("广西北部湾银行"),

    /**
     * 广西农村信用社联合社
     */
    GXRC("广西农村信用社联合社"),

    /**
     * 西安银行
     */
    XACB("西安银行"),

    /**
     * 中原银行
     */
    BANK_OF_ZHONGYUAN("中原银行"),
    /**
     * 桂林银行
     */
    GUILINBANK("桂林银行"),

    /**
     * 华融湘江银行
     */
    BANK_OF_HRXJ("华融湘江银行"),
    /**
     * 湖南农村信用社联合社
     */
    HNNXS("湖南农村信用社联合社"),

    /**
     * 宁夏黄河农村商业银行
     */
    BANK_OF_YELLOWRIVER("宁夏黄河农村商业银行"),

    GZRC("贵州省农村信用社联合社"),

    /**
     * 深圳农村商业银行
     */
    SZRC("深圳农村商业银行"),

    /**
     * 四川省农村信用社联合社
     */
    SCRCU("四川省农村信用社联合社"),
    /**
     * 天津滨海农村商业银行
     */
    TJBHB("天津滨海农村商业银行"),

    /**
     * 云南省农村信用社
     * 昆明农联社
     */
    YNRCC("云南省农村信用社"),
    /**
     * 新疆农村信用社联合社
     * 新疆维吾尔自治区农村信用社联合
     */
    XJRCCB("新疆农村信用社联合社"),

    /**
     * 鄞州银行
     */
    BEEB("宁波鄞州农村商业银行"),

    /**
     * 石嘴山银行
     */
    SZSCCB("石嘴山银行"),

    /**
     * 陕西省农村信用社联合社
     */
    SXNXS("陕西省农村信用社联合社"),

    /**
     * 大同银行
     */
    CHNDTB("大同银行"),

    /**
     * 晋中银行
     */
    JINZHONGBANK("晋中银行"),

    /**
     * 长治银行
     */
    SX_CZCCB("长治银行"),

    /**
     * 阳泉市商业银行
     */
    YQCCB("阳泉市商业银行"),

    /**
     * 甘肃银行
     */
    GSBANK("甘肃银行"),

    /**
     * 甘肃省农村信用社联合社
     */
    GSRCU("甘肃省农村信用社联合社"),

    /**
     * 乌海银行
     */
    BANK_OF_WUHAI("乌海银行"),

    /**
     * 本溪银行
     */
    BANK_OF_BENXI("本溪银行"),

    /**
     * 朝阳银行
     */
    CYCB("朝阳银行"),

    /**
     * 丹东银行
     */
    BANK_OF_DANDONG("丹东银行"),

    /**
     * 抚顺银行
     */
    BANK_OF_FUSHUN("抚顺银行"),

    /**
     * 辽宁省农村信用社
     */
    LNRCC("辽宁省农村信用社"),

    /**
     * 辽阳银行
     */
    BANK_OF_LIAOYANG("辽阳银行"),

    /**
     * 盘锦商行
     */
    BANK_OF_PANJIN("盘锦商行"),

    /**
     * 铁岭银行
     */
    BANK_OF_TIELING("铁岭银行"),

    /**
     * 广东华兴银行
     */
    GDHXB("广东华兴银行"),
    /**
     * 广东省农村信用社联合社
     */
    GDRCU("广东省农村信用社联合社"),

    /**
     * 湖南三湘银行
     */
    CSXB("湖南三湘银行"),
    /**
     * 达州银行
     * 达州市商业银行
     */
    DZCCB("达州银行/达州市商业银行"),
    /**
     * 乐山商业银行
     */
    LSCCB("乐山商业银行"),

    /**
     * 凉山州商业银行
     */
    LSZSH("凉山州商业银行"),
    /**
     * 泸州银行
     * 泸州市商业银行
     */
    SC_LZCCB("泸州银行/泸州市商业银行"),

    /**
     * 四川天府银行
     */
    BANK_OF_TF("四川天府银行"),
    /**
     * 遂宁银行
     */
    SNXW("遂宁银行"),

    /**
     * 雅安市商业银行
     */
    YACCB("雅安市商业银行"),
    /**
     * 宜宾市商业银行
     */
    YBCCB("宜宾市商业银行"),

    /**
     * 贵州银行
     */
    BANK_OF_GUIZHOU("贵州银行"),

    /**
     * 金华银行
     */
    JHCCB("金华银行"),

    /**
     * 黑龙江省农村信用社联合社
     */
    HLJRCC("黑龙江省农村信用社联合社"),
    /**
     * 吉林省农村信用社联合社
     */
    JLRCB("吉林省农村信用社联合社"),
    /**
     * 大连农商行
     */
    DLRCB("大连农商行"),
    /**
     * 曲靖市商业银行
     */
    QJCCB("曲靖市商业银行"),
    /**
     * 云南红塔银行
     */
    BANK_OF_HONGTA("云南红塔银行"),
    /**
     * 哈密市商业银行
     */
    HMCCB("哈密市商业银行"),
    /**
     * 库尔勒市商业银行
     */
    XJKCCB("库尔勒市商业银行"),
    /**
     * 保定银行
     */
    BANK_OF_BAODING("保定银行"),

    /**
     * 河北省农村信用社联合社
     */
    HBRCB("河北省农村信用社联合社"),
    /**
     * 衡水银行
     */
    BANK_OF_HENGSHUI("衡水银行"),
    /**
     * 秦皇岛市商业银行
     */
    QINHUANGDAOCCB("秦皇岛市商业银行"),
    /**
     * 唐山银行
     */
    BOTS("唐山银行"),
    /**
     * 河南省农村信用社联合社
     */
    HNRCB("河南省农村信用社联合社"),
    /**
     * 焦作中旅银行
     */
    JZCTB("焦作中旅银行"),
    /**
     * 平顶山银行
     */
    BANK_OF_PINGDINGSHAN("平顶山银行"),
    /**
     * 玉山银行
     */
    ESUNB("玉山银行"),
    /**
     * 西藏银行
     */
    XZBC("西藏银行"),
    /**
     * 辽宁辰州汇通村镇银行
     */
    BANK_OF_CZHT("辽宁辰州汇通村镇银行"),
    /**
     * 辽宁大石桥隆丰村镇银行
     */
    BANK_OF_DSQLF("辽宁大石桥隆丰村镇银行"),
    /**
     * 武汉众邦银行
     */
    ZBANK("武汉众邦银行"),
    /**
     * 陕西秦农农村商业银行
     */
    QNRCB("陕西秦农农村商业银行"),

    /**
     * 尧都农村商业银行
     * 临汾市尧都区农村信用合作联社
     */
    YDRCB("尧都农村商业银行"),

    /**
     * 山西省农村信用社
     */
    SHANXIRCB("山西省农村信用社")


    //
    ;


    public static final Map<Bank, HeadOffice> headOffice = new HashMap<>();

    /**
     * 发卡行代码对应内部的银行代码
     */
    public static final Map<String, HeadOffice> HEAD_OFFICE = new HashMap<String, HeadOffice>() {
        private static final long serialVersionUID = -3820252700199680515L;

        {
            put("01000000", new HeadOffice(PSBC, "403100000004"));
            put("01009999", new HeadOffice(PSBC, "403100000004"));
            put("61000000", new HeadOffice(PSBC, "403100000004"));
            put("01020000", new HeadOffice(ICBC, "102100004951"));
            put("01020344", new HeadOffice(ICBC, "102100004951"));
            put("01020276", new HeadOffice(ICBC, "102100004951"));
            put("01030000", new HeadOffice(ABC, "103100000018"));
            put("01030001", new HeadOffice(ABC, "103100000018"));
            put("01040000", new HeadOffice(BOC, "104100000004"));
            put("01050000", new HeadOffice(CCB, "105100000017"));
            put("01050001", new HeadOffice(CCB, "105100000017"));
            put("01059999", new HeadOffice(CCB, "105100000017"));
            put("03010000", new HeadOffice(BCM, "301290000007"));
            put("03020000", new HeadOffice(CITIC, "302100011000"));
            put("63020000", new HeadOffice(CITIC, "302100011000"));
            put("03030000", new HeadOffice(CEB, "303100000006"));
            put("63030000", new HeadOffice(CEB, "303100000006"));
            put("03040000", new HeadOffice(HXB, "304100040000"));
            put("63040000", new HeadOffice(HXB, "304100040000"));
            put("03050000", new HeadOffice(CMBC, "305100000013"));
            put("03050001", new HeadOffice(CMBC, "305100000013"));
            put("03060000", new HeadOffice(GDB, "306581000003"));
            put("03070000", new HeadOffice(PING_AN_BANK, "307584007998"));
            put("03070010", new HeadOffice(PING_AN_BANK, "307584007998"));
            put("04100000", new HeadOffice(PING_AN_BANK, "307584007998"));
            put("04105840", new HeadOffice(PING_AN_BANK, "307584007998"));
            put("05105840", new HeadOffice(PING_AN_BANK, "307584007998"));
            put("06105840", new HeadOffice(PING_AN_BANK, "307584007998"));
            put("03080000", new HeadOffice(CMB, "308584000013"));
            put("03080010", new HeadOffice(CMB, "308584000013"));
            put("03090000", new HeadOffice(CIB, "309391000011"));
            put("03090010", new HeadOffice(CIB, "309391000011"));
            put("03100000", new HeadOffice(SPDB, "310290000013"));
            put("63100000", new HeadOffice(SPDB, "310290000013"));
            put("03110000", new HeadOffice(HFB, "315456000105"));
            put("63110000", new HeadOffice(HFB, "315456000105"));
            put("03131100", new HeadOffice(TCCB, "313110000017"));
            put("04341100", new HeadOffice(TCCB, "313110000017"));
            put("04341101", new HeadOffice(TCCB, "313110000017"));
            put("65191100", new HeadOffice(TRCBANK, "317110010019"));
            put("04044560", new HeadOffice(BANK_OF_YANTAI, "313456000108"));
            put("03134580", new HeadOffice(WFCCB, "313458000013"));
            put("03160000", new HeadOffice(CZBANK, "316331000018"));
            put("03160001", new HeadOffice(CZBANK, "316331000018"));
            put("03170000", new HeadOffice(CBHB, "318110000014"));
            put("03170003", new HeadOffice(CBHB, "318110000014"));
            put("03270000", new HeadOffice(WOORI, "593100000020"));
            put("03280000", new HeadOffice(SHINHAN, "595100000007"));
            put("03290000", new HeadOffice(HANA, "597100000014"));
            put("03360000", new HeadOffice(IBK, "596110000013"));
            put("04010000", new HeadOffice(SHCB, "313290000017"));
            put("04010001", new HeadOffice(SHCB, "313290000017"));
            put("04012900", new HeadOffice(SHCB, "313290000017"));
            put("04012902", new HeadOffice(SHCB, "313290000017"));
            put("04023930", new HeadOffice(XMCCB, "313393080005"));
            put("64020000", new HeadOffice(XMCCB, "313393080005"));
            put("04031000", new HeadOffice(BOB, "313100000013"));
            put("64031000", new HeadOffice(BOB, "313100000013"));
            put("04053910", new HeadOffice(FJHXBANK, "313391080007"));
            put("65173900", new HeadOffice(FJNX, "402391000068"));
            put("04062410", new HeadOffice(JLBANK, "313241066661"));
            put("04062418", new HeadOffice(JLBANK, "313241066661"));
            put("04062419", new HeadOffice(JLBANK, "313241066661"));
            put("04083320", new HeadOffice(NBCB, "313332082914"));
            put("64083300", new HeadOffice(NBCB, "313332082914"));
            put("05803320", new HeadOffice(NINGBOCB, "313332090019"));
            put("05503320", new HeadOffice(NDHB, "313332040018"));
            put("04123330", new HeadOffice(WZCB, "313333007331"));
            put("05063330", new HeadOffice(WZCB, "313333007331"));
            put("04135810", new HeadOffice(GZCB, "313581000013"));
            put("64135810", new HeadOffice(GZCB, "313581000013"));
            put("04145210", new HeadOffice(HKBC, "313521000020"));
            put("04184930", new HeadOffice(BANK_OF_LUOYANG, "313493080539"));
            put("04202220", new HeadOffice(DLCB, "313222080002"));
            put("04202221", new HeadOffice(DLCB, "313222080002"));
            put("04221210", new HeadOffice(HEBBANK, "313121006888"));
            put("64221210", new HeadOffice(HEBBANK, "313121006888"));
            put("04233310", new HeadOffice(HZCB, "313331000014"));
            put("64233311", new HeadOffice(HZCB, "313331000014"));
            put("04240001", new HeadOffice(NJCB, "313301008887"));
            put("04243010", new HeadOffice(NJCB, "313301008887"));
            put("04256020", new HeadOffice(BANK_OF_DONGGUAN, "313602088017"));
            put("04270001", new HeadOffice(UCCB, "313881000019"));
            put("04278810", new HeadOffice(UCCB, "313881000019"));
            put("04283370", new HeadOffice(SXCCB, "313337009004"));
            put("04296510", new HeadOffice(BOCD, "313651099999"));
            put("64296510", new HeadOffice(BOCD, "313651099999"));
            put("65226510", new HeadOffice(CDRCB, "314651000000"));
            put("04314730", new HeadOffice(LSBC, "313473070018"));
            put("04332350", new HeadOffice(BANK_OF_HULUDAO, "313227600018"));
            put("04354910", new HeadOffice(ZZBANK, "313491000232"));
            put("64354910", new HeadOffice(ZZBANK, "313491000232"));
            put("04368710", new HeadOffice(YCCCB, "313871001000"));
            put("04360010", new HeadOffice(YCCCB, "313871001000"));
            put("04375850", new HeadOffice(CRBANK, "313585000061"));
            put("04384530", new HeadOffice(QSBANK, "313453001017"));
            put("64384530", new HeadOffice(QSBANK, "313453001017"));
            put("04392270", new HeadOffice(BANK_OF_JINZHOU, "313227000012"));
            put("64392270", new HeadOffice(BANK_OF_JINZHOU, "313227000012"));
            put("04403600", new HeadOffice(HSCB, "319361000013"));
            put("04403601", new HeadOffice(HSCB, "319361000013"));
            put("64403600", new HeadOffice(HSCB, "319361000013"));
            put("04416900", new HeadOffice(CQCB, "313653000013"));
            put("64416910", new HeadOffice(CQCB, "313653000013"));
            put("14136900", new HeadOffice(CQRCB, "314653000011"));
            put("15136900", new HeadOffice(CQRCB, "314653000011"));
            put("05426900", new HeadOffice(CCQTGB, "321653001008"));

            put("04422610", new HeadOffice(HRBCB, "313261068019"));
            put("64422610", new HeadOffice(HRBCB, "313261068019"));
            put("04437010", new HeadOffice(GYCCB, "313701098010"));
            put("64437010", new HeadOffice(GYCCB, "313701098010"));
            put("04478210", new HeadOffice(LZBANK, "313821001016"));
            put("64478210", new HeadOffice(LZBANK, "313821001016"));
            put("04484210", new HeadOffice(NCCBANK, "313421087506"));
            put("64484210", new HeadOffice(NCCBANK, "313421087506"));
            put("04491610", new HeadOffice(JSHBANK, "313161000017"));
            put("64491610", new HeadOffice(JSHBANK, "313161000017"));
            put("04504520", new HeadOffice(QDCCB, "313452060150"));
            put("64500000", new HeadOffice(QDCCB, "313452060150"));
            put("04554770", new HeadOffice(BANK_OF_RIZHAO, "313473200011"));
            put("04562230", new HeadOffice(BANK_OF_ANSHAN, "313223007007"));
            put("04588510", new HeadOffice(BANKQH, "313851000018"));
            put("64588510", new HeadOffice(BANKQH, "313851000018"));

            put("14498500", new HeadOffice(QHRCCB, "402851000016"));
            put("14498501", new HeadOffice(QHRCCB, "402851000016"));

            put("04593450", new HeadOffice(TZBANK, "313345001665"));
            put("04593451", new HeadOffice(TZBANK, "313345001665"));
            put("04615510", new HeadOffice(CSCB, "313551088886"));
            put("04615511", new HeadOffice(CSCB, "313551088886"));
            put("04634280", new HeadOffice(GZCCB, "313428076517"));
            put("04672290", new HeadOffice(FUXINBANK, "313229000008"));
            put("04703350", new HeadOffice(JXCCB, "313335081005"));
            put("04721460", new HeadOffice(LCCB, "313146000019"));
            put("04733450", new HeadOffice(ZJTLCB, "313345010019"));
            put("04741910", new HeadOffice(BOIMC, "313191000011"));
            put("64741910", new HeadOffice(BOIMC, "313191000011"));
            put("04753360", new HeadOffice(HZCCB, "313336000013"));
            put("04761430", new HeadOffice(CZCCB, "313143005157"));
            put("04791920", new HeadOffice(BSB, "313192000013"));
            put("04791921", new HeadOffice(BSB, "313192000013"));
            put("64814650", new HeadOffice(WHCCB, "313465000010"));
            put("04836560", new HeadOffice(PZHCCB, "313656000019"));
            put("04856590", new HeadOffice(MYSYYH, "313659000016"));
            put("04895910", new HeadOffice(GDNYBANK, "313591001001"));
            put("04901380", new HeadOffice(ZJKCCB, "313138000019"));
            put("64901380", new HeadOffice(ZJKCCB, "313138000019"));
            put("04922600", new HeadOffice(BANK_OF_LONGJIANG, "313264000013"));
            put("64922690", new HeadOffice(BANK_OF_LONGJIANG, "313264000013"));
            put("04956140", new HeadOffice(LZCCB, "313614000012"));
            put("64950000", new HeadOffice(LZCCB, "313614000012"));
            put("04974790", new HeadOffice(LSBANKCHINA, "313463400019"));
            put("04986580", new HeadOffice(GWBANK, "313658000014"));
            put("05031680", new HeadOffice(BANK_OF_JINCHENG, "313168000003"));
            put("05083000", new HeadOffice(JSBC, "313301099999"));
            put("05083001", new HeadOffice(JSBC, "313301099999"));
            put("05213000", new HeadOffice(JSBC, "313301099999"));
            put("14603040", new HeadOffice(JNRCB, "314304083006"));
            put("64603040", new HeadOffice(JNRCB, "314304083006"));
            put("04933160", new HeadOffice(JSCJCB, "313312300042"));
            put("14123020", new HeadOffice(JYRCB, "314302203008"));
            put("65023052", new HeadOffice(KSRCB, "314305206650"));
            put("14333050", new HeadOffice(TCRCB, "314305106644"));
            put("14333051", new HeadOffice(TCRCB, "314305106644"));
            put("14373020", new HeadOffice(WXRCB, "314305106644"));
            put("65373020", new HeadOffice(WXRCB, "314305106644"));
            put("05131410", new HeadOffice(BANK_OF_CHEGNDE, "313141052422"));
            put("65131410", new HeadOffice(BANK_OF_CHEGNDE, "313141052422"));
            put("05154680", new HeadOffice(BANK_OF_DEZHOU, "313468000015"));
            put("05171270", new HeadOffice(HDCB, "313127000013"));
            put("05253450", new HeadOffice(BANK_OF_MINTAI, "313345400010"));
            put("05253454", new HeadOffice(BANK_OF_MINTAI, "313345400010"));
            put("05274550", new HeadOffice(BANK_OF_DONGYING, "313455000018"));
            put("05284630", new HeadOffice(TACCB, "313463000993"));
            put("05303380", new HeadOffice(CZCB, "313338707013"));
            put("05326560", new HeadOffice(BANK_OF_ZIGONG, "313655091983"));
            put("05340001", new HeadOffice(ORDOS, "313205057830"));
            put("05342050", new HeadOffice(ORDOS, "313205057830"));
            put("05374610", new HeadOffice(BANK_OF_JINING, "313461000012"));
            put("05417900", new HeadOffice(CCAB, "313791030003"));
            put("05417901", new HeadOffice(CCAB, "313791030003"));
            put("05478820", new HeadOffice(KLB, "313882000012"));
            put("61130000", new HeadOffice(KLB, "313882000012"));
            put("05541310", new HeadOffice(BANK_OF_XINGTAI, "313131000016"));
            put("05722280", new HeadOffice(COASTAL, "313228060009"));
            put("14012900", new HeadOffice(SRCB, "322290000011"));
            put("65012900", new HeadOffice(SRCB, "322290000011"));
            put("14033055", new HeadOffice(CSRC, "314305506621"));
            put("64033055", new HeadOffice(CSRC, "314305506621"));
            put("14055810", new HeadOffice(GRCB, "314581000011"));
            put("65055810", new HeadOffice(GRCB, "314581000011"));
            put("14085883", new HeadOffice(SDEBANK, "314588000016"));
            put("65085883", new HeadOffice(SDEBANK, "314588000016"));
            put("14105200", new HeadOffice(HBXH, "402521000032"));
            put("05755200", new HeadOffice(BANK_OF_HUBEI, "313521006000"));
            put("05755202", new HeadOffice(BANK_OF_HUBEI, "313521006000"));
            put("14144500", new HeadOffice(SDNXS, "402451000010"));
            put("14156020", new HeadOffice(DRC, "402602000018"));
            put("05056020", new HeadOffice(DRC, "402602000018"));
            put("14163056", new HeadOffice(ZRC, "314305670002"));
            put("64163056", new HeadOffice(ZRC, "314305670002"));
            put("14011000", new HeadOffice(BJRCB, "402100000018"));
            put("14181000", new HeadOffice(BJRCB, "402100000018"));
            put("14181001", new HeadOffice(BJRCB, "402100000018"));
            put("14191100", new HeadOffice(TRC, "317110010019"));
            put("14243000", new HeadOffice(JPRC, "402301099998"));
            put("65243000", new HeadOffice(JPRC, "402301099998"));
            put("14283050", new HeadOffice(WJRCB, "314305400015"));
            put("14283054", new HeadOffice(WJRCB, "314305400015"));
            put("14303050", new HeadOffice(SZCB, "313305066661"));
            put("64303050", new HeadOffice(SZCB, "313305066661"));
            put("14468700", new HeadOffice(YRRCB, "402871099996"));
            put("65473600", new HeadOffice(AHRCU, "402361018886"));
            put("14473600", new HeadOffice(AHRCU, "402361018886"));
            put("14473601", new HeadOffice(AHRCU, "402361018886"));
            put("14486400", new HeadOffice(HNRC, "402641000014"));
            put("14630000", new HeadOffice(HNRC, "105641018092"));
            put("14636410", new HeadOffice(HNRC, "105641018092"));

            put("05886400", new HeadOffice(HNB, "313641099995"));

            put("64786110", new HeadOffice(BANK_OF_GUANGXI_BEIBU, "313611001018"));
            put("65264331", new HeadOffice(SRBANK, "313433076801"));
            put("03200000", new HeadOffice(BEA, "502290000006"));
            put("63200000", new HeadOffice(BEA, "502290000006"));
            put("63200001", new HeadOffice(BEA, "502290000006"));
            put("04447910", new HeadOffice(XACB, "313791001350"));
            put("64447910", new HeadOffice(XACB, "313791001350"));
            put("04643970", new HeadOffice(QZCCBANK, "313399100361"));
            put("04652280", new HeadOffice(BANK_OF_YINGKOU, "313261090012"));
            put("05075210", new HeadOffice(HKBC, "313653010014"));
            put("14293300", new HeadOffice(ZJRC, "402331000007"));
            put("14293301", new HeadOffice(ZJRC, "402331000007"));
            put("14315850", new HeadOffice(ZRCB, "402585001021"));
            put("64733450", new HeadOffice(ZJTLCB, "313345010019"));
            put("65864910", new HeadOffice(BANK_OF_ZHONGYUAN, "313491099996"));
            put("64916170", new HeadOffice(GUILINBANK, "313617000350"));
            put("65705500", new HeadOffice(BANK_OF_HRXJ, "313551070008"));
            put("05705500", new HeadOffice(BANK_OF_HRXJ, "313551070008"));
            put("14385500", new HeadOffice(HNNXS, "402551080008"));
            put("65385500", new HeadOffice(HNNXS, "402551080008"));
            put("03210001", new HeadOffice(HSBC, "501100000011"));
            put("64094510", new HeadOffice(QLBCHINA, "313451000019"));
            put("03220000", new HeadOffice(SCB, "671100000013"));
            put("03220001", new HeadOffice(SCB, "671100000013"));
            put("14468702", new HeadOffice(BANK_OF_YELLOWRIVER, "402871010022"));
            put("14367000", new HeadOffice(GZRC, "402701002999"));
            put("64367000", new HeadOffice(GZRC, "402701002999"));
            put("64040000", new HeadOffice(SZRC, "402614007156"));
            put("14040000", new HeadOffice(SZRC, "402614007156"));
            put("14526501", new HeadOffice(SCRCU, "402651020006"));
            put("65561100", new HeadOffice(TJBHB, "317110017123"));

            put("04170000", new HeadOffice(SJBC, "313242020011"));
            put("04170001", new HeadOffice(SJBC, "313242020011"));
            put("04172210", new HeadOffice(SJBC, "313242020011"));
            put("04172211", new HeadOffice(SJBC, "313242020011"));

            put("14436100", new HeadOffice(GXRC, "402611099974"));
            put("14436101", new HeadOffice(GXRC, "402611099974"));

            put("65097300", new HeadOffice(YNRCC, "402731053280"));
            put("14097310", new HeadOffice(YNRCC, "402731053280"));

            put("14448800", new HeadOffice(XJRCCB, "402881061690"));
            put("14448802", new HeadOffice(XJRCCB, "402881061690"));

            put("03190001", new HeadOffice(CITI, "531290088881"));
            put("03190002", new HeadOffice(CITI, "531290088881"));
            put("03190003", new HeadOffice(CITI, "531290088881"));

            put("65595210", new HeadOffice(WHRCB, "402521090019"));
            put("14105210", new HeadOffice(WHRCB, "402521090019"));

            put("14203320", new HeadOffice(BEEB, "402332010004"));
            put("14203323", new HeadOffice(BEEB, "402332010004"));

            put("65394200", new HeadOffice(JXNXS, "402421099990"));

            put("05438720", new HeadOffice(SZSCCB, "313872097457"));
            put("05438729", new HeadOffice(SZSCCB, "313872097457"));

            put("14427900", new HeadOffice(SXNXS, "402791000010"));
            put("14427901", new HeadOffice(SXNXS, "402791000010"));
            put("04871620", new HeadOffice(CHNDTB, "402791000010"));

            put("69551750", new HeadOffice(JINZHONGBANK, "313175000011"));
            put("05591750", new HeadOffice(JINZHONGBANK, "313175000011"));

            put("05121660", new HeadOffice(SX_CZCCB, "313164000006"));

            put("05631650", new HeadOffice(YQCCB, "313163000004"));
            put("05631651", new HeadOffice(YQCCB, "313163000004"));

            put("05818200", new HeadOffice(GSBANK, "313821050016"));
            put("05818202", new HeadOffice(GSBANK, "313821050016"));

            // 314821001018 兰州农村商业银行股份有限公司
            put("14538200", new HeadOffice(GSRCU, "314821001018"));
            put("14538202", new HeadOffice(GSRCU, "314821001018"));

            put("05311930", new HeadOffice(BANK_OF_WUHAI, "313193057846"));

            put("05832250", new HeadOffice(BANK_OF_BENXI, "313225000017"));
            put("05499200", new HeadOffice(CYCB, "313234001089"));//借
            put("05499203", new HeadOffice(CYCB, "313234001089")); //IC借

            put("04462260", new HeadOffice(BANK_OF_DANDONG, "313226009106")); //借
            put("04462262", new HeadOffice(BANK_OF_DANDONG, "313226009106")); //借
            put("04462269", new HeadOffice(BANK_OF_DANDONG, "313226009106")); //借

            put("04302249", new HeadOffice(BANK_OF_FUSHUN, "313226009106"));

            put("14542200", new HeadOffice(LNRCC, "402221010030"));
            put("14542201", new HeadOffice(LNRCC, "402221010030"));

            put("04192310", new HeadOffice(BANK_OF_LIAOYANG, "313231000013"));

            put("05442320", new HeadOffice(BANK_OF_PANJIN, "313232000015"));
            put("05442329", new HeadOffice(BANK_OF_PANJIN, "313232000015"));

            put("05392330", new HeadOffice(BANK_OF_TIELING, "313233000017"));
            put("05392339", new HeadOffice(BANK_OF_TIELING, "313233000017"));

            put("05785800", new HeadOffice(GDHXB, "313233000017"));

            put("14505800", new HeadOffice(GDRCU, "402581090008"));

            put("05910000", new HeadOffice(CSXB, "323551000015"));

            put("05576750", new HeadOffice(DZCCB, "313675090019"));

            put("05406650", new HeadOffice(LSCCB, "313665000203"));

            put("05556840", new HeadOffice(LSZSH, "313684093748"));

            put("04866570", new HeadOffice(SC_LZCCB, "313657092617"));

            put("04966730", new HeadOffice(BANK_OF_TF, "313673093259"));
            put("64966730", new HeadOffice(BANK_OF_TF, "313673093259"));

            put("05516620", new HeadOffice(SNXW, "313662000015"));
            put("05516629", new HeadOffice(SNXW, "313662000015"));

            put("05870000", new HeadOffice(XIB, "313662000015"));

            put("05666770", new HeadOffice(YACCB, "313677000010"));

            put("05646710", new HeadOffice(YBCCB, "313671000017"));

            put("05847000", new HeadOffice(BANK_OF_GUIZHOU, "313701099012"));
            put("65847000", new HeadOffice(BANK_OF_GUIZHOU, "313701099012"));

            put("04263380", new HeadOffice(JHCCB, "313338009688"));

            put("14572600", new HeadOffice(HLJRCC, "402261000004"));

            put("14452400", new HeadOffice(JLRCB, "402241000015"));
            put("14452402", new HeadOffice(JLRCB, "402241000015"));
            put("14452404", new HeadOffice(JLRCB, "402241000015"));

            put("14620000", new HeadOffice(DLRCB, "314222001893"));

            put("05027360", new HeadOffice(QJCCB, "313736000019"));
            put("05027361", new HeadOffice(QJCCB, "313736000019"));

            put("05247410", new HeadOffice(BANK_OF_HONGTA, "313741095715"));

            put("05748840", new HeadOffice(HMCCB, "313884000016"));
            put("05748844", new HeadOffice(HMCCB, "313884000016"));

            put("05658880", new HeadOffice(XJKCCB, "313888000013"));

            put("65520000", new HeadOffice(BANK_OF_BAODING, "313134000011"));

            put("69410000", new HeadOffice(HBRCB, "402121000009"));
            put("14411200", new HeadOffice(HBRCB, "402121000009"));

            put("05611480", new HeadOffice(BANK_OF_HENGSHUI, "313148053964"));
            put("05611481", new HeadOffice(BANK_OF_HENGSHUI, "313148053964"));
            put("05611499", new HeadOffice(BANK_OF_HENGSHUI, "313148053964"));

            put("04571260", new HeadOffice(QINHUANGDAOCCB, "313126001022"));
            put("04571261", new HeadOffice(QINHUANGDAOCCB, "313126001022"));
            put("04571269", new HeadOffice(QINHUANGDAOCCB, "313126001022"));

            put("04991240", new HeadOffice(BOTS, "313124000018"));

            put("14404900", new HeadOffice(HNRCB, "402491000026"));

            put("04115010", new HeadOffice(JZCTB, "313501080608"));

            put("05484950", new HeadOffice(BANK_OF_PINGDINGSHAN, "313495081900"));
            put("05484959", new HeadOffice(BANK_OF_PINGDINGSHAN, "313495081900"));

            put("03450000", new HeadOffice(ESUNB, "529584000006"));

            put("05767700", new HeadOffice(XZBC, "313770000016"));

            put("15752282", new HeadOffice(BANK_OF_CZHT, "320228200017"));

            put("15752281", new HeadOffice(BANK_OF_DSQLF, "320226200013"));

            put("03560000", new HeadOffice(ZBANK, "323521012066"));

            put("14660000", new HeadOffice(QNRCB, "314791000001"));
            put("64680000", new HeadOffice(QNRCB, "314791000001"));

            put("64710000", new HeadOffice(JTRCB, "314241000015"));

            put("64720000", new HeadOffice(CCCDCB, "314241055555"));

            put("65341770", new HeadOffice(YDRCB, "402177000003"));
            put("14341770", new HeadOffice(YDRCB, "402177000003"));

            put("64667310", new HeadOffice(FUDIANBC, "313731000997"));

            put("64544240", new HeadOffice(JJCCB, "313424072004"));
            put("64540000", new HeadOffice(JJCCB, "313424072004"));


            put("14551600", new HeadOffice(SHANXIRCB, "402161002352"));

        }
    };

    private final String name;

    Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HeadOffice getHeadOffice() {
        return headOffice.get(this);
    }

    public enum Nature {

    }

    /**
     * 总行信息
     */
    @Getter
    @Setter
    public static class HeadOffice {

        /**
         * 银行
         */
        private Bank issuer;

        /**
         * 总行开户行名字
         */
        private String openBankName;

        /**
         * 总行开户行代码
         */
        private String openBankNo;

        public HeadOffice(Bank issuer, String openBankNo) {
            this.issuer = issuer;
            this.openBankName = issuer.name;
            this.openBankNo = openBankNo;
            headOffice.putIfAbsent(issuer, this);
        }
    }

}
