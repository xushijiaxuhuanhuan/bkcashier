package com.clare.bkcashier.node;

import com.alibaba.druid.support.logging.Resources;
import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.clare.bkcashier.eneity.CashierOrder;
import com.clare.bkcashier.repository.dao.CashierOrderDAO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class SaveCashierOrderNode implements JavaDelegation {


    @Override
    public void execute(ExecutionContext executionContext) {
//        Context context = (Context) executionContext.getRequest().get("context");
//        CashierOrder cashierOrder = context.getCashierOrder();

    }


}
