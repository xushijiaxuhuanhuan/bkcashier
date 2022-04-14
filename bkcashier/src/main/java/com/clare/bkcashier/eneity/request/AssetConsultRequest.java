package com.clare.bkcashier.eneity.request;

import com.clare.bkcashier.eneity.util.CashierMoney;
import lombok.Data;

@Data
public class AssetConsultRequest {
    /*
    主体
     */
    private String loginIpid;
    /*
    交易金额
     */
    private CashierMoney tradeAmt;

    public AssetConsultRequest(String loginIpid, CashierMoney tradeAmt){
        this.loginIpid = loginIpid;
        this.tradeAmt = tradeAmt;
    }

    AssetConsultRequest(String loginIpid, String tradeAmt){
        this.loginIpid = loginIpid;
    }

}
