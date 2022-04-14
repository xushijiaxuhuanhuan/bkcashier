package com.clare.bkcashier.view;


import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class CashierOrderView implements Serializable {
    /*
    收银单金额
 */
    private Map<String, Object> amount;
    /*
    收银类型：
        前置收银
        标准收银
     */
    private String cashierType;
    /*
    收方资产TODO
     */
    private Map<String,Object> payeeFundDetails;
    /*
    转账说明
     */
    private String description;

    public CashierOrderView(Map<String, Object>  amount, String cashierType, Map<String, Object> payeeFundDetails, String description) {
        this.amount = amount;
        this.cashierType = cashierType;
        this.payeeFundDetails = payeeFundDetails;
        this.description = description;
    }
    public CashierOrderView(){}

    @Override
    public String toString() {
        return "CashierOrderView{" +
                "amount='" + amount + '\'' +
                ", cashierType='" + cashierType + '\'' +
                ", payeeFundDetails=" + payeeFundDetails +
                ", description='" + description + '\'' +
                '}';
    }

    public Map<String, Object> getAmount() {
        return amount;
    }

    public String getCashierType() {
        return cashierType;
    }

    public Map<String, Object> getPayeeFundDetails() {
        return payeeFundDetails;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(Map<String, Object> amount) {
        this.amount = amount;
    }

    public void setCashierType(String cashierType) {
        this.cashierType = cashierType;
    }

    public void setPayeeFundDetails(Map<String, Object> payeeFundDetails) {
        this.payeeFundDetails = payeeFundDetails;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
