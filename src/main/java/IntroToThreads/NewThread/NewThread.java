package IntroToThreads.NewThread;


public class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this,"Demo Thread");
        System.out.println("child Thread : " + t);

    }

    public void run(){
        try{
            for(int i = 50;i>0;i--){
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("child interepted");
        }

        System.out.println("Existing child Thread");
    }
}
