package com.wuzh.method_template;

public class SteamedRiceDemo2 extends SteamedRiceTemplate {
    @Override
    void addRice() {
        System.out.println("添加大米、红枣、红豆...");
    }

    @Override
    void cookRice() {
        System.out.println("使用蒸箱蒸米饭...");
    }
}
