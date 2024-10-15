package com.wuzh.chainOfResponsibility;

import com.wuzh.chainOfResponsibility.barber.ApprenticeBarber;
import com.wuzh.chainOfResponsibility.barber.ChiefBarber;
import com.wuzh.chainOfResponsibility.barber.OrdinaryBarber;
import com.wuzh.chainOfResponsibility.barber.SeniorBarber;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler handler1 = new ApprenticeBarber();
        Handler handler2 = new ChiefBarber();
        Handler handler3 = new OrdinaryBarber();
        Handler handler4 = new SeniorBarber();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler4);

        handler1.handleRequest("资深理发师");
        handler1.handleRequest("总监理发师");
        handler1.handleRequest("学徒理发师");
        handler1.handleRequest("啦啦啦...");

    }

}
