package synchronisation.SemaphoreDemo;

import java.util.List;
import java.util.Queue;

public class Consumer implements Runnable{

    private Queue<Shirt> store;

    private String name;

    private int MaxSize;

    public Consumer(Queue<Shirt> store,String name,int MaxSize){
        this.store = store;
        this.name = name;
        this.MaxSize = MaxSize;
    }

    public void run(){

        while(true) {
            if (store.size() > 0) {
                System.out.println("inside Consumer Current size :" + store.size());
                store.remove();
            }
        }

    }
}
