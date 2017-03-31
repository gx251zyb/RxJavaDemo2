package java_rx2;

/**
 * Created by Administrator on 2017/3/31.
 */

public class MyTest {
    public static void main(String[] args) {
        SimpleObservable simple=new SimpleObservable();
        SimpleObserver observer=new SimpleObserver(simple);
        simple.setData(1);
        simple.setData(2);
        simple.setData(3);



    }
}
