package com.clare.bkcashier.repository.handler;

import com.clare.bkcashier.eneity.CashierAssetDTO;
import org.apache.ibatis.type.*;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.alibaba.fastjson.JSONObject;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

public class PayeeFundDetailsHandler implements TypeHandler {


    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        CashierAssetDTO cashierAssetDTO = (CashierAssetDTO) o;
        JSONObject jObject=new JSONObject();
        jObject.put("id", cashierAssetDTO.getId());
        jObject.put("assetType", cashierAssetDTO.getAssetType().getValue());
        jObject.put("assetShowName", cashierAssetDTO.getAssetShowName().getValue());
        preparedStatement.setString(i,jObject.toString());
    }

    @Override
    public Object getResult(ResultSet resultSet, String s) throws SQLException {
//       Object json = resultSet.getObject("payeeFundDetails",Map<String,>
//        System.out.println(json.toString());
        return null;
    }

    @Override
    public Object getResult(ResultSet resultSet, int i) throws SQLException {
        Object json = resultSet.getObject(i);
        System.out.println(json.toString());
        return null;
    }

    @Override
    public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
        Object json = callableStatement.getObject(i);
        System.out.println(json.toString());
        return null;
    }
}