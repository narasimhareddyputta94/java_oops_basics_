package synchronisation.SemaphoreDemo;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Client {
    public static void main(String[] args) {
        Queue<Shirt> store= new ConcurrentLinkedDeque<>();

        int MaxSize = 5;

        Producer p1 = new Producer(store , "P1",MaxSize);
        Producer p2 = new Producer(store , "P2",MaxSize);
        Producer p3 = new Producer(store , "P3",MaxSize);
        Producer p4 = new Producer(store , "P4",MaxSize);
        Producer p5 = new Producer(store , "P5",MaxSize);

        Consumer c1 = new Consumer(store , "C1",MaxSize);
        Consumer c2 = new Consumer(store , "C2",MaxSize);
        Consumer c3 = new Consumer(store , "C3",MaxSize);
        Consumer c4 = new Consumer(store , "C4",MaxSize);
        Consumer c5 = new Consumer(store , "C5",MaxSize);

        Thread tp1 = new Thread(p1);
        tp1.start();
        Thread tp2 = new Thread(p2);
        tp2.start();
        Thread tp3 = new Thread(p3);
        tp3.start();
        Thread tp4 = new Thread(p4);
        tp4.start();
        Thread tp5 = new Thread(p5);
        tp5.start();

        Thread tc1 = new Thread(c1);
        tc1.start();
        Thread tc2 = new Thread(c2);
        tc2.start();
        Thread tc3 = new Thread(c3);
        tc3.start();
        Thread tc4 = new Thread(c4);
        tc4.start();
        Thread tc5 = new Thread(c5);
        tc5.start();









    }
}
