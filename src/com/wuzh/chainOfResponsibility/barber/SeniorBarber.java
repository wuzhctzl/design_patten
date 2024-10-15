package com.wuzh.chainOfResponsibility.barber;

import com.wuzh.chainOfResponsibility.Handler;

public class SeniorBarber extends Handler {

    @Override
    public void handleRequest(String request) {
        if("资深理发师".equals(request)){
            System.out.println("资深理发师正在为您服务...我将会带领您的头发来一场绝美的舞蹈演出... ");
        }else{
            if(nextHandler!= null){
                nextHandler.handleRequest(request);
            }
        }
    }
}
