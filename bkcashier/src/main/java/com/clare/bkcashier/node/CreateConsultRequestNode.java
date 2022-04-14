package com.clare.bkcashier.node;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.clare.bkcashier.eneity.request.AssetConsultRequest;
import com.clare.bkcashier.eneity.order.CashierOrder;
import com.clare.bkcashier.eneity.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateConsultRequestNode implements JavaDelegation {
    @Override
    public void execute(ExecutionContext executionContext) {

        log.info("咨询请求构建");
        Context context = (Context) executionContext.getRequest().get("context");
        CashierOrder cashierOrder = (CashierOrder) context.applicationContext.get("cashierOrderDTO");
        AssetConsultRequest assetConsultRequest = new AssetConsultRequest(cashierOrder.getCashierOrderId()
                , cashierOrder.getAmount());
        context.applicationContext.put("assetConsultRequest",assetConsultRequest);
    }


}
