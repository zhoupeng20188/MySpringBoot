package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author zp
 * @create 2019/7/23 16:02
 */
@Order(1)
@Component
public class TestRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(System.currentTimeMillis() + ": i am TestRunner!!!");
    }
}
