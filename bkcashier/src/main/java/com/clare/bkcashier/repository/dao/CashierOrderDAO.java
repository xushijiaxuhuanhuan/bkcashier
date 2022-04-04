package com.clare.bkcashier.repository.dao;

import com.clare.bkcashier.eneity.CashierOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CashierOrderDAO {
     void  insertCashierOrder(CashierOrder cashierOrder);
}
