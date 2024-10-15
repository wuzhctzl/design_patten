package com.wuzh.bridgePatten1;

public class BridgePattenDemo {
    /**
     * 主函数
     * 这段代码实现了桥接模式（Bridge Pattern），
     * 主要功能是在不同的控制设备（如智能遥控器和智能手机）与不同的被控制对象（如电视和音响）之间建立灵活的关系。
     * 通过封装控制器和设备之间的关系，允许他们独立地变化。
     * 使得用户可以使用不同的智能设备控制不同类型的家用电器，而不是将控制逻辑硬编码到每个设备中。
     * 这种设计提高了代码的可扩展性和灵活性，使得在未来可以方便地增加新的控制设备或家电设备。
     * @param args
     */
    public static void main(String[] args) {
        // 实例化智能控制器,使用 智能遥控器 控制 电视
        //这里其实就是实现了桥接模式中的“桥”。
        Control control = new SmartController(new Television());
        control.turnOn();
        control.turnOff();

        // 实例化智能控制器,使用 智能手机 控制 音响
        control = new SmartPhone(new SoundSystem());
        control.turnOn();
        control.turnOff();
    }
}
