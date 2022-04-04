package com.clare.bkcashier.enums;

public enum CustomerTypeEnum implements BaseEnum<String, String>{
    /*
    个人用户
     */
    PERSONALUSER("personalUser","个人用户"),
    /*
    企业用户
     */
    BUSINESSUSER("businessUser","企业用户");

    private String value;
    private String desc;

    CustomerTypeEnum(String value, String desc) {
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
