package Exception_handling;

public class Example5 {
    public static void main(String[] args) {
        try{
            int a = 1;
            System.out.println("a : " + a);
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        }

        catch(ArithmeticException e){
            System.out.println("Divide by zero : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob :" + e);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }

        System.out.println("Statement is generated after the try and catch statement");
    }
}
