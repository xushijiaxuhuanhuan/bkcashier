package com.clare.bkcashier.eneity;

import lombok.Data;

import java.util.Map;

@Data
public class Context {
    /*
    SessionId， 保存id和
     */
    private String SessionId;

    private CashierOrder cashierOrder;

    Map<String, Object> maps;

    public Context(String sessionId) {
        SessionId = sessionId;
    }
}
