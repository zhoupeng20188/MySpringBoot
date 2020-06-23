package com.example.demo.Processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 实现BeanPostProcessor接口可以在bean加载时做一些事件
 *
 * @Author zp
 * @create 2019/7/23 14:16
 */
@Component
public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // bean初始化之前执行
        if (beanName.indexOf("test") != -1) {

            System.out.println(System.currentTimeMillis() + ": Bean '" + beanName + "' BeanPostProcessor postProcessBeforeInitialization called");
        }
        return bean; // 在这里其实可以返回任何对象
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 在bean初始化之后，打印toString()的内容到控制台
        if (beanName.indexOf("test") != -1) {

            System.out.println(System.currentTimeMillis() + ": Bean '" + beanName + "' BeanPostProcessor  postProcessAfterInitialization called");
        }
        return bean;
    }
}
