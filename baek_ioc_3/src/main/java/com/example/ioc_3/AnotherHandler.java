package com.example.ioc_3;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {
    @EventListener
    public void hhh(MyEvent myEvent){
        System.out.println("나는 어나더원 "+myEvent.getData());
    }
}
