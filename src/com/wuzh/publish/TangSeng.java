package com.wuzh.publish;

import java.util.ArrayList;
import java.util.List;

public class TangSeng {

    private final List<Subscribe> observers=new ArrayList<>();

    public void addObserver(Subscribe observer) {
        observers.add(observer);
    }

    public void removeObserver(Subscribe observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Subscribe observer : observers) {
            observer.update(message);
        }
    }
}
