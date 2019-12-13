package com.example.demo.controller;

import com.example.demo.property.PropertyTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zp
 * @create 2019/12/13 14:38
 */
@RestController
//@EnableConfigurationProperties(PropertyTest.class)
public class PropertyController {
    @Autowired
    PropertyTest propertyTest;

    @RequestMapping("/getAppId")
    public String getAppId(){
        return propertyTest.getId();
    }

}
