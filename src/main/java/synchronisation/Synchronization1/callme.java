package synchronisation.Synchronization1;

public class callme {
    synchronized void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.print("Intereppted");
        }

        System.out.println("]");
    }
}
