package com.example.ioc_3;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    public void handler(MyEvent myEvent) {
        System.out.println("받은 데이터는 " + myEvent.getData());
    }
}
