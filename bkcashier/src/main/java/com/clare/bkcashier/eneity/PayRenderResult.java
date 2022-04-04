package com.clare.bkcashier.eneity;

import lombok.Data;

@Data
public class PayRenderResult {
    private CashierAsset payAmt;
    /*
    收方资产
     */
    private CashierAssetView payeeAsset;
    /*
    付方资产
     */
    private CashierAssetViewWrapper payerAssetList;
    /*
    营销资产列表
     */
    private CashierAssetViewWrapper promotionAmt;

    public PayRenderResult(CashierAsset payAmt, CashierAssetView payeeAsset, CashierAssetViewWrapper payerAssetList, CashierAssetViewWrapper promotionAmt) {
        this.payAmt = payAmt;
        this.payeeAsset = payeeAsset;
        this.payerAssetList = payerAssetList;
        this.promotionAmt = promotionAmt;
    }
}
