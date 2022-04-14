package com.clare.bkcashier.node;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.clare.bkcashier.eneity.order.CashierOrder;
import com.clare.bkcashier.eneity.Context;
import com.clare.bkcashier.repository.dao.CashierOrderDAO;
import org.springframework.stereotype.Repository;

@Repository
public class SaveCashierOrderNode implements JavaDelegation {

    @Override
    public void execute(ExecutionContext executionContext) {
        Context context = (Context) executionContext.getRequest().get("context");
        CashierOrder cashierOrder = (CashierOrder) context.getCashierOrder();
        CashierOrderDAO cashierOrderDAO = (CashierOrderDAO) context.applicationContext.get("cashierOrderDAO");
        String shardingId = cashierOrder.getCashierOrderId()+"#"+"createCashierOrder";
        context.setShardingId(shardingId);
        executionContext.getRequest().put("context",context);
        cashierOrderDAO.insertCashierOrder(cashierOrder);
    }


}
