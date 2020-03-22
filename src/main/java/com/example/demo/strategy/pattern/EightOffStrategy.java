package com.example.demo.strategy.pattern;

import org.springframework.stereotype.Component;

@Component
public class EightOffStrategy implements Strategy {
    public boolean support(Integer i) {
        return i == 2 ? true : false;
    }

    public void doStrategy() {
        System.out.println("打8折");
    }
}
