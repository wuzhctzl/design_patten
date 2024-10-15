package com.wuzh.chainOfResponsibility.barber;

import com.wuzh.chainOfResponsibility.Handler;

public class ChiefBarber extends Handler {

    @Override
    public void handleRequest(String request) {
        if("总监理发师".equals(request)){
            System.out.println("很高兴为您服务，您的头发将光鲜亮丽...哈哈哈...");
        }else{
            if(nextHandler!= null){
                nextHandler.handleRequest(request);
            }
        }
    }
}
