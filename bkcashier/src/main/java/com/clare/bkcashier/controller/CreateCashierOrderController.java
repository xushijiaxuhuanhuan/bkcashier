package com.clare.bkcashier.controller;


import com.clare.bkcashier.service.CreateCashierOrderService;
import com.clare.bkcashier.view.CashierOrderView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class CreateCashierOrderController {
    @Autowired
    CreateCashierOrderService createCashierOrderService;
    @PostMapping("/createCashierOrder")
    public void getCashierOrdder(@RequestBody CashierOrderView cashierOrderView){
        System.out.print(cashierOrderView.toString());
        Map<String,Object> view = new HashMap<String, Object>();
        view.put("cashierOrderView",cashierOrderView);
        createCashierOrderService.execute(view);
    }

}
