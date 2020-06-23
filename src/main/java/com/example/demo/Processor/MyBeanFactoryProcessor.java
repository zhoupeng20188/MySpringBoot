package com.example.demo.Processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author zp
 * @create 2019/7/30 10:38
 */
@Configuration
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println(System.currentTimeMillis() + " BeanFactoryPostProcessor postProcessBeanFactory called");
        System.out.println(configurableListableBeanFactory.getBeanDefinition("testBean4").getScope());
    }
}
