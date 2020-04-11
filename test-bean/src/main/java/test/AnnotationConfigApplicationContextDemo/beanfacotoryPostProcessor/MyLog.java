package test.AnnotationConfigApplicationContextDemo.beanfacotoryPostProcessor;

import org.springframework.beans.factory.annotation.Value;


public class MyLog {

    @Value("1")
    private int flag;

    @Override
    public String toString() {
        return "{" +
                "flag=" + flag +
                '}';
    }

    public MyLog() {

        System.out.println("我是构造方法");
    }



    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
