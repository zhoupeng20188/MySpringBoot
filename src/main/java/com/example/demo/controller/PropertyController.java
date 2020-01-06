package com.example.demo.controller;

import com.example.demo.property.ConfigurationPropertiesTest;
import com.example.demo.property.PropertySourceConfigurationTest;
import com.example.demo.property.PropertySourceValueTest;
import org.springframework.beans.factory.annotation.Autowired;
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
    ConfigurationPropertiesTest configurationPropertiesTest;

    @Autowired
    PropertySourceValueTest propertySourceValueTest;

    @Autowired
    PropertySourceConfigurationTest propertySourceConfigurationTest;

    @RequestMapping("/getAppId")
    public String getAppId(){
        return configurationPropertiesTest.getId();
    }

    @RequestMapping("/getName")
    public String getName(){
        return propertySourceValueTest.getName();
    }

    @RequestMapping("/getAge")
    public String getAge(){
        return propertySourceConfigurationTest.getAge();
    }

}
