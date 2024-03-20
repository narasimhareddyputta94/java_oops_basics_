package Exception_handling;

public class Example3 {
    public static void main(String[] args) {
        int d ,a;
        try{
             d = 0;
             a = 10/d;
            System.out.println("jai balaya");
        }
        catch(ArithmeticException e){
            System.out.println("divisible by zero endhi ra ");
        }

        System.out.println("after catch statement");

    }
}
