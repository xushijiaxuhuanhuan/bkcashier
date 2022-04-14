package com.clare.bkcashier.eneity.cashierVO;

import com.clare.bkcashier.eneity.info.LimitInfo;
import com.clare.bkcashier.eneity.util.CashierMoney;

public class CashierAssetVO {

    /*
    资产logo
     */
    private String assetLogo;
    /*
    资产名称
     */
    private String assetShowName;
    /*
    可选,当资产为银行卡时显示的卡后四位数
     */
    private String showCardNo;
    /*
    限额条件下的可用金额
     */
    private CashierMoney availableAmt;
    /*
    该资产下的实际金额
     */
    private CashierMoney actualAmt;
    /*
    限额信息
     */
    private LimitInfo limitInfo;
    /*
    是否可用,指向是否冻结
     */
    boolean enable;
    /*
    在收银台是否可见,不可见原因为余额不足
     */
    boolean visible;
    /*
    是否被选中为付方资产
     */
    boolean selected;
}
