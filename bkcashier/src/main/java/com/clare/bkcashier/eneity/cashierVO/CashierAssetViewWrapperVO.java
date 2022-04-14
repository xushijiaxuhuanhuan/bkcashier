package com.clare.bkcashier.eneity.cashierVO;

import com.clare.bkcashier.eneity.cashierVO.CashierAssetVO;
import com.clare.bkcashier.eneity.util.CashierMoney;
import com.clare.bkcashier.enums.CurrencyTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CashierAssetViewWrapperVO {
    /*主资产工具
     */
    private CashierAssetVO mainPayTool;
    /*营销工具
     */
    private List<CashierAssetVO> promotionTool;
    /*实际金额
     */
    private CashierMoney actualPayAmt;
    /*营销金额
     */
    private CashierMoney promotionAmt;
}
