package Bookexamples.bookexamples.overideDemo;

public class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    T getob(){
        System.out.println("Gen's getob(): ");
        return ob;
    }
}
