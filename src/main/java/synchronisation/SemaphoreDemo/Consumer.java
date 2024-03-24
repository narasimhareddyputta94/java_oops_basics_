package synchronisation.SemaphoreDemo;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Shirt> store;

    private String name;

    private int MaxSize;

    Semaphore semaphoreproducer;
    Semaphore semaphoreconsumer;


    public Consumer(Queue<Shirt> store,String name,int MaxSize,Semaphore semaphoreproducer,Semaphore semaphoreconsumer){
        this.store = store;
        this.name = name;
        this.MaxSize = MaxSize;
        this.semaphoreproducer = semaphoreproducer;
        this.semaphoreconsumer = semaphoreconsumer;
    }

    public void run(){

        while(true) {
                try{
                    semaphoreconsumer.acquire();
                    System.out.println("inside Consumer Current size :" + store.size());
                    store.remove();
                    semaphoreproducer.release();

                }
                catch(Exception e){
                    e.getMessage();
                }

            }
        }

    }
