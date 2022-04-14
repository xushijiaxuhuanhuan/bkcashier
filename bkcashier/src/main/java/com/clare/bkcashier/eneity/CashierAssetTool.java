package com.clare.bkcashier.eneity;

import com.clare.bkcashier.enums.AssetNameEnum;
import com.clare.bkcashier.enums.AssetTypeEnum;
import lombok.Data;
@Deprecated
@Data
public class CashierAssetTool {

    private String assetLogo;
    /*
     资产类型
     */
    private AssetTypeEnum assetType;
    /*
    展示资产名称
     */
    private AssetNameEnum assetShowName;

    public CashierAssetTool(AssetTypeEnum assetType, AssetNameEnum assetShowName) {
        this.assetType = assetType;
        this.assetShowName = assetShowName;
    }

    public CashierAssetTool(){
        this.assetShowName = AssetNameEnum.CHANGE;
        this.assetType = AssetTypeEnum.BANKCARD;
    }
}
