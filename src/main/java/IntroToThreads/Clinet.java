package IntroToThreads;

public class Clinet {

    void dosomething(){
        System.out.println("Inside dosomething : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello World this is printed by : " + Thread.currentThread().getName());

        Clinet c = new Clinet();
        c.dosomething();
    }

}
