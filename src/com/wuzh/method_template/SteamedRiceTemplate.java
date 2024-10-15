package com.wuzh.method_template;

public abstract class SteamedRiceTemplate {

    /**
     * 模板方法，定义了算法的骨架，按顺序调用各个步骤，但并不实现(或不完全实现)具体的步骤。
     * 子类可以重写父类的某些方法，但调用顺序不能改变。
     * 调用顺序：addMilk() -> washRice() -> pourRiceInPan() -> cookRice()
     * 注意：final修饰符，表示方法不能被重写。
     *
     */
    public final void steamedRice(){
        // 1. 添加米
        addRice();
        // 2.淘米
        washRice();
        // 3.将米倒入锅中
        pourRiceInPan();
        // 4.蒸煮米饭
        cookRice();
    }
    // 1. 添加米
    abstract void addRice() ;

    //2.淘米
    public void washRice(){
        System.out.println(" 淘米... ");
    }

    //3.将米倒入锅中
    public void pourRiceInPan(){
        System.out.println(" 将米倒入锅中... ");
    }
    //4.蒸煮米饭
    abstract void cookRice();
}
