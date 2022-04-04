package com.clare.bkcashier.enums;

public enum AssetTypeEnum implements BaseEnum<String, String>{
    /*
     零钱
     */
    CHANGE("change","零钱"),
    /*
    银行卡
     */
    BANKCARD("bankcard","银行卡");


    private String value;

    private String desc;


    AssetTypeEnum(String value , String desc ){
        this.value = value ;
        this.desc = desc ;
    }


    @Override
    public String desc() {
        return this.desc;
    }

    @Override
    public String getValue() {
        return this.value;
    }


}
