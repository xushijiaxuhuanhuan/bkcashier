package com.clare.bkcashier.eneity;

import lombok.Data;

@Data
public class CashierAssetView {

    /*
    收银台资产
     */
    private CashierAsset cashierAsset;
    /*
    可用余额
     */
    private CashierMoney availableAmt;
    /*
    是否选中
     */
    private boolean selected;
    /*
    是否选中
     */
    private boolean visible;

    public CashierAssetView(CashierAsset cashierAsset, CashierMoney availableAmt, boolean selected, boolean visible) {
        this.cashierAsset = cashierAsset;
        this.availableAmt = availableAmt;
        this.selected = selected;
        this.visible = visible;
    }

    public CashierAssetView() {
        this.cashierAsset = new CashierAsset();
        this.availableAmt = new CashierMoney();
        this.selected = true;
        this.visible = true;
    }
}
