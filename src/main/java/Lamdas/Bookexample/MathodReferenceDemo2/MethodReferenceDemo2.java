package Lamdas.Bookexample.MathodReferenceDemo2;

public class MethodReferenceDemo2 {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lamdas add power to Java";
        String outStr;

        MyStringOps strOps = new MyStringOps();

        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("The string : " + inStr);

        System.out.println("The string reversed: " + outStr);
    }
}
