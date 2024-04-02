package generics.bookexamples.overideDemo;

public class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<Integer>(88);
        Gen2<Integer> iob2 = new Gen2<Integer>(99);
        Gen2<String> strob2 = new Gen2<String>("Generics Test");

        System.out.println(iob.getob());
        System.out.println(iob2.getob());
        System.out.println(strob2.getob());
    }
}
