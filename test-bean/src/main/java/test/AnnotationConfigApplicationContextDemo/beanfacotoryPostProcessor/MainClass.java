package test.AnnotationConfigApplicationContextDemo.beanfacotoryPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 測試 AnnotationConfigApplicationContext
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        //System.out.println(ctx.getBean(TulingLog.class));

    }
}
