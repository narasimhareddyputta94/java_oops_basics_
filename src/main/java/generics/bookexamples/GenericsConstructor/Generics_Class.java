package generics.bookexamples.GenericsConstructor;

public class Generics_Class {

    private double val;

    <T extends Number> Generics_Class(T arg) {
        val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}
