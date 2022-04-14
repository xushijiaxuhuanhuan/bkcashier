package com.clare.bkcashier;

import com.alibaba.fastjson.JSONObject;
import com.clare.bkcashier.eneity.CashierAssetDTO;
import com.clare.bkcashier.node.SaveCashierOrderNode;
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
public class mybatisTest {
    @Autowired
    SaveCashierOrderNode saveCashierOrderNode;
    @Test
    public void test() {


//        CashierOrder cashierOrder = new CashierOrder();
        CashierAssetDTO cashierAssetDTO = new CashierAssetDTO();
        JSONObject jObject=new JSONObject();
        jObject.put("username", cashierAssetDTO.getId());
        jObject.put("sex", "man");
        jObject.put("age", 38);
        jObject.put("email", "xiejava@ishareread.com");
//        json.put("assetType",)
        System.out.println(jObject);

    }
}
