package com.example.demo.factorybean;

public class MacOSBean implements OSBean {
    @Override
    public void show() {
        System.out.println("i am mac os");
    }
}
