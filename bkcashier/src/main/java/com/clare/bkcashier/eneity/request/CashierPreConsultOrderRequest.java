package com.clare.bkcashier.eneity.request;

import com.clare.bkcashier.eneity.cashierVO.CashierFundDetail;

import java.util.Date;

public class CashierPreConsultOrderRequest extends BaseRequest {
    /*
    交易金额
     */
    private String tradeAmt;
    /*
    收方资产信息
     */
    private CashierFundDetail payeeFundDetails;
    private String description;
    private Date payDate;
}
