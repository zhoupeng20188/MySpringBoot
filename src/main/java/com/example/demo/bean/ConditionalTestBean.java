package com.example.demo.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 当testBean4存在时只将此bean加入到容器中
 * @Author zp
 * @create 2020/6/23 19:52
 */
@Configuration
@ConditionalOnBean(name = "testBean4")
public class ConditionalTestBean {
    public ConditionalTestBean() {
        System.out.println("ConditionalTestBean constructor");
    }

    /**
     * 当testBean4不存在时才将BeanAnnoTestBean加入到容器中
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(name = "testBean4")
    public BeanAnnoTestBean aaa(){
        return new BeanAnnoTestBean();
    }



}
