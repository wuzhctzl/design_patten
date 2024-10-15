package com.wuzh.bridgePatten1;

public class Television implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println(" Television is turned on. ");
    }

    @Override
    public void turnOff() {
        System.out.println(" Television is turned off. ");
    }
}
