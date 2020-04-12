package test.AnnotationConfigApplicationContextDemo.createbean;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by smlz on 2019/6/3.
 */
@Configuration
//@ComponentScan(basePackages = {"com.tuling.testcreatebeaninst"})
public class MainConfig {

    @Bean(autowire = Autowire.NO)
    public MyAspect tulingAspect() {
        return new MyAspect();
    }

    @Bean
    @Primary
    public TulingLog tulingLog() {
        return new TulingLog();
    }

    @Bean
    public TulingLog tulingLog2() {
        return new TulingLog();
    }

}
