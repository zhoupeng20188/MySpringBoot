package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zp
 * @create 2019/7/8 11:21
 */
@RestController
public class IndexController {
    @RequestMapping("/redirect/me")
    public String index(HttpServletResponse response) throws IOException {
        String str = "i am 8099 port!";
        System.out.println(str);
        response.sendRedirect("http://localhost:8080/token/me");
        return str;
    }
    @RequestMapping("test")
    public String test(){
        return "sdfsdfds123";
    }
}
