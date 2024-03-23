package IntroToThreads.printNumber;

import java.util.concurrent.ExecutorCompletionService;

public class Client {
    public static void main(String[] args) {
        for(int i = 1;i<=100000;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
//            System.out.println("Clinet : "+ numberPrinter + "value:" + numberPrinter.toPrint);
            Thread thread  = new Thread(numberPrinter);
            thread.start();
        }
    }
}
