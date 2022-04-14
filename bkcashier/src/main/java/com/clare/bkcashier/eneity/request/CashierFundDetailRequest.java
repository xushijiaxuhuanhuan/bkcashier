package com.clare.bkcashier.eneity.request;

import com.clare.bkcashier.eneity.util.CashierMoney;
import com.fasterxml.jackson.databind.ser.Serializers;

public class CashierFundDetailRequest {
    private CashierMoney amt;
//    private BaseAssetToolRequest assetTool;
    private String memo;
}
