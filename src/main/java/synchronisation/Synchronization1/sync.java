package synchronisation.Synchronization1;

public class sync {
    public static void main(String[] args) {
        callme target = new callme();
        caller ob1 = new caller(target,"hello");
        caller ob2 = new caller(target,"synchronised");
        caller ob3 = new caller(target,"key");


        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e ){
            System.out.println(e.getMessage());
        }

    }
}
