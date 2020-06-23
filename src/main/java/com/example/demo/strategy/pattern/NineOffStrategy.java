package com.example.demo.strategy.pattern;

import org.springframework.stereotype.Component;

@Component
public class NineOffStrategy implements Strategy {
    public boolean support(Integer i) {
        return i == 1 ? true : false;
    }

    public void doStrategy() {
        System.out.println("打9折");
    }
}
