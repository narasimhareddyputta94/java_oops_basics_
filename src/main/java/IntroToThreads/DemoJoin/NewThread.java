package IntroToThreads.DemoJoin;

public class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String ThreadName){
        name = ThreadName;
        t = new Thread(this,name);
        System.out.println("NewThread " + ": " + t);
    }

    public void run(){
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(name + " " + i);
                t.sleep(1000);

            }
        }
        catch(InterruptedException e ){
            System.out.println("child got interepted");
        }
    }
}
