package IntroToThreads.Multiple_Thread;

public class MultiThread {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("one");
        NewThread t2 = new NewThread("two");
        NewThread t3 = new NewThread("three");

        t1.t.start();
        t2.t.start();
        t3.t.start();

        try{
                Thread.sleep(10000);
        }
        catch(InterruptedException e ){
            System.out.println("Main thread intercepoted");
        }

        System.out.println("Main thread is exciting");


    }
}
