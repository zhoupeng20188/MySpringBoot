package com.example.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

/**
 * @Author zp
 * @create 2019/7/23 14:19
 */
public class TestBean implements InitializingBean,BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private Integer id;
    private String name;

    public TestBean(Integer id, String name) {
        System.out.println(System.currentTimeMillis() + " TestBean constructor called");
        this.id = id;
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println(System.currentTimeMillis() + ": PostConstruct has been called!");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println(" TestBean set id done");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println(System.currentTimeMillis() + " beanFactory is " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(System.currentTimeMillis() + " beanName is " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(System.currentTimeMillis() + " applicationContext is " + applicationContext);

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(System.currentTimeMillis() +  "afterPropertiesSet called");
    }


}
