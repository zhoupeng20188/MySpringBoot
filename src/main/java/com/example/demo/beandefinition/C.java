package com.example.demo.beandefinition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author zhoupeng
 * @Date 2022-08-06 20:19
 */
public class C implements ImportBeanDefinitionRegistrar {

    public C() {
        System.out.println("C constructor");
    }

    @Bean
    D d(){
        return new D();
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

    }
}
