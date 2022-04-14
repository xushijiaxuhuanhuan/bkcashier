package com.clare.bkcashier.node;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.clare.bkcashier.eneity.order.CashierOrder;
import com.clare.bkcashier.eneity.Context;
import com.clare.bkcashier.view.CashierOrderView;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/*
  生成收银单节点
 */
@Slf4j
public class CreateCashierOrderNode implements JavaDelegation {
    @Override
    public void execute(ExecutionContext executionContext) {
        Map<String, Object> request = executionContext.getRequest();
        Context context = (Context) request.get("context");
        CashierOrderView cashierOrderView = context.getCashierOrderView();
        CashierOrder cashierOrder = new CashierOrder(cashierOrderView);
        context.setCashierOrder(cashierOrder);
     }


}
