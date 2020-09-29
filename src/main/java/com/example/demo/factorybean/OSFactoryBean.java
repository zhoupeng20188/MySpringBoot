package com.example.demo.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class OSFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        String property = System.getProperty("os.name");
        if("mac".equals(property)){
            return new MacOSBean();
        } else {
            return new WindowsOSBean();
        }
    }

    @Override
    public Class<?> getObjectType() {
        return OSBean.class;
    }
}
