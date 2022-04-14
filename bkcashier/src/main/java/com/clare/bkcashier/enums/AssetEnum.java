package com.clare.bkcashier.enums;

public enum AssetEnum {

    CURRENCY("mybank","网商银行","src/main/resources/image/mybank.png","网商银行"),
    ALIPAY("alipay","支付宝","src/main/resources/image/alipay.png","支付宝"),
    WEPAY("wechat","微信支付","src/main/resources/image/wechat.png","微信支付"),
    CCB("ccb","中国建设银行","src/main/resources/image/ccb.png","中国建设银行"),
    CMB("cmb","中国招商银行","src/main/resources/image/cmbcchina.png","招商银行"),
    MCC("mcc","优惠券","src/main/resources/image/merchantcoupon.png","优惠券"),
    RP("rp","红包","src/main/resources/image/redpacket.png","红包");
    private String instId;
    private String instName;
    private String assetLogo;
    private String description;

    AssetEnum(String instId, String instName, String assetLogo, String description) {
        this.instId = instId;
        this.instName = instName;
        this.assetLogo = assetLogo;
        this.description = description;
    }
}
