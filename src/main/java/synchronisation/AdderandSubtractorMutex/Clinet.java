package synchronisation.AdderandSubtractorMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clinet {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count,lock);
        Subtractor subtractor = new Subtractor(count,lock);

        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subtractor);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.print("Both the threads have completed" + " count : " + count.value);

    }
}
