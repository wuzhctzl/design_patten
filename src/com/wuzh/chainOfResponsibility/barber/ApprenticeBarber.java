package com.wuzh.chainOfResponsibility.barber;

import com.wuzh.chainOfResponsibility.Handler;

public class ApprenticeBarber extends Handler {

    @Override
    public void handleRequest(String request) {
        if("学徒理发师".equals(request)){
            System.out.println("虽然还在学徒，但我的技术也是相当醇熟的，哈哈哈...");
        }else{
            if(nextHandler!= null){
                nextHandler.handleRequest(request);
            }
        }
    }
}
