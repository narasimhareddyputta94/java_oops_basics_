package constructor_chaining;

public class C extends B{

    C(){
        System.out.println("Constructor C");
    }

    C(String s){
        this();
        System.out.println("Constructor C with String");
    }
}
