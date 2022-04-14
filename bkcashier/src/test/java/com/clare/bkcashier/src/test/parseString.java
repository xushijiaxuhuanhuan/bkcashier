package com.clare.bkcashier.src.test;

import org.junit.Test;

public class parseString {

    @Test
     public void testParseString(){
        String shardingId = "12345#createCashierOrder";
        String[] strs = shardingId.split("#");
        System.out.println(strs[1]);
        for(String s:strs){
            System.out.println(s+' ');
        }
    }

}