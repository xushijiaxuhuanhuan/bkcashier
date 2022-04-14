package com.clare.bkcashier.eneity.util;

import com.clare.bkcashier.enums.CurrencyTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
public class CashierMoney {
    /*
    金额
     */
    private BigDecimal amt;
    /*
    货币
     */
    private CurrencyTypeEnum currency;

    public CashierMoney(BigDecimal amt, CurrencyTypeEnum currency) {
        this.amt = amt;
        this.currency = currency;
    }

    public CashierMoney(BigDecimal amt, String currency){
        this.amt = amt;
        this.currency =  CurrencyTypeEnum.valueOf(currency);
    }

    public CashierMoney(String amt, String currency){
        this.amt = new BigDecimal(amt);
        this.currency = CurrencyTypeEnum.valueOf(currency);
    }

    public CashierMoney(Map<String, Object> cashierMoney) {
        this.amt = new BigDecimal((String)cashierMoney.get("amt"));
        this.currency = CurrencyTypeEnum.valueOf((String)cashierMoney.get("currency"));
    }
}

