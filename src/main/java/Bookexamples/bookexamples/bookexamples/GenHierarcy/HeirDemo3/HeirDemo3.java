package Bookexamples.bookexamples.bookexamples.GenHierarcy.HeirDemo3;

public class HeirDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<Integer>(88);
        Gen2<Integer> iob2 = new Gen2<Integer>(99);
        Gen2<String> strob2 = new Gen2<String>("Generics Test");

        if(iob2 instanceof Gen2<?>) {
            System.out.println("iob2 is an instance of Gen2");
        }

        if(iob2 instanceof Gen<?>) {
            System.out.println("iob2 is an instance of Gen");
        }

        System.out.println();

        if(strob2 instanceof Gen2<?>) {
            System.out.println("strob2 is an instance of Gen2");
        }

        if(strob2 instanceof Gen<?>) {
            System.out.println("strob2 is an instance of Gen");
        }

        System.out.println();

        if(iob instanceof Gen2<?>) {
            System.out.println("iob is an instance of Gen2");
        }

        if(iob instanceof Gen<?>) {
            System.out.println("iob is an instance of Gen");
        }

// The following will not compile because generic type information
// does not exist at runtime.
        if(iob2 instanceof Gen2<Integer>) {
            System.out.println("iob2 is an instance of Gen2<Integer>");
        }





    }
}
