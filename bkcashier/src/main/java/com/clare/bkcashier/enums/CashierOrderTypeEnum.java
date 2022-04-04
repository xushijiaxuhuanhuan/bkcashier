package com.clare.bkcashier.enums;

public enum CashierOrderTypeEnum implements BaseEnum<String, String>{
    /*
   标准收银模式，应用于信用卡还款等场景
    */
    STANDARD("standard","标准收银模式"),
    /*
    前置收银台模式，应用于转账等场景
     */
    PREPOSITION("preposition","前置收银模式");

    private  String value;
    private  String desc;

    CashierOrderTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
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