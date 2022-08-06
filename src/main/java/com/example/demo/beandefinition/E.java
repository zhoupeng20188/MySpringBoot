package com.example.demo.beandefinition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author zhoupeng
 * @Date 2022-08-06 20:39
 */
public class E implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"com.example.demo.beandefinition.F"};
    }
}
