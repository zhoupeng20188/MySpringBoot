package com.example.demo.controller;

import com.example.demo.service.TestInterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zp
 * @create 2020/1/8 10:02
 */
@RestController
public class TestInterController {
    /**
     * 如果接口只有一个实现类，可以直接注入接口
     * 如果有多个实现类，则需要指定实现类的名字
     */
    @Qualifier("testInterServiceImpl2")
    @Autowired
    private TestInterService testInterService;

    @RequestMapping("/inter/test")
    public String test(){
        return testInterService.test();
    }
}
