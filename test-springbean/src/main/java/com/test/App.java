package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName App
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/4/10
 * @Version V1.0
 **/
public class App {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans.xml");

        ctx.getId();

        System.out.println(ctx.getId());
        TestBean tb = ctx.getBean(TestBean.class);
        tb.test();

    }
}
