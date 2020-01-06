package com.example.demo.bean;

import com.example.demo.beandefinition.Animal;

/**
 * @Author zp
 * @create 2020/1/6 11:18
 */
public class CowImpl implements Animal {
    @Override
    public void go() {
        System.out.println("i am cow");
    }
}
