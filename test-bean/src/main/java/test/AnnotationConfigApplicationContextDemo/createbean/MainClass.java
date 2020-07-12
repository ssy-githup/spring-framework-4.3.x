package test.AnnotationConfigApplicationContextDemo.createbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 创建相互依赖的bean
 * spring 是如何解决循环依赖的
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(context.getBean("Person"));
    }
}
