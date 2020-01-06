package com.example.demo.beandefinition;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author zp
 * @create 2020/1/6 11:20
 */
@Configuration
@ComponentScan("com.example.demo.beandefinition")
@Import(ImportBeanDefinitionTest.class)
public class AnimalConfiguration {
}
