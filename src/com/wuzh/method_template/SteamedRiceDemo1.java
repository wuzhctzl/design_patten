package com.wuzh.method_template;

public class SteamedRiceDemo1 extends SteamedRiceTemplate {
    @Override
    void addRice() {
        System.out.println("添加普通大米");
    }

    @Override
    void cookRice() {
        System.out.println("使用普通电饭煲蒸煮米饭");
    }
}
