package generics;

public class Clinet {
    public static void main(String[] args) {

        PaiGenericsType<Integer,String> P1 = new PaiGenericsType<>(1,"Hello");
        PaiGenericsType<Double,Double> P2 = new PaiGenericsType<>(0.01,0.23);

        System.out.print(P1.getFirst());
    }
}
