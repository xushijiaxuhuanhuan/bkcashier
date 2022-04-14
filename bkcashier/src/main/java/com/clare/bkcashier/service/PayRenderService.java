package com.clare.bkcashier.service;

import com.alibaba.smart.framework.engine.model.assembly.ProcessDefinition;
import com.alibaba.smart.framework.engine.model.instance.ProcessInstance;
import com.clare.bkcashier.eneity.Context;
import com.clare.bkcashier.repository.dao.CashierOrderDAO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PayRenderService extends AbstractbkcashierService {

    @Resource(name="cashierOrderDAO")
    CashierOrderDAO cashierOrderDAO;

    @Override
    public void execute(Map<String, Object> view){
        super.setUp();

        //取出参数 shardingId
        String shardingId = (String)view.get("shardingId");
        String[] strs = shardingId.split("#");

        //填充上下文
        Context context = new Context();
        context.setShardingId(shardingId);
        context.applicationContext = new HashMap<String, Object>();
        context.applicationContext.put("cashierOrderDAO", cashierOrderDAO);
        Map<String, Object> request = new HashMap<String, Object>();
        request.put("context",context);

        ProcessDefinition processDefinition = repositoryCommandService
                .deploy("payRender.bpmn.xml").getFirstProcessDefinition();

        ProcessInstance processInstance = processCommandService.start(
                processDefinition.getId(), processDefinition.getVersion(),request,null);

        super.clear();
    }
}