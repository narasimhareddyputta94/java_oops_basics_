package IntroToThreads.printNumber;

public class NumberPrinter implements Runnable{

    int toPrint;

    public  NumberPrinter(int toPrint){
        this.toPrint = toPrint;
    }

    public void run(){
        System.out.println("This number is printed by thread" + Thread.currentThread().getName() +" => "+ toPrint);



    }

}
