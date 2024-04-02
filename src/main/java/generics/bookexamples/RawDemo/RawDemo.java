package generics.bookexamples.RawDemo;

public class RawDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Generics Test");

        Gen raw = new Gen(98.6);
        double d = (Double) raw.getob();
        System.out.println("value: " + d);

//        int i = (Integer) raw.getob();
//        System.out.println("value: " + i);

        strOb = raw;
//        String str = strOb.getob();
//        System.out.println("value: " + str);

        raw = iOb;
//        d = (Double) raw.getob();
//        System.out.println("value: " + d);
    }
}
