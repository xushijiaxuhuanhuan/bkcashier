package com.clare.bkcashier.converter;

import com.clare.bkcashier.eneity.CashierAssetDTO;
import com.clare.bkcashier.eneity.util.CashierMoney;
import com.clare.bkcashier.eneity.order.CashierOrder;
import com.clare.bkcashier.enums.CashierOrderTypeEnum;
import com.clare.bkcashier.repository.sqldo.CashierAssetDO;
import com.clare.bkcashier.repository.sqldo.CashierOrderDO;

public class DO2DTOConverter {
    public CashierOrder CashierOrderDO2DTO(CashierOrderDO cashierOrderDO){
        CashierOrder cashierOrder = new CashierOrder();
        cashierOrder.setCashierOrderId(cashierOrderDO.getCashierOrderId());
        CashierMoney amount = new CashierMoney(cashierOrderDO.getAmount(),cashierOrderDO.getCurrency());
        cashierOrder.setAmount(amount);
        cashierOrder.setCashierType(CashierOrderTypeEnum.valueOf(cashierOrderDO.getCashierType()));
        CashierAssetDO cashierAssetDO = cashierOrderDO.getPayeeFundDetails();
        cashierOrder.setPayeeFundDetails(new CashierAssetDTO(cashierAssetDO.getId(),cashierAssetDO.getAssetType(),cashierAssetDO.getAssetName()));
        cashierOrder.setBizPayDate(cashierOrderDO.getBizPayDate());
        cashierOrder.setDescription(cashierOrderDO.getDescription());
        cashierOrder.setSharding(cashierOrderDO.getSharding());
        return cashierOrder;
    }


}
