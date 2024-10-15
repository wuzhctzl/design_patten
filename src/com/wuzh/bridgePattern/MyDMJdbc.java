package com.wuzh.bridgePattern;

public class MyDMJdbc implements MyDriverInterface{
    @Override
    public void connect() {
        System.out.println(" 欢迎使用 MYDM 连接数据库... ");
    }
}
