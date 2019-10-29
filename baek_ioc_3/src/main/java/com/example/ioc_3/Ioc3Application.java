package com.example.ioc_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class Ioc3Application {
    public static void main(String[] args) {
        SpringApplication.run(Ioc3Application.class, args);
    }

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messsageSource = new ReloadableResourceBundleMessageSource();
        messsageSource.setBasename("classpath:messages");
        messsageSource.setDefaultEncoding("UTF-8");
        return messsageSource;
    }

}
