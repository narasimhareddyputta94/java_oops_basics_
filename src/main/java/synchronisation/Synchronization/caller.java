package synchronisation.Synchronization;

public class caller implements Runnable{
    callme target;
    String msg;
    Thread t;

    public caller(callme target,String msg){
        this.target = target;
        this.msg = msg;
        this.t = new Thread(this);
    }

    public void run(){
        target.call(msg);
    }


}
