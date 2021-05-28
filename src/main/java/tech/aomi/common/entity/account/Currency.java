package tech.aomi.common.entity.account;

import java.util.HashMap;
import java.util.Map;

/**
 * 国际货币代码
 *
 * @author Sean sean.snow@live.com
 */
public enum Currency {
    AED("784"), //United Arab Emirates dirham  United Arab Emirates
    AFN("971"), //Afghan afghani  Afghanistan
    ALL("008"), //Albanian lek  Albania
    AMD("051"), //Armenian dram  Armenia
    ANG("532"), //Netherlands Antillean guilder  Cura?ao,  Sint Maarten
    AOA("973"), //Angolan kwanza  Angola
    ARS("032"), //Argentine peso  Argentina
    AUD("036"), //Australian dollar  Australia, Australian Antarctic Territory,  Christmas Island,  Cocos (Keeling) Islands,  Heard and McDonald Islands,  Kiribati,  Nauru,  Norfolk Island,  Tuvalu
    AWG("533"), //Aruban florin  Aruba
    AZN("944"), //Azerbaijani manat  Azerbaijan
    BAM("977"), //Bosnia and Herzegovina convertible mark  Bosnia and Herzegovina
    BBD("052"), //Barbados dollar  Barbados
    BDT("050"), //Bangladeshi taka  Bangladesh
    BGN("975"), //Bulgarian lev  Bulgaria
    BHD("048"), //Bahraini dinar  Bahrain
    BIF("108"), //Burundian franc  Burundi
    BMD("060"), //Bermudian dollar  Bermuda
    BND("096"), //Brunei dollar  Brunei,  Singapore
    BOB("068"), //Boliviano  Bolivia
    BOV("984"), //Bolivian Mvdol (funds code)  Bolivia
    BRL("986"), //Brazilian real  Brazil
    BSD("044"), //Bahamian dollar  Bahamas
    BTN("064"), //Bhutanese ngultrum  Bhutan
    BWP("072"), //Botswana pula  Botswana
    BYR("974"), //Belarusian ruble  Belarus
    BZD("084"), //Belize dollar  Belize
    CAD("124"), //Canadian dollar  Canada,  Saint Pierre and Miquelon
    CDF("976"), //Congolese franc  Democratic Republic of Congo
    CHE("947"), //WIR Euro (complementary currency)   Switzerland
    CHF("756"), //Swiss franc   Switzerland,  Liechtenstein
    CHW("948"), //WIR Franc (complementary currency)   Switzerland
    CLF("990"), //Unidad de Fomento (funds code)  Chile
    CLP("152"), //Chilean peso  Chile
    CNY("156"), //Chinese yuan  China
    COP("170"), //Colombian peso  Colombia
    COU("970"), //8] Unidad de Valor Real (UVR) (funds code)[8]  Colombia
    CRC("188"), //Costa Rican colon  Costa Rica
    CUC("931"), //Cuban convertible peso  Cuba
    CUP("192"), //Cuban peso  Cuba
    CVE("132"), //Cape Verde escudo  Cape Verde
    CZK("203"), //Czech koruna  Czech Republic
    DJF("262"), //Djiboutian franc  Djibouti
    DKK("208"), //Danish krone  Denmark,  Faroe Islands,  Greenland
    DOP("214"), //Dominican peso  Dominican Republic
    DZD("012"), //Algerian dinar  Algeria
    EGP("818"), //Egyptian pound  Egypt,  Palestinian territories
    ERN("232"), //Eritrean nakfa  Eritrea
    ETB("230"), //Ethiopian birr  Ethiopia
    EUR("978"), //Euro  Andorra,  Austria,  Belgium,  Cyprus,  Estonia,  Finland,  France,  Germany,  Greece,  Ireland,  Italy,  Kosovo,  Latvia,  Luxembourg,  Malta,  Monaco,  Montenegro,  Netherlands,  Portugal,  San Marino,  Slovakia,  Slovenia,  Spain,   Vatican City; see eurozone
    FJD("242"), //Fiji dollar  Fiji
    FKP("238"), //Falkland Islands pound  Falkland Islands
    GBP("826"), //Pound sterling  United Kingdom, British Crown dependencies (the  Isle of Man and the Channel Islands), certain British Overseas Territories ( South Georgia and the South Sandwich Islands,  British Antarctic Territory and  British Indian Ocean Territory)
    GEL("981"), //Georgian lari  Georgia (country)
    GHS("936"), //Ghanaian cedi  Ghana
    GIP("292"), //Gibraltar pound  Gibraltar
    GMD("270"), //Gambian dalasi  Gambia
    GNF("324"), //Guinean franc  Guinea
    GTQ("320"), //Guatemalan quetzal  Guatemala
    GYD("328"), //Guyanese dollar  Guyana
    HKD("344"), //Hong Kong dollar  Hong Kong,  Macao
    HNL("340"), //Honduran lempira  Honduras
    HRK("191"), //Croatian kuna  Croatia
    HTG("332"), //Haitian gourde  Haiti
    HUF("348"), //Hungarian forint  Hungary
    IDR("360"), //Indonesian rupiah  Indonesia
    ILS("376"), //Israeli new shekel  Israel,  State of Palestine[9]
    INR("356"), //Indian rupee  India
    IQD("368"), //Iraqi dinar  Iraq
    IRR("364"), //Iranian rial  Iran
    ISK("352"), //Icelandic króna  Iceland
    JMD("388"), //Jamaican dollar  Jamaica
    JOD("400"), //Jordanian dinar  Jordan
    JPY("392"), //Japanese yen  Japan
    KES("404"), //Kenyan shilling  Kenya
    KGS("417"), //Kyrgyzstani som  Kyrgyzstan
    KHR("116"), //Cambodian riel  Cambodia
    KMF("174"), //Comoro franc  Comoros
    KPW("408"), //North Korean won  North Korea
    KRW("410"), //South Korean won  South Korea
    KWD("414"), //Kuwaiti dinar  Kuwait
    KYD("136"), //Cayman Islands dollar  Cayman Islands
    KZT("398"), //Kazakhstani tenge  Kazakhstan
    LAK("418"), //Lao kip  Laos
    LBP("422"), //Lebanese pound  Lebanon
    LKR("144"), //Sri Lankan rupee  Sri Lanka
    LRD("430"), //Liberian dollar  Liberia
    LSL("426"), //Lesotho loti  Lesotho
    LTL("440"), //Lithuanian litas  Lithuania
    LYD("434"), //Libyan dinar  Libya
    MAD("504"), //Moroccan dirham  Morocco
    MDL("498"), //Moldovan leu  Moldova (except  Transnistria)
    MGA("969"), //[10] Malagasy ariary  Madagascar
    MKD("807"), //Macedonian denar  Macedonia
    MMK("104"), //Myanma kyat  Myanmar
    MNT("496"), //Mongolian tugrik  Mongolia
    MOP("446"), //Macanese pataca  Macao
    MRO("478"), //[10] Mauritanian ouguiya  Mauritania
    MUR("480"), //Mauritian rupee  Mauritius
    MVR("462"), //Maldivian rufiyaa  Maldives
    MWK("454"), //Malawian kwacha  Malawi
    MXN("484"), //Mexican peso  Mexico
    MXV("979"), //Mexican Unidad de Inversion (UDI) (funds code)  Mexico
    MYR("458"), //Malaysian ringgit  Malaysia
    MZN("943"), //Mozambican metical  Mozambique
    NAD("516"), //Namibian dollar  Namibia
    NGN("566"), //Nigerian naira  Nigeria
    NIO("558"), //Nicaraguan córdoba  Nicaragua
    NOK("578"), //Norwegian krone  Norway,  Svalbard,  Jan Mayen,  Bouvet Island, Queen Maud Land, Peter I Island
    NPR("524"), //Nepalese rupee    Nepal
    NZD("554"), //New Zealand dollar  Cook Islands,  New Zealand,  Niue,  Pitcairn,  Tokelau, Ross Dependency
    OMR("512"), //Omani rial  Oman
    PAB("590"), //Panamanian balboa  Panama
    PEN("604"), //Peruvian nuevo sol  Peru
    PGK("598"), //Papua New Guinean kina  Papua New Guinea
    PHP("608"), //Philippine peso  Philippines
    PKR("586"), //Pakistani rupee  Pakistan
    PLN("985"), //Polish z?oty  Poland
    PYG("600"), //Paraguayan guaraní  Paraguay
    QAR("634"), //Qatari riyal  Qatar
    RON("946"), //Romanian new leu  Romania
    RSD("941"), //Serbian dinar  Serbia
    RUB("643"), //Russian ruble  Russia,  Abkhazia,  South Ossetia
    RWF("646"), //Rwandan franc  Rwanda
    SAR("682"), //Saudi riyal  Saudi Arabia
    SBD("090"), //Solomon Islands dollar  Solomon Islands
    SCR("690"), //Seychelles rupee  Seychelles
    SDG("938"), //Sudanese pound  Sudan
    SEK("752"), //Swedish krona/kronor  Sweden
    SGD("702"), //Singapore dollar  Singapore,  Brunei
    SHP("654"), //Saint Helena pound  Saint Helena
    SLL("694"), //Sierra Leonean leone  Sierra Leone
    SOS("706"), //Somali shilling  Somalia (except  Somaliland)
    SRD("968"), //Surinamese dollar  Suriname
    SSP("728"), //South Sudanese pound  South Sudan
    STD("678"), //S?o Tomé and Príncipe dobra  S?o Tomé and Príncipe
    SYP("760"), //Syrian pound  Syria
    SZL("748"), //Swazi lilangeni  Swaziland
    THB("764"), //Thai baht  Thailand
    TJS("972"), //Tajikistani somoni  Tajikistan
    TMT("934"), //Turkmenistani manat  Turkmenistan
    TND("788"), //Tunisian dinar  Tunisia
    TOP("776"), //Tongan pa?anga  Tonga
    TRY("949"), //Turkish lira  Turkey,  Northern Cyprus
    TTD("780"), //Trinidad and Tobago dollar  Trinidad and Tobago
    TWD("901"), //New Taiwan dollar  Republic of China (Taiwan)
    TZS("834"), //Tanzanian shilling  Tanzania
    UAH("980"), //Ukrainian hryvnia  Ukraine
    UGX("800"), //Ugandan shilling  Uganda
    USD("840"), //United States dollar  American Samoa,  Barbados (as well as Barbados Dollar),  Bermuda (as well as Bermudian Dollar),  British Indian Ocean Territory,  British Virgin Islands, Caribbean Netherlands,  Ecuador,  El Salvador,  Guam,  Haiti,  Marshall Islands,  Federated States of Micronesia,  Northern Mariana Islands,  Palau,  Panama,  Puerto Rico,  Timor-Leste,  Turks and Caicos Islands,  United States,  U.S. Virgin Islands,  Zimbabwe
    USN("997"), //United States dollar (next day) (funds code)  United States
    USS("998"), //United States dollar (same day) (funds code)[11]  United States
    UYI("940"), //Uruguay Peso en Unidades Indexadas (URUIURUI) (funds code)  Uruguay
    UYU("858"), //Uruguayan peso  Uruguay
    UZS("860"), //Uzbekistan som  Uzbekistan
    VEF("937"), //Venezuelan bolívar  Venezuela
    VND("704"), //Vietnamese dong  Vietnam
    VUV("548"), //Vanuatu vatu  Vanuatu
    WST("882"), //Samoan tala  Samoa
    XAF("950"), //CFA franc BEAC  Cameroon,  Central African Republic,  Republic of the Congo,  Chad,  Equatorial Guinea,  Gabon
    XAG("961"), //Silver (one troy ounce)
    XAU("959"), //Gold (one troy ounce)
    XBA("955"), //European Composite Unit (EURCO) (bond market unit)
    XBB("956"), //European Monetary Unit (E.M.U.-6) (bond market unit)
    XBC("957"), //European Unit of Account 9 (E.U.A.-9) (bond market unit)
    XBD("958"), //European Unit of Account 17 (E.U.A.-17) (bond market unit)
    XCD("951"), //East Caribbean dollar  Anguilla,  Antigua and Barbuda,  Dominica,  Grenada,  Montserrat,  Saint Kitts and Nevis,  Saint Lucia,  Saint Vincent and the Grenadines
    XDR("960"), //Special drawing rights International Monetary Fund
    XFU("Nil"), //UIC franc (special settlement currency) International Union of Railways
    XOF("952"), //CFA franc BCEAO  Benin,  Burkina Faso,  C?te d'Ivoire,  Guinea-Bissau,  Mali,  Niger,  Senegal,  Togo
    XPD("964"), //Palladium (one troy ounce)
    XPF("953"), //CFP franc (franc Pacifique) French territories of the Pacific Ocean:  French Polynesia,  New Caledonia,  Wallis and Futuna
    XPT("962"), //Platinum (one troy ounce)
    XTS("963"), //Code reserved for testing purposes
    XXX("999"), //No currency
    YER("886"), //Yemeni rial  Yemen
    ZAR("710"), //South African rand  South Africa
    ZMW("967"), //Zambian kwacha  Zambia
    ZWL("932"), //Zimbabwe dollar  Zimbabwe
    INTEGRAL("000"); // 积分账户


    private static final Map<String, Currency> CODE = new HashMap<>();

    static {
        for (Currency value : Currency.values()) {
            CODE.put(value.getCode(), value);
        }
    }

    private final String code;

    Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Currency getByCode(String code) {
        return CODE.get(code);
    }
}
