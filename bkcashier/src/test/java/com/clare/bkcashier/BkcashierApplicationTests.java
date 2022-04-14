package com.clare.bkcashier;


import com.clare.bkcashier.repository.dao.CashierOrderDAO;
import com.clare.bkcashier.service.*;
import com.clare.bkcashier.view.CashierOrderView;
import com.thoughtworks.xstream.XStream;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
TOASK:
这两个注解何用
 */
@SpringBootTest(classes = BkcashierApplication.class)
@RunWith(SpringRunner.class)
@MapperScan("com.clare.bkcashier.repository.dao")
public class BkcashierApplicationTests {

	@Autowired
	CreateCashierOrderService createCashierOrdeService;

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
	public void test() throws JSONException {
		XStream xstream = new XStream();
		xstream.alias("cashierOrderView",CashierOrderView.class);

		String xml = "\"<?xml version=\\\"1.0\\\" ?><cashierOrderView>\n" +
				"    <amount>\n" +
				"        <amt>18.0</amt>\n" +
				"        <currency>RENMINBI</currency>\n" +
				"    </amount>\n" +
				"    <cashierType>\n" +
				"        STANDARD\n" +
				"    </cashierType>\n" +
				"    <payeeFundDetails>\n" +
				"        <id>4</id>\n" +
				"        <assetType>CHANGE</assetType>\n" +
				"        <assetShowName>CHANGE</assetShowName>\n" +
				"    </payeeFundDetails>\n" +
				"    <description>\n" +
				"        pay\n" +
				"    </description>\n" +
				"</cashierOrderView>";
//		CashierOrderView cashierOrderView = (CashierOrderView)xstream.fromXML(xml);
		CashierOrderView cashierOrderView1 = new CashierOrderView();

		cashierOrderView1.setCashierType("STNADARD");
		cashierOrderView1.setDescription("lalalala");
		String xml1 = xstream.toXML(cashierOrderView1);


//		CashierOrderDTO cashierOrderDTO = new CashierOrderDTO(cashierOrderView);
//		cashierOrderDAO.insertCashierOrder(cashierOrderDTO);


//		createCashierService.execute();
//		payRenderService.execute();
//		payConfirmService.execute();
//		payCommitService.execute();
//		payRenderService.execute();
	}

}
