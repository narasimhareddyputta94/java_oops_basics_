package Bookexamples.bookexamples.GenHierarcy.HeirDemo;

public class HeirDemo {
    public static void main(String[] args) {
        Gen2<Integer, String> x = new Gen2<>(100, "Value");
        System.out.println(x.getob2() + " ");
        System.out.println(x.getob());
    }
}
