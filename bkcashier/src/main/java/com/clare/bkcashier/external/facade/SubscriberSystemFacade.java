package com.clare.bkcashier.external.facade;

import com.clare.bkcashier.eneity.request.CashierConsultOrderRequest;
import com.clare.bkcashier.eneity.result.CashierConsultOrderResult;

public interface SubscriberSystemFacade {
    /*
   收单系统下单
    */
    CashierConsultOrderResult createPreConsultOrder(CashierConsultOrderRequest cashierConsultOrderRequest);
    /*
    收银台系统下预咨询单
     */
    CashierConsultOrderResult createCashierOrder()
}
