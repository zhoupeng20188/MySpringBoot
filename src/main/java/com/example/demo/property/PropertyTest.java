package com.example.demo.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ConfigurationProperties与@Value主要区别为@Value只能为一个变量赋值，
 * @ConfigurationProperties只可以批量赋值
 * @Author zp
 * @create 2019/12/13 14:30
 */
@Configuration
@ConfigurationProperties(prefix = "app")
public class PropertyTest {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
