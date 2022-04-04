package com.clare.bkcashier.eneity;

import com.clare.bkcashier.enums.CurrencyTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CashierAssetViewWrapper {
    /*主资产工具
     */
    private CashierAssetView mainPayTool;
    /*营销工具
     */
    private List<CashierAssetView> promotionTool;
    /*实际金额
     */
    private CashierMoney actualPayAmt;
    /*营销金额
     */
    private CashierMoney promotionAmt;

    public CashierAssetViewWrapper(CashierAssetView mainPayTool, List<CashierAssetView> promotionTool, CashierMoney actualPayAmt, CashierMoney promotionAmt) {
        this.mainPayTool = mainPayTool;
        this.promotionTool = promotionTool;
        this.actualPayAmt = actualPayAmt;
        this.promotionAmt = promotionAmt;
    }

    public CashierAssetViewWrapper() {
        this.mainPayTool = new CashierAssetView();
        this.promotionTool = null;
        this.actualPayAmt = new CashierMoney();
        this.promotionAmt = new CashierMoney(BigDecimal.TEN, CurrencyTypeEnum.RENMINBI);
    }
}
