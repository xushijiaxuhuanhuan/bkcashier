package com.clare.bkcashier.eneity;

import com.clare.bkcashier.enums.AssetNameEnum;
import com.clare.bkcashier.enums.AssetTypeEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CashierAsset {

    /*
    用户id
     */
    private String id;
    /*
     资产类型
     */
    private AssetTypeEnum assetType;
    /*
    展示资产名称
     */
    private AssetNameEnum assetShowName;



    public CashierAsset(AssetTypeEnum assetType,AssetNameEnum assetShowName) {
        this.assetType = assetType;
        this.assetShowName = assetShowName;
    }

    public CashierAsset(){
        this.id = "181860118";
        this.assetShowName = AssetNameEnum.CHANGE;
        this.assetType = AssetTypeEnum.BANKCARD;
    }

    public String getId() {
        return id;
    }

    public AssetTypeEnum getAssetType() {
        return assetType;
    }

    public AssetNameEnum getAssetShowName() {
        return assetShowName;
    }
}
