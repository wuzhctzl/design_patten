package com.wuzh.bridgePattern;

public class MyKingBaseJdbc implements MyDriverInterface{
    @Override
    public void connect() {
        System.out.println(" 欢迎使用 MYKingBase 连接数据库... ");
    }
}
