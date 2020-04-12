package test.AnnotationConfigApplicationContextDemo.createbean;



public class MyAspect {

    private MyLog myLog;



    public MyLog getTulingLog() {
        return myLog;
    }

    public void setTulingLog(MyLog tulingLog) {
        this.myLog = tulingLog;
    }

    @Override
    public String toString() {
        return "MyAspect{" +
                "MyLog=" + myLog +
                '}';
    }
}
