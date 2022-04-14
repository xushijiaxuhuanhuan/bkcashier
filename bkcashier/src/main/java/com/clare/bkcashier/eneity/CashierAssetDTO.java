package com.clare.bkcashier.eneity;

import com.clare.bkcashier.eneity.util.CashierMoney;
import com.clare.bkcashier.enums.AssetNameEnum;
import com.clare.bkcashier.enums.AssetTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Deprecated
@Getter
@Setter
public class CashierAssetDTO {

    /*
    资产id
     */
    private String id;
    /*
    金额
     */
    private CashierMoney cashierMoney;
    /*
     资产工具
     */
    private CashierAssetTool cashierAssetTool;

//
//    public CashierAssetDTO() {
//    }
//
//    public CashierAssetDTO(String id, AssetTypeEnum assetType, AssetNameEnum assetShowName) {
//        this.id = id;
//        this.assetType = assetType;
//        this.assetShowName = assetShowName;
//    }
//
//    public CashierAssetDTO(Map<String, Object> cashierAssetView) {
//        String id = (String)cashierAssetView.get("id");
//
//        String assetType =(String)cashierAssetView.get("assetType");
//        String assetName = (String)cashierAssetView.get("assetName");
//        AssetNameEnum assetNameEnum = AssetNameEnum.valueOf(assetName);
//        AssetTypeEnum assetTypeEnum = AssetTypeEnum.valueOf(assetType);
//        this.id = id;
//        this.assetType = assetTypeEnum;
//        this.assetShowName = assetNameEnum;
//    }
//
//    public CashierAssetDTO(String id, String assetType, String assetName){
//        AssetNameEnum assetNameEnum = AssetNameEnum.valueOf(assetName);
//        AssetTypeEnum assetTypeEnum = AssetTypeEnum.valueOf(assetType);
//        this.id = id;
//        this.assetType = assetTypeEnum;
//        this.assetShowName = assetNameEnum;
//    }


}
