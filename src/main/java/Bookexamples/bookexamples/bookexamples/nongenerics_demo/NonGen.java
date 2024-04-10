package Bookexamples.bookexamples.bookexamples.nongenerics_demo;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}
