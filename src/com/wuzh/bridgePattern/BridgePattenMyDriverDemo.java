package com.wuzh.bridgePattern;

public class BridgePattenMyDriverDemo {
    public static void main(String[] args) {

        MyDriverManager myDriver = new MyDriverManager();
        // 根据条件注册数据库驱动（通常是根据配置文件 这里简单调用一下）
        // 这里假设注册的是AbcJdbc驱动
        AbcJdbc abcJdbc = new AbcJdbc();
        myDriver.registerDriver(abcJdbc);
        myDriver.connect();

        // 这里假设注册的是MyDMJdbc驱动
        MyDMJdbc myDMJdbc = new MyDMJdbc();
        myDriver.registerDriver(myDMJdbc);
        myDriver.connect();
    }
}
