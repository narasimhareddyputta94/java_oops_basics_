package Exception_handling;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int val[] = {1, 2, 3};

        try {
            int result = a / b;
            val[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception : " + e);
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}
