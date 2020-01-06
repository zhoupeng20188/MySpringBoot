package com.example.demo.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @PropertySource可以从自定义文件里读取配置，读取后可以用@Value绑定到某一个字符串上
 * 也可以用@ConfigurationProperties来绑定给一个对象
 * @Author zp
 * @create 2020/1/6 10:19
 */
@Component
@PropertySource(value = "test.property")
@Data
public class PropertySourceValueTest {
    @Value("${test.name}")
    private String name;
}
