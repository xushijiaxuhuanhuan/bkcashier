package com.clare.bkcashier.repository.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PayOrderDAO {
    void  insertPayOrder(PayOrderDAO payOrderDAO);
}
