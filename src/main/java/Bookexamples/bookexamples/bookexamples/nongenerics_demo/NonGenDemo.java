package Bookexamples.bookexamples.bookexamples.nongenerics_demo;

public class NonGenDemo {

    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getob();
        System.out.println("value: " + v);

        System.out.println();

        NonGen strOb = new NonGen("Generics Test");
        strOb.showType();
        String str = (String) strOb.getob();
        System.out.println("value: " + str);
    }
}
