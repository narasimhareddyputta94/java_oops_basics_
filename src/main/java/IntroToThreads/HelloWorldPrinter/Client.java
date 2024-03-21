package IntroToThreads.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("iam currently in : " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
//        t.run();


        System.out.println("this is written at the end of main method "+ Thread.currentThread().getName() + " " + Thread.currentThread().getId());
    }
}
