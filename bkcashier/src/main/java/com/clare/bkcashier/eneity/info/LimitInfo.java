package com.clare.bkcashier.eneity.info;

import com.clare.bkcashier.eneity.util.CashierMoney;

public class LimitInfo {
    private CashierMoney singleMaxLimitAmt;
    private CashierMoney dayAvailableLimitAmt;
    private CashierMoney monthAvailableLimitAmt;
    private CashierMoney yearAvailableLimitAmt;
    private CashierMoney lifeAvailableLimitAmt;
    /*
    展示经过计算用户最小可以使用的金额
     */
    private CashierMoney availableLimitAmt;
}
