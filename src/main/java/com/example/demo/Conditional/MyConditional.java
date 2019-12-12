package com.example.demo.Conditional;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author zp
 * @create 2019/7/31 16:44
 */
public class MyConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        String system = env.getProperty("os.name");
        System.out.println("系统环境为 ==="+system);
        // 系统环境在Windows才加载该bean到容器中
        if(system.contains("Windows")){
            return true;
        }
        return false;
    }
}
