package com.example.demo.beanfactory;

import com.example.demo.bean.TestBeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zp
 * @create 2020/1/6 11:52
 */
@Configuration
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("============BeanFactoryPostProcessor postProcessBeanFactory enter============");
        // 在这个方法里可以在生成BeanDefinition对象后改变bean的属性
        TestBeanFactory testBeanFactory = configurableListableBeanFactory.getBean(TestBeanFactory.class);
        testBeanFactory.setName("BeanFactoryChanged by BeanFactoryPostProcessor");

    }
}
