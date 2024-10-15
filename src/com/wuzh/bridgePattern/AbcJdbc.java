package com.wuzh.bridgePattern;

public class AbcJdbc implements MyDriverInterface{
    @Override
    public void connect() {
        System.out.println(" 欢迎使用 Abc JDBC 连接数据库 ");
    }
}
