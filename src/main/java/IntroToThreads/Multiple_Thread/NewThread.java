package IntroToThreads.Multiple_Thread;

public class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String threadname){
        name = threadname;
        t = new Thread(this,name);
        System.out.println("New Thread : " + t );
    }

    public void run(){
        try{
            for(int i = 0;i<=5;i++){
                System.out.println(name + " : " + i);
                t.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage() + "Interepted");
        }

        System.out.println(name + " : " + "Exiting");
    }
}
