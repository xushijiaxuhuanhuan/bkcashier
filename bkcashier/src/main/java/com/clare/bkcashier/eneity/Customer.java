package com.clare.bkcashier.eneity;

import com.clare.bkcashier.enums.CustomerTypeEnum;
import lombok.Data;

import java.util.List;

@Data
public class Customer {
    /*
    客户唯一身份标识
     */
    private String id;
    /*
    客户类型
     */
    private CustomerTypeEnum customertype;
    /*
    客户密码
     */
    private String payPassword;
    /*
    客户二次校验密码
     */
    private String StrongPassword;
    /*
    客户资产列表
     */
    private List<CashierAsset> assetList;
    /*
    TODO
        用户享受营销西悉尼
        用户限额信息
     */

}
