package Bookexamples.bookexamples.generics_demo;

public class GENDEMO {
    public static void main(String[] args) {
        GEN<Integer> iOb = new GEN<>(88);
        iOb.show_type();
        int v = iOb.getT();
        System.out.println("value: " + v);

        System.out.println();

        GEN<String> strOb = new GEN<>("Generics Test");
        strOb.show_type();
        String str = strOb.getT();
        System.out.println("value: " + str);
    }
}
