package IntroToThreads;

public class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread t  = Thread.currentThread();

        System.out.println("current thread : "+ t.getName());

        System.out.println("Before name change : "+ t);

        t.setName("My Thread");

        System.out.println("After name change : "+ t);

        try{
            for(int i = 500000;i>0;i--){
                System.out.println(i);
                t.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.print("Main thread interepted");
        }
    }
}
