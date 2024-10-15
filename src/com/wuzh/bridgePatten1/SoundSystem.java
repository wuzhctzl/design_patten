package com.wuzh.bridgePatten1;

public class SoundSystem implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println(" SoundSystem is on. ");
    }

    @Override
    public void turnOff() {
        System.out.println(" SoundSystem is off. ");
    }
}
