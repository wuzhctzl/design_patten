package com.wuzh.bridgePatten1;

public class SmartController extends Control {
    public SmartController(SmartDevice smartDevice) {
        super(smartDevice);
    }

    @Override
    public void turnOn() {
        System.out.println(" 使用智能遥控器打开设备...");
        smartDevice.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println(" 使用智能遥控器关闭设备...");
        smartDevice.turnOff();
    }
}
