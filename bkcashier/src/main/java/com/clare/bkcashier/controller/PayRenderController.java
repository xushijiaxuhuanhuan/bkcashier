package com.clare.bkcashier.controller;


import com.clare.bkcashier.service.CreateCashierOrderService;
import com.clare.bkcashier.service.PayRenderService;
import com.clare.bkcashier.view.CashierOrderView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class PayRenderController {
    @Autowired
    PayRenderService payRenderService;
    @PostMapping("/payRender")
    public void getCashierOrdder(@RequestBody String sharding ){
        Map<String,Object> view = new HashMap<String, Object>();
        view.put("shardingId",sharding);
        payRenderService.execute(view);
    }

}
