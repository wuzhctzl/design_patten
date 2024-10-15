package com.wuzh.method_template;

public class SteamedRice {
    public static void main(String[] args) {
        // 选择不同的模板方法
        // 使用普通掉饭煲蒸煮 普通白米饭
//        SteamedRiceTemplate steamedRiceTemplate = new SteamedRiceDemo1();
        // 使用蒸箱蒸 添加了 小红豆和大枣等原料的豪华米饭
        SteamedRiceTemplate steamedRiceTemplate = new SteamedRiceDemo2();
        steamedRiceTemplate.steamedRice();
    }
}
