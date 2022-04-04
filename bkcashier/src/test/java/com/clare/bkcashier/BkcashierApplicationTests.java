package com.clare.bkcashier;


import com.alibaba.druid.support.logging.Resources;
import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.clare.bkcashier.eneity.CashierOrder;
import com.clare.bkcashier.repository.dao.CashierOrderDAO;
import com.clare.bkcashier.service.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;

/*
TOASK:
这两个注解何用
 */
@SpringBootTest(classes = BkcashierApplication.class)
@RunWith(SpringRunner.class)
@MapperScan("com.clare.bkcashier.repository.dao")
public class BkcashierApplicationTests {

	@Autowired
	CreateCashierService createCashierService;

	@Autowired
	PayRenderService payRenderService;

	@Autowired
	PayConfirmService payConfirmService;

	@Autowired
	PayCommitService payCommitService;

	@Autowired
	PayResultQuery payResultQuery;

	@Autowired
	CashierOrderDAO cashierOrderDAO;

	@Test
	public void test() {

		CashierOrder cashierOrder = new CashierOrder();
		cashierOrderDAO.insertCashierOrder(cashierOrder);


//		createCashierService.execute();
//		payRenderService.execute();
//		payConfirmService.execute();
//		payCommitService.execute();
//		payRenderService.execute();
	}

}
