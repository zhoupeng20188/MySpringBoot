package com.example.demo.beandefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;

/**
 * @Author zhoupeng
 * @Date 2022-08-06 20:15
 */
public class A implements BeanDefinitionRegistryPostProcessor {

    public A() {
        System.out.println("A constructor");
    }

    @Bean
    public B b() {
        return new B();
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
