package AdderSubtractorinlamdas;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clinet {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Runnable AdderLamda = () -> {
            for(int i = 1;i<=10000;i++){
                lock.lock();
                count.value += i;
                lock.unlock();
            }
        };

        Runnable SubtractorLamda = () -> {
            for(int i = 1;i<=10000;i++){
                lock.lock();
                count.value -= i;
                lock.unlock();
            }
        };

        Thread thread1 = new Thread(AdderLamda);
        Thread thread2 = new Thread(SubtractorLamda);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.print("Both the threads have completed" + " count : " + count.value);



    }
}
