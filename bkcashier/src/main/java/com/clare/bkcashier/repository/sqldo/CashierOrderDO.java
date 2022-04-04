package com.clare.bkcashier.repository.sqldo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CashierOrderDO {
    private Integer cashierOrderId;
    private Date gmt_create;
    private Date gmt_modified;
    private BigDecimal amount;
    private String cashierType;
    private String unit;
    private String payeeFundDetails;
    private Date bizPayDate;

    private String description;
    private String sharding;

    @Override
    public String toString() {
        return "CashierOrderDO{" +
                "id=" + cashierOrderId +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                ", amount='" + amount + '\'' +
                ", cashierType='" + cashierType + '\'' +
                ", unit='" + unit + '\'' +
                ", payeeFundDetails='" + payeeFundDetails + '\'' +
                ", bizPayDate=" + bizPayDate +
                ", description='" + description + '\'' +
                ", sharding='" + sharding + '\'' +
                '}';
    }
}
