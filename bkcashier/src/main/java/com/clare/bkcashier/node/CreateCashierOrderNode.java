package com.clare.bkcashier.node;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.clare.bkcashier.eneity.CashierOrder;
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
        CashierOrder cashierOrder = new CashierOrder();
    }


}
