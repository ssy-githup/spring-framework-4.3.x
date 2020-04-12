package test.AnnotationConfigApplicationContextDemo.createbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 创建相互依赖的bean
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(context.getBean("MyAspect"));
    }
}
