package com.example.demo.Conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.stereotype.Component;

/**
 * @Author zp
 * @create 2020/9/30 9:33
 */
@Component
// 类存在时才将此bean加入到spring容器中
//@ConditionalOnClass(name = "com.example.demo.ZpTest")
// 类不存在时才将此bean加入到spring容器中
@ConditionalOnMissingClass("com.example.demo.ZpTest")
public class ConditionalTest {

}
