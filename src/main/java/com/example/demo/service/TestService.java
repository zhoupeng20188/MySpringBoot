package com.example.demo.service;

import com.example.demo.bean.TestBean3;
import com.example.demo.bean.TestBean4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zp
 * @create 2019/7/23 15:26
 */
@Service
public class TestService {
    @Autowired
    private TestBean3 testBean3;

    @Autowired
    private TestBean4 testBean4;

    public String testFactoryBean(){
        return testBean3.getName();
    }

    public Object testAware(){
        return testBean4.getTestBean3();
    }
}
