package com.example.demo.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zp
 * @create 2019/7/30 15:36
 */
@Configuration
public class TestEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        // 每当publishEvent方法调用时就会进到此函数里
        if (applicationEvent instanceof TestEvent) {
            ((TestEvent) applicationEvent).print();
        }
    }
}
