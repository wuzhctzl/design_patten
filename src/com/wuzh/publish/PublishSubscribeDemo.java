package com.wuzh.publish;

import java.util.Observer;

/**
 * 普通的发布订阅模式Demo（和观察者模式基本一致）
 */
public class PublishSubscribeDemo {
    public static void main(String[] args) {
        // 创建发布者
        TangSeng publisher = new TangSeng();
        // 创建订阅者
        Subscribe subscriber1 = new SubscribeWuKong();
        Subscribe subscriber2 = new SubscribeWuNeng();
        Subscribe subscriber3 = new SubscribeWuJing();
        // 发布者注册订阅者
        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);
        publisher.addObserver(subscriber3);
        // 发布消息
        publisher.notifyObservers("女儿国国王逼着成亲...");
        publisher.notifyObservers("被妖怪抓走了");
        publisher.notifyObservers("%#$@#%$#%...");
        // 移除订阅者
        publisher.removeObserver(subscriber2);
        // 再次发布消息
        publisher.notifyObservers("被抓走了");

    }

}
