package com.example.demo.property;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurablePropertyResolver;

import java.util.Properties;

/**
 * @Author zp
 * @create 2020/1/6 15:09
 */
@Configuration
public class PropertySourcesPlaceHolderConfigurationTest extends PropertySourcesPlaceholderConfigurer {
    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, ConfigurablePropertyResolver propertyResolver) throws BeansException {
        System.out.println("===========PropertySourcesPlaceholderConfigurer processProperties enter====================");
        super.processProperties(beanFactoryToProcess, propertyResolver);
        String property = propertyResolver.getProperty("test.name");
        System.out.println(property);

    }
}
