package com.example.ioc_3;
// real subject

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements  EventService {

    @Override
    public void createEvent() {
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("create event");
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent() {
        long begin = System.currentTimeMillis();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("publish event");
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void deleteEvent() {
        System.out.println("delete event");

    }


}
