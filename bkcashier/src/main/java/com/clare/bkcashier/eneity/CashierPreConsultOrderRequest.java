package com.clare.bkcashier.eneity;

import lombok.Data;

@Data
public class CashierPreConsultOrderRequest {
    /*
   收方资产TODO
    */
    private CashierAsset payerFundDetails;
    /*
    收银单金额
     */
    private CashierMoney amount;
    /*
    付方信息
     */
    private String payerId;
}
