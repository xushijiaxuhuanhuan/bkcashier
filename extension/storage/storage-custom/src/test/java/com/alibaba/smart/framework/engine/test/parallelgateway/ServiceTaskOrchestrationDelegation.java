package com.alibaba.smart.framework.engine.test.parallelgateway;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.alibaba.smart.framework.engine.delegation.TccDelegation;
import com.alibaba.smart.framework.engine.delegation.TccResult;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceTaskOrchestrationDelegation implements JavaDelegation {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceTaskDelegation.class);

    @Getter
    private static ConcurrentMap<Long,Long>  map = new ConcurrentHashMap<Long, Long>();

    @Override
    public void execute(ExecutionContext executionContext) {

        Map<String, Object> request = executionContext.getRequest();
        String processDefinitionActivityId = executionContext.getExecutionInstance().getProcessDefinitionActivityId();
        Long sleepTime = (Long)request.get( processDefinitionActivityId);

        long id = Thread.currentThread().getId();
        map.put(id,sleepTime);

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            LOGGER.error(e.getMessage(),e);
        }

    }
}
