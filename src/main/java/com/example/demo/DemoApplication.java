package com.example.demo;

import com.example.demo.bean.TestBean;
import com.example.demo.bean.TestBean2;
import com.example.demo.bean.TestBeanFactory;
import com.example.demo.beandefinition.*;
import com.example.demo.bean.CowImpl;
import com.example.demo.factorybean.OSBean;
import com.example.demo.listener.TestEvent;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * bean的执行顺序：
 * registerBeanDefinitions  --ImportBeanDefinitionRegistrar接口 --可以注册新的bean
 * postProcessBeanDefinitionRegistry  --BeanDefinitionRegistryPostProcessor接口 --同上
 * postProcessBeanFactory             --BeanDefinitionRegistryPostProcessor接口 --同下
 * postProcessBeanFactory  --BeanFactoryPostProcessor接口 --可以获取bean的定义，修改bean
 * postProcessBeforeInstantiation -- InstantiationAwareBeanPostProcessor接口 --bean实例化前
 * constructor --bean自身的构造函数
 * postProcessAfterInstantiation -- InstantiationAwareBeanPostProcessor接口 --bean实例化后
 * xxAware设定
 * postProcessBeforeInitialization --BeanPostProcessor接口 --bean初始化前
 * PostConstruct --@PostConstruct注解
 * afterPropertiesSet -- bean实现的InitializingBean接口
 * postProcessAfterInitialization --BeanPostProcessor接口 --bean初始化后
 */
@SpringBootApplication
@Import({A.class, C.class, E.class})
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
//        TestBean testBean = run.getBean(TestBean.class);
//        TestBean2 testBean2 = run.getBean(TestBean2.class);
//        System.out.println(testBean);
//        System.out.println(testBean2);
//        TestService testService = run.getBean(TestService.class);
//        System.out.println(testService.testFactoryBean());
//        System.out.println(testService.testAware());
//        TestEvent testEvent = new TestEvent("hello", "msg");
//        run.publishEvent(testEvent);
//        testEvent.msg = "2342";
//        run.publishEvent(testEvent);
//        CatImpl cat = run.getBean(CatImpl.class);
//        DogImpl dog = run.getBean(DogImpl.class);
//        CowImpl cow = run.getBean(CowImpl.class);
//        cat.go();
//        dog.go();
//        cow.go();
//        TestBeanFactory testBeanFactory = run.getBean(TestBeanFactory.class);
//        System.out.println(testBeanFactory.getName());
//        ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
//        String s = beanFactory.resolveEmbeddedValue("${app.name}");
//        System.out.println("${app.name}值为" + s);
//        OSBean osFactoryBean = (OSBean) run.getBean("osbean");
//        osFactoryBean.show();
//        System.out.println(run.getBean("conditionalTestBean"));
//        System.out.println(run.getBean("conditionalTest"));
    }

}
