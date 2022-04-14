package com.clare.bkcashier.service;

import com.alibaba.smart.framework.engine.model.assembly.ProcessDefinition;
import com.alibaba.smart.framework.engine.model.instance.ProcessInstance;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class PayResultQuery extends AbstractbkcashierService {

    @Override
    public void execute(Map<String, Object> view) {
        super.setUp();
        ProcessDefinition processDefinition = repositoryCommandService
                .deploy("payResultQuery.bpmn.xml").getFirstProcessDefinition();

        ProcessInstance processInstance = processCommandService.start(
                processDefinition.getId(), processDefinition.getVersion());

        super.clear();
    }
}