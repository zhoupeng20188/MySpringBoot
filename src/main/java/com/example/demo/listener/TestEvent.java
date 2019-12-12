package com.example.demo.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @Author zp
 * @create 2019/7/30 15:35
 */
public class TestEvent extends ApplicationEvent {
    public String msg;

    public TestEvent(Object source) {
        super(source);
    }

    public TestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public void print() {
        System.out.println(msg);
    }
}
