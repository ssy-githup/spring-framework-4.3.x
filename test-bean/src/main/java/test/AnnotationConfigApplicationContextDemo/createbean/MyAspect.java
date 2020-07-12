package test.AnnotationConfigApplicationContextDemo.createbean;



public class MyAspect {

    private MyLog myLog;



    public MyLog getMyLog() {
        return myLog;
    }

    public void setMyLog(MyLog tulingLog) {
        this.myLog = tulingLog;
    }

    @Override
    public String toString() {
        return "MyAspect{" +
                "MyLog=" + myLog +
                '}';
    }
}
