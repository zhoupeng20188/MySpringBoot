package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author zp
 * @create 2020/11/9 15:15
 */
@Component
public abstract class AbstractBeanTest {
    @Autowired
    TestBean4 testBean4;

    public void test(){
        testBean4.test();
    }
}
