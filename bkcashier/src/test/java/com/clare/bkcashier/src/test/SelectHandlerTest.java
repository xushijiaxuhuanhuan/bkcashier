package com.clare.bkcashier.src.test;

import cn.hutool.json.JSONUtil;
import com.clare.bkcashier.BkcashierApplication;
import com.clare.bkcashier.enums.AssetNameEnum;
import com.clare.bkcashier.repository.dao.CashierOrderDAO;
import com.clare.bkcashier.repository.sqldo.CashierAssetDO;
import com.clare.bkcashier.repository.sqldo.CashierOrderDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = BkcashierApplication.class)
@RunWith(SpringRunner.class)
@MapperScan("com.clare.bkcashier.repository.dao")
public class SelectHandlerTest {
    @Autowired
    CashierOrderDAO cashierOrderDAO;
    @Test
    public void test(){
        String json = "{\"assetShowName\":\"change\",\"id\":\"4\",\"assetType\":\"change\"}";
        CashierAssetDO cashierAssetDO = JSONUtil.toBean(json, CashierAssetDO.class);
        CashierOrderDO cashierAssetDO1 = cashierOrderDAO.selectCashierOrder("1649235194081");
        Assert.assertEquals(cashierAssetDO1.getPayeeFundDetails().getAssetType(),"change");
    }

}
