package com.clare.bkcashier.eneity;

import com.clare.bkcashier.eneity.order.CashierOrder;
import com.clare.bkcashier.view.CashierOrderView;
import lombok.Data;

import java.util.Map;

@Data
public class Context {
    /*
    ShardingId， 保存id和
     */
    private String ShardingId;

    private CashierOrder cashierOrder;

    private CashierOrderView cashierOrderView;

    public Map<String, Object> applicationContext;


    public Context(String shardingId) {
        ShardingId = shardingId;
    }

    public Context(){}

    public void setShardingId(String shardingId) {
        ShardingId = shardingId;
    }    public void setCashierOrder(CashierOrder cashierOrder) {
        this.cashierOrder = cashierOrder;
    }

    public void setCashierOrderView(CashierOrderView cashierOrderView) {
        this.cashierOrderView = cashierOrderView;
    }

    public String getShardingId() {
        return ShardingId;
    }

    public CashierOrder getCashierOrder() {
        return cashierOrder;
    }

    public CashierOrderView getCashierOrderView() {
        return cashierOrderView;
    }
}
