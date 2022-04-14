package com.clare.bkcashier.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CurrencyTypeEnum implements BaseEnum<String, String> {

    /*
    人民币
     */
    RENMINBI("cny","人民币"),
    /*
    美元
     */
    DOLLAR("dollar","美元");

    private  String value;
    private  String desc;

    CurrencyTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    CurrencyTypeEnum(String value){
        switch (value){
            case "cny":{
                this.value = value;
                this.desc = "人民币";
                break;
            }
            case "dollar":{
                this.value = value;
                this.desc = "美元";
                break;
            }
        }
        if("cny".equals(value)){
            this.value = "cny";
            this.desc = "人民币";
        }

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
