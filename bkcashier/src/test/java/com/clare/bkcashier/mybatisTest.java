package com.clare.bkcashier;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.clare.bkcashier.eneity.CashierAsset;
import com.clare.bkcashier.eneity.CashierOrder;
import com.clare.bkcashier.node.SaveCashierOrderNode;
import com.clare.bkcashier.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/*
TOASK:
这两个注解何用
 */
public class mybatisTest {
    @Test
    public void test() {

//        CashierOrder cashierOrder = new CashierOrder();
        CashierAsset cashierAsset = new CashierAsset();
        JSONObject jObject=new JSONObject();
        jObject.put("username", cashierAsset.getId());
        jObject.put("sex", "man");
        jObject.put("age", 38);
        jObject.put("email", "xiejava@ishareread.com");
//        json.put("assetType",)
        System.out.println(jObject);

    }
}
