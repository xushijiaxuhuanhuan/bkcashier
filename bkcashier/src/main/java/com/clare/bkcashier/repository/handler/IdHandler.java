package com.clare.bkcashier.repository.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdHandler implements TypeHandler {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {

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