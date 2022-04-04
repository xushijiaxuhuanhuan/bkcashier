package com.clare.bkcashier.repository.dao;


import com.clare.bkcashier.eneity.CashierOrder;
import com.clare.bkcashier.repository.sqldo.CustomerDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CustomerDAO {
    void  insertCustomer(CustomerDO customerDO);

}
