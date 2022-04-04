package com.clare.bkcashier.eneity;

import lombok.Data;

@Data
public class ConsultRequest {
    /*
    主体
     */
    private String loginIpid;
    /*
    交易金额
     */
    private CashierMoney tradeAmt;

    ConsultRequest(String loginIpid, CashierMoney tradeAmt){
        this.loginIpid = loginIpid;
        this.tradeAmt = tradeAmt;
    }

}
