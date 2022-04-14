package com.clare.bkcashier.repository.sqldo;

import lombok.Data;

import java.io.Serializable;
@Data
public class CashierAssetDO implements Serializable{

    private static final long serialVersionUID = -5660840758413324306L;

    /*
    展示资产名称
     */
    private String assetName;
    /*
   用户id
    */
    private String id;
    /*
     资产类型
     */
    private String assetType;

    private String amount;

    public String getAmount() {
        return amount;
    }

    public String getAssetName() {
        return assetName;
    }

    public String getId() {
        return id;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

}
