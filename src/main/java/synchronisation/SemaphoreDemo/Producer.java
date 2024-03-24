package synchronisation.SemaphoreDemo;
import java.util.*;

public class Producer implements Runnable{

    private Queue<Shirt> store;

    private String name;

    private int MaxSize;

    public Producer(Queue<Shirt> store,String name,int MaxSize){
        this.store = store;
        this.name = name;
        this.MaxSize = MaxSize;
    }


    public void run(){
        while(true) {
            if (store.size() < 5) {
                System.out.println("inside producer Current size :" + store.size());
                store.add(new Shirt());
            }
        }

    }
}
