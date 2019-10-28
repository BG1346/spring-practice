package com.example.ioc_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Ioc3Application {
    public static void main(String[] args) {
        SpringApplication.run(Ioc3Application.class, args);
    }

}
