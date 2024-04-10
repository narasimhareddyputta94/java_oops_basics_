package Bookexamples.bookexamples.GenHierarcy.HeirDemo2;

public class HeirDemo {
    public static void main(String[] args) {

        Gen<String> W = new Gen<String>("Hello", 10);
        System.out.print(W.getob()+" ");
        System.out.print(W.getnum());
    }
}
