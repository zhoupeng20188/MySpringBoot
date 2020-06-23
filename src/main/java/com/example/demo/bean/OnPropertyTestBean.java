package com.example.demo.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * matchIfMissing = true表示当属性app.id不存在时也加入容器
 * @Author zp
 * @create 2020/6/23 20:01
 */
@Component
@ConditionalOnProperty(prefix = "app", value = "id", matchIfMissing = true)
public class OnPropertyTestBean implements EnvironmentAware {

    Environment environment;

    /**
     * 当属性app.fff不存在时不加入容器，只有当app.fff存在时才加入
     * matchIfMissing不指定时默认为false
     * @return
     */
    @Bean
    @ConditionalOnProperty(prefix = "app", value = "fff")
    OnPropertyTestBean2 sss(){
        String property = environment.getProperty("app.fff", String.class);
        Assert.hasText(property, "app.fff cant be null");
        return new OnPropertyTestBean2();
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
