package com.example.ioc_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@EnableAsync
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        applicationContext.publishEvent(new MyEvent(this, 1000));
//        applicationContext.publishEvent(new MyEvent(1000));
    }
}
