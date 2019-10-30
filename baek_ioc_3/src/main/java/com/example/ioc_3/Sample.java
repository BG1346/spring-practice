package com.example.ioc_3;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Sample {
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int data = 2000;

}
