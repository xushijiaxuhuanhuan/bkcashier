package com.clare.bkcashier.eneity;

import com.clare.bkcashier.enums.CurrencyTypeEnum;
import lombok.Data;

import java.math.BigDecimal;

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

    public CashierMoney() {
        this.amt = new BigDecimal(181);
        this.currency = CurrencyTypeEnum.RENMINBI;
    }
}

