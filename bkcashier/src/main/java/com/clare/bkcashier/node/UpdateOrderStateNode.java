package com.clare.bkcashier.node;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UpdateOrderStateNode implements JavaDelegation {
    @Override
    public void execute(ExecutionContext executionContext) {
        log.info("更新单据状态");
    }


}
