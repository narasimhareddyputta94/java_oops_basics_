package generics.bookexamples.GenHierarcy.HeirDemo2;

public class Gen<T> extends NonGen{
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getob() {
        return ob;
    }
}
