package com.clare.bkcashier.eneity.result;

import com.clare.bkcashier.eneity.cashierVO.CashierAssetVO;
import com.clare.bkcashier.eneity.util.CashierMoney;
import lombok.Data;

@Data
public class PayResultConsultResult extends BaseResult{
    /*
    账单总金额
     */
    private CashierMoney orderAmount;
    /*
    实际支付金额
     */
    private CashierMoney actualAmount;
    /*
    营销金额
     */
    private CashierMoney promotionAmount;
    private String payeeShowCardNo;
    private String payeeShowToolName;
    private String payeeShowAccountName;
    private String payerShowCardNo;
    private String payerShowToolName;
    private String payerShowAccountName;
    /*
    支付结果
     */
    private String status;
}
