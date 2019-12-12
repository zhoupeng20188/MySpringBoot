package com.example.demo.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * 当其它地方用到TestBean3时，返回的是此类中getObject方法的对象。
 * @Author zp
 * @create 2019/7/23 15:08
 */
@Component
public class TestFactoryBean implements FactoryBean {
    @Value("${app.id}")
    private String id;

    @Override
    public Object getObject() throws Exception {
        TestBean3 testBean3 = new TestBean3();
        testBean3.setId(2);
        if (id.equals("test")) {
            testBean3.setName("test22223");
        } else {
            testBean3.setName("default~~~~");
        }
        return testBean3;

    }

    @Override
    public Class<?> getObjectType() {
        return TestBean3.class;
    }
}
