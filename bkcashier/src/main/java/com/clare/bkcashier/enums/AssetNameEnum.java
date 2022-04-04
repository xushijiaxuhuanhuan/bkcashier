package com.clare.bkcashier.enums;

public enum AssetNameEnum implements BaseEnum<String, String>{
    /*
     零钱
     */
    CHANGE("change","零钱"),
    /*
    招商银行卡
     */
    CHINAMERCHANTSBANKCARD("China Merchants BankCard","中国建设银行卡"),
    /*
    建设银行卡
     */
    CHINACONSTRUCTBANKCARD("China Construction Bank Card","中国建设银行卡"),
    /*
    工商银行卡
     */
    Industrial("China Industrial and Commercial Bank Card","中国工商银行卡");


    private String value;

    private String desc;


    AssetNameEnum(String value , String desc ){
        this.value = value ;
        this.desc = desc ;
    }


    @Override
    public String desc() {
        return this.desc;
    }

    @Override
    public String getValue() {
        return  this.value;
    }


}
