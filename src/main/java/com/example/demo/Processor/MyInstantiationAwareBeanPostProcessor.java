package com.example.demo.Processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zp
 * @create 2019/7/30 10:53
 */
@Configuration
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.indexOf("test") != -1) {
            // 在bean的构造函数调用前执行
            System.out.println(System.currentTimeMillis() +  beanName + " InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation called");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.indexOf("test") != -1) {
            // 在bean的构造函数调用后执行
            System.out.println(System.currentTimeMillis() + beanName + " InstantiationAwareBeanPostProcessor postProcessAfterInstantiation called");
        }
        return true;
    }
}
