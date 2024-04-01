package generics.bookexamples.generics_demo;

public class GEN<T>{
    private T t;

    public GEN(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void show_type(){
        System.out.println("Type of T is : " + t.getClass().getName());
    }
}
