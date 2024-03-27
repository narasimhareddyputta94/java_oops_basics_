package generics;

public class Clinet {
    public static void main(String[] args) {

        PaiGenericsType<Integer,String> P1 = new PaiGenericsType<>(1,"Hello");
        PaiGenericsType<Double,Double> P2 = new PaiGenericsType<>(0.01,0.23);
        PaiGenericsType P3 = new PaiGenericsType(10000,2);

        System.out.println("DEBUG");

        System.out.println(P1.getFirst());
        System.out.println(P3.getFirst());
    }
}
