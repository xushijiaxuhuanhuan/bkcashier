package com.clare.bkcashier.service;

import com.alibaba.smart.framework.engine.model.assembly.ProcessDefinition;
import com.alibaba.smart.framework.engine.model.instance.ProcessInstance;
import org.springframework.stereotype.Repository;

@Repository
public class PayRenderService extends AbstractbkcashierService {

    @Override
    public void execute() {
        super.setUp();
        ProcessDefinition processDefinition = repositoryCommandService
                .deploy("payRender.bpmn.xml").getFirstProcessDefinition();

        ProcessInstance processInstance = processCommandService.start(
                processDefinition.getId(), processDefinition.getVersion());

        super.clear();
    }
}