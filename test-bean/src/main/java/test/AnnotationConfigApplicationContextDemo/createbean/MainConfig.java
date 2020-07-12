package test.AnnotationConfigApplicationContextDemo.createbean;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = {"test.AnnotationConfigApplicationContextDemo"})
public class MainConfig {

    @Bean(autowire = Autowire.NO)
    public MyAspect tulingAspect() {
        return new MyAspect();
    }

    @Bean
    @Primary
    public MyLog tulingLog() {
        return new MyLog();
    }

    @Bean
    public MyLog tulingLog2() {
        return new MyLog();
    }

}
