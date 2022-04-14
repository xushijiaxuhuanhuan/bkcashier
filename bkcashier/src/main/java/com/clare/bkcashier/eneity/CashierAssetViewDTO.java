package com.clare.bkcashier.eneity;

import com.clare.bkcashier.eneity.util.CashierMoney;
import lombok.Data;
@Deprecated
@Data
public class CashierAssetViewDTO {

    /*
    收银台资产
     */
    private CashierAssetDTO cashierAssetDTO;
    /*
    可用余额
     */
    private CashierMoney availableAmt;
    /*
    是否选中
     */
    private boolean selected;
    /*
    是否选中
     */
    private boolean visible;

    public CashierAssetViewDTO(CashierAssetDTO cashierAssetDTO, CashierMoney availableAmt, boolean selected, boolean visible) {
        this.cashierAssetDTO = cashierAssetDTO;
        this.availableAmt = availableAmt;
        this.selected = selected;
        this.visible = visible;
    }

    public CashierAssetViewDTO() {
        this.cashierAssetDTO = new CashierAssetDTO();
        this.selected = true;
        this.visible = true;
    }
}
