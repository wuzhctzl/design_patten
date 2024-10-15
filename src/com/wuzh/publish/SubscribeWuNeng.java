package com.wuzh.publish;

public class SubscribeWuNeng implements Subscribe {
    @Override
    public void update(String message) {
        System.out.println("WuNeng received message: " + message);
        // do something
        if(message.contains("成亲")){
            System.out.println(" 师父，你就答应了算了...");
        }
        if(message.contains("抓")){
            System.out.println(" 大师兄师父被妖怪抓走了...");
        }
        if(message.contains("%#$")){
            System.out.println(" 表面嬉笑，实则心疼大师兄!");
        }
    }
}
