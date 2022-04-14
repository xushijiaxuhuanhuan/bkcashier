package com.clare.bkcashier.repository.dao;

import com.clare.bkcashier.eneity.order.CashierOrder;
import com.clare.bkcashier.repository.sqldo.CashierOrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository(value="cashierOrderDAO")
public interface CashierOrderDAO {
     void insertCashierOrder(CashierOrder cashierOrder);
     CashierOrderDO selectCashierOrder(@Param("cashierOrderId") String cashierOrderId);
}
