package com.wuzh.publish;

/**
 * 事件总线参与的 发布订阅模式
 * 发布订阅模式（Publish/Subscribe）
 */
public class PublishSubscribeDemo1 {
    public static void main(String[] args) {

        //上面的发布订阅模式，和观察者模式基本一致。那为啥要有两种设计模式呢？
        //下面我们优化一下我们的发布订阅模式，使之更加灵活。

        // 优化后的发布订阅模式
        // 1. 发布者和订阅者之间不直接通信，而是通过事件总线进行通信。
        // 2. 事件总线可以有多个，每个事件总线可以有多个订阅者。
        // 3. 订阅者可以订阅一个或多个事件，也可以订阅全部事件。
        String event = "女儿国国王逼着成亲...";
        String event1 = "被妖怪抓走了...";
        String event2 = "%#$@#%$#%...";
        EventBus eventBus = new EventBus();
        eventBus.register("取经小分队",new SubscribeWuKong());
        eventBus.register("取经小分队",new SubscribeWuNeng());
        eventBus.register("取经小分队",new SubscribeWuJing());
        // 4. 发布者发布事件时，通过事件总线将事件发送给所有订阅了该事件的订阅者。
        eventBus.postEvent("取经小分队",event);
        eventBus.postEvent("取经小分队",event1);
        eventBus.postEvent("取经小分队",event2);
    }

}
