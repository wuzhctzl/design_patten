package com.wuzh.chainOfResponsibility;

public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler handle) {
        this.nextHandler = handle;
    }

    public abstract void handleRequest(String request);
}
