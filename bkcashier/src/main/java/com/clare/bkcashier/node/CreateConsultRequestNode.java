package com.clare.bkcashier.node;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class CreateConsultRequestNode implements JavaDelegation {
    @Override
    public void execute(ExecutionContext executionContext) {

        log.info("咨询请求构建");
        Map<String, Object> request = executionContext.getRequest();

    }


}
