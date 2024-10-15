package com.wuzh.publish;

public class SubscribeWuKong implements Subscribe {
    @Override
    public void update(String message) {
        System.out.println("WuKong received message: " + message);
        // do something
        if(message.contains("成亲")){
            System.out.println(" 这要看师父的道行了...");
        }
        if(message.contains("抓")){
            System.out.println(" 找观音菩萨诉苦，并请求降妖...");
        }
        if(message.contains("%#$")){
            System.out.println(" 头痛欲裂...");
        }
    }
}
