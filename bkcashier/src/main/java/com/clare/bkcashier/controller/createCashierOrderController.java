package com.clare.bkcashier.controller;

import com.clare.bkcashier.eneity.CashierAsset;
import com.clare.bkcashier.eneity.CashierMoney;
import com.clare.bkcashier.eneity.CashierOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class createCashierOrderController {
    @GetMapping("/createCashier")
    public CashierOrder getCashierOrder(@RequestBody CashierOrder cashierOrder){
        CashierMoney amount = cashierOrder.getAmount();
        CashierOrder cashierOrdder = new CashierOrder();
        return cashierOrder;
    }

}
