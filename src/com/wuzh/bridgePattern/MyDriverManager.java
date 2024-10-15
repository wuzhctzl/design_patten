package com.wuzh.bridgePattern;

public class MyDriverManager {
    // 定义一个接口，用于与具体的数据库驱动交互
    private MyDriverInterface driver;

    // 定义一个方法，用于注册数据库驱动
    public void registerDriver(MyDriverInterface driver) {
        this.driver = driver;
    }
    public void connect() {
        driver.connect();
    }
}
