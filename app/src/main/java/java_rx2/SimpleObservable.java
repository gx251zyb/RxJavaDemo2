package java_rx2;

import java.util.Observable;

/**
 * Created by Administrator on 2017/3/31.
 */

public class SimpleObservable extends Observable {
    private  int data=0;
    public int getData(){
        return data;
    }
    public void setData(int i){
        if(this.data!=i){
            this.data=i;
            setChanged();//发生改变
            notifyObservers();
            //通知观察者，表示状态发生改变
        }
    }

}
