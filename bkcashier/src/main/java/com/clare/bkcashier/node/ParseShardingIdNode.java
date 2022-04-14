package com.clare.bkcashier.node;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.clare.bkcashier.eneity.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParseShardingIdNode implements JavaDelegation {
    @Override
    public void execute(ExecutionContext executionContext) {
        log.info("解析ShardingId");
        Context context = (Context)executionContext.getRequest().get("context");
        String shardingId = context.getShardingId();
        String[] strs = shardingId.split("#");
        switch (strs[1]){
            case "createCashierOrder":{
                log.info("创建收银单-shardingId解析-咨询请求构建");

            }
        }
    }


}