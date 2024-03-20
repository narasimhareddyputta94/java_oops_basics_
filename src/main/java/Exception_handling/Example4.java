package Exception_handling;

import java.util.Random;

public class Example4 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        Random r = new Random();

        for(int i = 0;i<3200;i++){
            try{
                b = r.nextInt();
                c = r.nextInt();
                a = 12345/(b/c);
            }
            catch( ArithmeticException e){
                System.out.println("Exception :"+ e);
                System.out.println("Division is by zero");
            }

            System.out.println("a : " + a);
        }
    }
}
