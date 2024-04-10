package Bookexamples.bookexamples.GenericsConstructor;

public class GenConDemo {
    public static void main(String[] args) {
        Generics_Class iOb = new Generics_Class(100);
        Generics_Class dOb = new Generics_Class(123.5);
        Generics_Class dOb1 = new Generics_Class(123.5F);


        iOb.showVal();
        dOb.showVal();
        dOb1.showVal();

    }
}
