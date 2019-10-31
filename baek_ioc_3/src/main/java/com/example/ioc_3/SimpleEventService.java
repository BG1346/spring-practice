package com.example.ioc_3;
// real subject

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class SimpleEventService implements  EventService {

    @Override
    @PerfLogging
    public void createEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("create event");
    }

    @Override
    @PerfLogging
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("publish event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("delete event");

    }


}
