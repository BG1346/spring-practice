package com.example.ioc_3;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
=======
>>>>>>> 6529dc3b388543dff4654b7cb19445d635b053a8
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        System.out.println("proto");
        System.out.println(applicationContext.getBean(Proto.class));
        System.out.println(applicationContext.getBean(Proto.class));
        System.out.println(applicationContext.getBean(Proto.class));
        System.out.println("single");
        System.out.println(applicationContext.getBean(Single.class));
        System.out.println(applicationContext.getBean(Single.class));
        System.out.println(applicationContext.getBean(Single.class));

        System.out.println("single's prototype");
        System.out.println(applicationContext.getBean(Single.class).getProto());
        System.out.println(applicationContext.getBean(Single.class).getProto());
        System.out.println(applicationContext.getBean(Single.class).getProto());
    }
}
