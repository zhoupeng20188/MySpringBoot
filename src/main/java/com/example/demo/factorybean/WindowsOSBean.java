package com.example.demo.factorybean;

public class WindowsOSBean implements OSBean {
    @Override
    public void show() {
        System.out.println("i am windows os");
    }
}
