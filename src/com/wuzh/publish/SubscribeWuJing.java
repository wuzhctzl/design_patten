package com.wuzh.publish;

public class SubscribeWuJing implements Subscribe {
    @Override
    public void update(String message) {
        System.out.println("WuJing received message: " + message);
        // do something
        if(message.contains("成亲")){
            System.out.println(" 这可如何是好...");
        }
        if(message.contains("抓")){
            System.out.println(" 大师兄、二师兄，师父被妖怪抓走了...");
        }
        if(message.contains("%#$")){
            System.out.println(" 师父别念啦... ");
        }
    }
}
