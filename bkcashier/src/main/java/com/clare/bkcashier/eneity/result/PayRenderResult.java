package com.clare.bkcashier.eneity.result;

import com.clare.bkcashier.eneity.cashierVO.CashierAssetViewWrapperVO;
import com.clare.bkcashier.eneity.cashierVO.CashierAssetVO;
import com.clare.bkcashier.eneity.util.CashierMoney;
import lombok.Data;

import java.util.List;

@Data
public class PayRenderResult {

    private CashierMoney amount;

    private CashierAssetVO payeeAsset;
    /*
    付方资产
     */
    private List<CashierAssetViewWrapperVO> payerAssetList;
    /*
    营销资产列表
     */
    private List<CashierAssetViewWrapperVO> promotionAmt;
}
