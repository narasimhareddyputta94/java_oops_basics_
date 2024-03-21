package IntroToThreads.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run(){
        System.out.println("Inside run : " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());

    }
}
