package com.wuzh.chainOfResponsibility.barber;

import com.wuzh.chainOfResponsibility.Handler;

public class OrdinaryBarber extends Handler {

    @Override
    public void handleRequest(String request) {
        if (!"资深理发师".equals(request)&&!"总监理发师".equals(request)&&!"学徒理发师".equals(request)) {
            System.out.println("很高兴为您服务...");
        }else{
            if(nextHandler!= null){
                nextHandler.handleRequest(request);
            }
        }
    }
}
