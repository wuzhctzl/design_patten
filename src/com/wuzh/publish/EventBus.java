package com.wuzh.publish;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
    private final Map<String, List<Subscribe>> subscribeMap = new HashMap<>();

    /**
     * 订阅者订某类事件
     * @param eventName 事件名称（比如本例中的 取经小分队）
     * @param subscribe 订阅者
     */
    public void register(String eventName, Subscribe subscribe) {
        subscribeMap.computeIfAbsent(eventName, k -> new java.util.ArrayList<>()).add(subscribe);
    }
    public void unregister(String eventName, Subscribe subscribe) {
        List<Subscribe> subscribes = subscribeMap.get(eventName);
        if (subscribes!= null) {
            subscribes.remove(subscribe);
        }
    }

    /**
     * 发布事件
     * @param eventName 事件名称
     * @param event 事件内容
     */
    public void postEvent(String eventName, String event) {
        List<Subscribe> subscribes = subscribeMap.get(eventName);
        if (subscribes!= null) {
            for (Subscribe subscribe : subscribes) {
                subscribe.update(event);
            }
        }
    }

}
