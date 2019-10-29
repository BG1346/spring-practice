package com.example.ioc_3;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {
    @EventListener
    @Async
    public void hhh(MyEvent myEvent){
        System.out.println(Thread.currentThread().toString());
        System.out.println("나는 어나더원 "+myEvent.getData());
    }
}
