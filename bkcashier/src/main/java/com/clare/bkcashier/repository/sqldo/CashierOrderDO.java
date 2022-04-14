package com.clare.bkcashier.repository.sqldo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CashierOrderDO {
    private String cashierOrderId;
    private Date gmt_create;
    private Date gmt_modified;
    private BigDecimal amount;
    private String cashierType;
    private String currency;
    private CashierAssetDO payeeFundDetails;
    private Date bizPayDate;
    private String description;
    private String sharding;

    public String getCashierOrderId() {
        return cashierOrderId;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCashierType() {
        return cashierType;
    }

    public String getCurrency() {
        return currency;
    }

    public CashierAssetDO getPayeeFundDetails() {
        return payeeFundDetails;
    }

    public Date getBizPayDate() {
        return bizPayDate;
    }

    public String getDescription() {
        return description;
    }

    public String getSharding() {
        return sharding;
    }

    @Override
    public String toString() {
        return "CashierOrderDO{" +
                "cashierOrderId='" + cashierOrderId + '\'' +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                ", amount=" + amount +
                ", cashierType='" + cashierType + '\'' +
                ", currency='" + currency + '\'' +
                ", payeeFundDetails=" + payeeFundDetails +
                ", bizPayDate=" + bizPayDate +
                ", description='" + description + '\'' +
                ", sharding='" + sharding + '\'' +
                '}';
    }
}
