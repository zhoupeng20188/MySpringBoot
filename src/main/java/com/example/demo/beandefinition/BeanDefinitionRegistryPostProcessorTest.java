package com.example.demo.beandefinition;

import com.example.demo.bean.CowImpl;
import com.example.demo.bean.TestBeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zp
 * @create 2020/1/6 14:44
 */
@Configuration
public class BeanDefinitionRegistryPostProcessorTest implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("============BeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry enter============");
        // 注册bean，移动bean等操作
        // 创建一个bean的定义类的对象
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(CowImpl.class);
        beanDefinitionRegistry.registerBeanDefinition(CowImpl.class.getName(),rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("============BeanDefinitionRegistryPostProcessor postProcessBeanFactory enter============");
        // 修改bean的属性，与BeanFactoryPostProcessor里的方法一样
        TestBeanFactory testBeanFactory = configurableListableBeanFactory.getBean(TestBeanFactory.class);
        testBeanFactory.setName("BeanFactoryChanged by BeanDefinitionRegistryPostProcessor");
    }
}
