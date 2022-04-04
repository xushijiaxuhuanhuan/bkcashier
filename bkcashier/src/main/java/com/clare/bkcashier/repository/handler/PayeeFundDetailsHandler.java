package com.clare.bkcashier.repository.handler;

import com.alibaba.druid.support.json.JSONParser;
import com.clare.bkcashier.eneity.CashierAsset;
import com.clare.bkcashier.eneity.CashierMoney;
import com.clare.bkcashier.eneity.CashierOrder;
import com.clare.bkcashier.enums.AssetNameEnum;
import org.apache.ibatis.type.*;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
public class PayeeFundDetailsHandler implements TypeHandler {


    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        CashierAsset cashierAsset = (CashierAsset) o;
        JSONObject jObject=new JSONObject();
        jObject.put("id", cashierAsset.getId());
        jObject.put("assetType", cashierAsset.getAssetType().getValue());
        jObject.put("assetShowName", cashierAsset.getAssetShowName().getValue());
        preparedStatement.setString(i,jObject.toString());
    }

    @Override
    public Object getResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public Object getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}