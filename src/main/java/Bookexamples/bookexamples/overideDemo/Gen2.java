package Bookexamples.bookexamples.overideDemo;

public class Gen2 <T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    // Overriding getob() method
    T getob() {
        System.out.println("Gen2's getob(): ");
        return ob;
    }
}
