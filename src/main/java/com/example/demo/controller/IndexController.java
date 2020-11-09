package com.example.demo.controller;

import com.example.demo.bean.AbstractSonBeanTest;
import com.example.demo.strategy.pattern.ShoppingMall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zp
 * @create 2019/7/8 11:21
 */
@RestController
public class IndexController {

    @Value("${app.name}")
    private String appName;

    @Autowired
    private ShoppingMall shoppingMall;

    @Autowired
    private AbstractSonBeanTest abstractSonBeanTest;

    @RequestMapping("/redirect/me")
    public String index(HttpServletResponse response) throws IOException {
        String str = "i am 8099 port!";
        System.out.println(str);
        response.sendRedirect("http://localhost:8080/token/me");
        return str;
    }
    @RequestMapping("test")
    public String test(){
        shoppingMall.shopping(1);
        shoppingMall.shopping(2);
        shoppingMall.shopping(3);
        return "sdfsdfds12234243nnnn2";
    }

    @RequestMapping("test2")
    public String test2(){
        abstractSonBeanTest.test();
        return "ok";
    }
}
