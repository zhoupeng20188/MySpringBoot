package com.example.demo.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("osbean")
public class OSFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        String property = System.getProperty("os.name");
        System.out.println(property);
        if(property.startsWith("Win")){
            return new WindowsOSBean();
        } else {
            return new MacOSBean();
        }
    }

    @Override
    public Class<?> getObjectType() {
        return OSBean.class;
    }
}
