package IntroToThreads.DemoJoin;

public class DemoJoin {
    public static void main(String[] args) {

        NewThread t1 = new NewThread("one");
        NewThread t2 = new NewThread("two");
        NewThread t3 = new NewThread("Three");

        t1.t.start();
        t2.t.start();
        t3.t.start();

        System.out.println("Thread one is alive " + t1.t.isAlive());
        System.out.println("Thread one is alive " + t2.t.isAlive());
        System.out.println("Thread one is alive " + t3.t.isAlive());

        try{
            System.out.println("waiting for threads to finish");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread got interepted");
        }

        System.out.println("Thread one is alive " + t1.t.isAlive());
        System.out.println("Thread one is alive " + t2.t.isAlive());
        System.out.println("Thread one is alive " + t3.t.isAlive());

        System.out.println("Main Thread Exiting");





    }
}
