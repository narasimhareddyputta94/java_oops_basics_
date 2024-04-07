package Lamdas.Bookexample.MathodReferenceDemo;

public class MethodReferenceDemo {
    static String StringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lamdas add power to Java";
        String outStr;

        outStr = StringOp(MyStringOps::strReverse, inStr);

        System.out.println("The string : " + inStr);

        System.out.println("The string reversed: " + outStr);


    }
}
