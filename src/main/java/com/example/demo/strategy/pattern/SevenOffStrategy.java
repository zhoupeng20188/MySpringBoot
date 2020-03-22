package com.example.demo.strategy.pattern;

import org.springframework.stereotype.Component;

@Component
public class SevenOffStrategy implements Strategy {
    public boolean support(Integer i) {
        return i == 3 ? true : false;
    }

    public void doStrategy() {
        System.out.println("打7折");
    }
}
