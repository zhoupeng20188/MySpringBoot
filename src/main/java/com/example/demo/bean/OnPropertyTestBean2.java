package com.example.demo.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * @Author zp
 * @create 2020/6/23 20:01
 */

public class OnPropertyTestBean2 {
    public OnPropertyTestBean2() {
        System.out.println("OnPropertyTestBean2 constructor");
    }
}
