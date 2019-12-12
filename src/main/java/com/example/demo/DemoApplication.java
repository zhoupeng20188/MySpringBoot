package com.example.demo;

import com.example.demo.bean.TestBean;
import com.example.demo.bean.TestBean2;
import com.example.demo.listener.TestEvent;
import com.example.demo.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * bean的执行顺序：
 * postProcessBeforeInstantiation -- InstantiationAwareBeanPostProcessor接口
 * constructor --bean自身的构造函数
 * postProcessAfterInstantiation -- InstantiationAwareBeanPostProcessor接口
 * postProcessBeforeInitialization --BeanPostProcessor接口
 * afterPropertiesSet -- bean实现的InitializingBean接口
 * postProcessAfterInitialization --BeanPostProcessor接口
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        TestBean testBean = run.getBean(TestBean.class);
        TestBean2 testBean2 = run.getBean(TestBean2.class);
        System.out.println(testBean);
        System.out.println(testBean2);
        TestService testService = run.getBean(TestService.class);
        System.out.println(testService.testFactoryBean());
        System.out.println(testService.testAware());
        TestEvent testEvent = new TestEvent("hello", "msg");
        run.publishEvent(testEvent);
        testEvent.msg = "2342";
        run.publishEvent(testEvent);
    }

}
