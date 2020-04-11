package test.AnnotationConfigApplicationContextDemo.beanfacotoryPostProcessor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "test.AnnotationConfigApplicationContextDemo.beanfacotoryPostProcessor")
public class MainConfig {

}
