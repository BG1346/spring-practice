package com.example.ioc_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Single {
    @Autowired
    private Proto proto;

//    @Autowired
//    ApplicationContext applicationContext;

    public Proto getProto() {
        return proto;
    }
}
