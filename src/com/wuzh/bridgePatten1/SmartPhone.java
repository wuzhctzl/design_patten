package com.wuzh.bridgePatten1;

public class SmartPhone extends Control {
    public SmartPhone(SmartDevice smartDevice) {
        super(smartDevice);
    }

    @Override
    public void turnOn() {
        System.out.println(" 使用智能手机打开设备...");
        smartDevice.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println(" 使用智能手机关闭设备...");
        smartDevice.turnOff();
    }

    public void otherFunction() {
        System.out.println(" 智能手机的其他功能...");
    }
}
