package com.example.demo.config;

import com.example.demo.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zp
 * @create 2019/7/23 14:25
 */
@Configuration
public class TestConfig {
    @Bean
    TestBean testBean(){
        return new TestBean(1,"sss");
    }
}
