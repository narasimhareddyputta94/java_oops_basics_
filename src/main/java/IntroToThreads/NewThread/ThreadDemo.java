package IntroToThreads.NewThread;

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();

        nt.t.start();

        try{
            for(int i = 50;i>0;i--){
                System.out.println("Main Thread :" + i);
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main Thread got interepted");
        }

        System.out.println("Main Thread exiting.");
    }
}
