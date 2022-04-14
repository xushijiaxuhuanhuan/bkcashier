package com.clare.bkcashier.repository.handler;

import com.clare.bkcashier.repository.sqldo.CashierAssetDO;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedJdbcTypes({JdbcType.VARCHAR})
@MappedTypes({CashierAssetDO.class})
public class PayeeFundDetailHandler extends AbstractObjectTypeHandler<CashierAssetDO>{

}
