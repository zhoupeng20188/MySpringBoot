package com.example.demo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author zp
 * @create 2020/1/6 10:56
 */
@Configuration
@PropertySource("test.property")
@ConfigurationProperties(prefix = "test")
@Data
public class PropertySourceConfigurationTest {
    private String age;
}
