package com.clare.bkcashier.service;


import com.alibaba.smart.framework.engine.model.assembly.ProcessDefinition;
import com.alibaba.smart.framework.engine.model.instance.ProcessInstance;
import com.clare.bkcashier.eneity.Context;
import com.clare.bkcashier.repository.dao.CashierOrderDAO;
import com.clare.bkcashier.view.CashierOrderView;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@Service
public class CreateCashierOrderService extends AbstractbkcashierService {

    @Resource(name="cashierOrderDAO")
    CashierOrderDAO cashierOrderDAO;

    @Override
    public void execute(Map<String, Object> view) {

        super.setUp();

        CashierOrderView cashierOrderView = (CashierOrderView) view.get("cashierOrderView");
        Context context = new Context();
        context.setCashierOrderView(cashierOrderView);
        context.applicationContext = new HashMap<String, Object>();
        context.applicationContext.put("cashierOrderDAO", cashierOrderDAO);
        Map<String, Object> request = new HashMap<String, Object>();
        request.put("context",context);

        ProcessDefinition processDefinition = repositoryCommandService
                .deploy("createCashierOrder.bpmn.xml").getFirstProcessDefinition();
        ProcessInstance processInstance = processCommandService.start(
                processDefinition.getId(), processDefinition.getVersion(),request, null);

        super.clear();
    }
}
