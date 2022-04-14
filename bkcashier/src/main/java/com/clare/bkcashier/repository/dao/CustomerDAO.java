package com.clare.bkcashier.repository.dao;


import com.clare.bkcashier.repository.sqldo.CustomerDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CustomerDAO {
    void  insertCustomer(CustomerDO customerDO);

}
