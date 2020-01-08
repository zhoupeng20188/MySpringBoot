package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * @Author zp
 * @create 2020/1/8 10:01
 */
@Service
public class TestInterServiceImpl2 implements TestInterService {
    @Override
    public String test() {
        return "TestInterServiceImpl2 test";
    }
}
