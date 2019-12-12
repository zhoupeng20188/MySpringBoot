package com.example.demo.bean;

import com.example.demo.Conditional.MyConditional;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @Author zp
 * @create 2019/7/23 14:19
 */
@Component
@Conditional(value = MyConditional.class)
public class TestBean2 implements InitializingBean, DisposableBean {
//    TestBean3 testBean3;
//
//    @Autowired
//    public void setTestBean3(TestBean3 testBean3){
//        System.out.println("注入testBean3");
//        this.testBean3 = testBean3;
//    }


    public TestBean2() {
        System.out.println(System.currentTimeMillis() + " TestBean2 constructor called");
        this.id = 1;
    }

    private Integer id = 1;
    private String name;

    public Integer getId() {

        System.out.println("get id done");
        return id;
    }

    public void setId(Integer id) {
        System.out.println("set id done");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
