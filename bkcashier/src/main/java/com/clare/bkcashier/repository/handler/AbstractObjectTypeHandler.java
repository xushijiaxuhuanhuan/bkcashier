package com.clare.bkcashier.repository.handler;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.hutool.json.JSONUtil;
import com.mysql.cj.util.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;


/**
 继承BaseTypeHandler,实现一个json转object通用的类
 注意：这里的json工具类使用的时hutool中的JSONUtil，用fastjson或其他json框架的注意替换
 */
public class AbstractObjectTypeHandler<T> extends BaseTypeHandler<T> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSONUtil.toJsonStr(parameter));
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName)
            throws SQLException {
        String data = rs.getString(columnName);
        return StringUtils.isEmptyOrWhitespaceOnly(data) ? null : JSONUtil.toBean(data, (Class<T>) getRawType());
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String data = rs.getString(columnIndex);
        return StringUtils.isEmptyOrWhitespaceOnly(data) ? null : JSONUtil.toBean(data, (Class<T>) getRawType());
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex)
            throws SQLException {
        String data = cs.getString(columnIndex);
        return StringUtils.isEmptyOrWhitespaceOnly(data) ? null : JSONUtil.toBean(data, (Class<T>) getRawType());
    }
}
