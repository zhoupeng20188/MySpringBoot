package com.example.demo.beandefinition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.util.Map;
import java.util.Set;

/** 实现ImportBeanDefinitionRegistrar接口可以动态加入额外的bean
 * CatImpl和DogImpl没有加上任何注解，将在此方法中加入到Spring容器中
 * @Author zp
 * @create 2020/1/6 11:14
 */

public class ImportBeanDefinitionTest implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(ComponentScan.class.getName());
        String[] basePackages = (String[]) annotationAttributes.get("basePackages");
        // ClassPathScanningCandidateComponentProvider是Spring提供的工具，
        // 可以按自定义的类型，查找classpath下符合要求的class文件。
        // true：默认TypeFilter生效，这种模式会查询出许多不符合你要求的class名
        // false：关闭默认TypeFilter
        ClassPathScanningCandidateComponentProvider classPathScanningCandidateComponentProvider = new ClassPathScanningCandidateComponentProvider(false);
        // 扫描带有自定义注解的类
//        new AnnotationTypeFilter(ScanAnnotation.class)
        // 接口不会被扫描，其子类会被扫描出来
        TypeFilter filter = new AssignableTypeFilter(Animal.class);
        classPathScanningCandidateComponentProvider.addIncludeFilter(filter);
        for (String basePackage : basePackages) {
            Set<BeanDefinition> candidateComponents = classPathScanningCandidateComponentProvider.findCandidateComponents(basePackage);
            for (BeanDefinition candidateComponent : candidateComponents) {
                // 注册bean
                beanDefinitionRegistry.registerBeanDefinition(candidateComponent.getBeanClassName(), candidateComponent);
            }
        }
    }
}
