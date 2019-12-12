package com.example.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author zp
 * @create 2019/7/23 14:19
 */
@Component
public class TestBean4 implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Object getTestBean3(){
        return applicationContext.getBean(TestBean3.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
