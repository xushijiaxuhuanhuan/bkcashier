package com.clare.bkcashier.repository.handler;

import com.clare.bkcashier.eneity.util.CashierMoney;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AmountHandler implements TypeHandler {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        CashierMoney cashierMoney = (CashierMoney) o;
        BigDecimal amount = ((CashierMoney) o).getAmt();
        preparedStatement.setBigDecimal(i, amount);
    }

    @Override
    public Object getResult(ResultSet resultSet, String s) throws SQLException {
        BigDecimal amount = resultSet.getBigDecimal(s);
        return amount;
    }

    @Override
    public Object getResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getBigDecimal(i);
    }

    @Override
    public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
        return (BigDecimal) callableStatement.getObject(i);
    }
}