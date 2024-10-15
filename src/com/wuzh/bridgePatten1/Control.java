package com.wuzh.bridgePatten1;

public abstract class Control {

    protected SmartDevice smartDevice;
    protected Control(SmartDevice smartDevice) {
        this.smartDevice = smartDevice;
    }
    public abstract void turnOn();
    public abstract void turnOff();
}
