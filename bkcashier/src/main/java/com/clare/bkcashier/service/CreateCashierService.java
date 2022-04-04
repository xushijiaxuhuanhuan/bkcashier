package com.clare.bkcashier.service;

import com.alibaba.smart.framework.engine.model.assembly.ProcessDefinition;
import com.alibaba.smart.framework.engine.model.instance.ProcessInstance;
import com.clare.bkcashier.eneity.CashierOrder;
import com.clare.bkcashier.eneity.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CreateCashierService extends AbstractbkcashierService{

//    @Autowired
//    Context context;

    @Override
    public void execute() {
        super.setUp();
        ProcessDefinition processDefinition = repositoryCommandService
                .deploy("createCashierOrder.bpmn.xml").getFirstProcessDefinition();

        Map<String, Object> request = new HashMap<String, Object>();
        Map<String, Object> response = new HashMap<String, Object>();

        CashierOrder cashierOrder = new CashierOrder();
//        context.getMaps().put("cashierOrder",cashierOrder);
//                //put("bkcashier",bkcashier);
        request.put("context", cashierOrder);
        ProcessInstance processInstance = processCommandService.start(
                processDefinition.getId(), processDefinition.getVersion(), request,response
        );

        super.clear();
    }

}
