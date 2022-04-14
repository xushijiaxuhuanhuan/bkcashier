package com.clare.bkcashier.node;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.clare.bkcashier.converter.DO2DTOConverter;
import com.clare.bkcashier.eneity.order.CashierOrder;
import com.clare.bkcashier.eneity.Context;
import com.clare.bkcashier.repository.dao.CashierOrderDAO;
import com.clare.bkcashier.repository.sqldo.CashierOrderDO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoadDataNode implements JavaDelegation {
    @Override
    public void execute(ExecutionContext executionContext) {
        log.info("数据加载");
        Context context = (Context) executionContext.getRequest().get("context");
        String shardingId = context.getShardingId();
//        cashierOrderId#beforeNodeName
        String[] strs = shardingId.split("#");
        CashierOrderDAO cashierOrderDAO = (CashierOrderDAO) context.applicationContext.get("cashierOrderDAO");
        CashierOrderDO cashierOrderDO = cashierOrderDAO.selectCashierOrder(strs[0]);
        DO2DTOConverter do2DTOConverter = new DO2DTOConverter();
        CashierOrder cashierOrder = do2DTOConverter.CashierOrderDO2DTO(cashierOrderDO);
        context.applicationContext.put("cashierOrderDTO", cashierOrder);

    }


}