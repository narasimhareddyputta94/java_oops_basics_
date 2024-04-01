package generics.bookexamples.BoundsDemo;

public class BoundsDemo {
    public static void main(String[] args) {

        Integer inums[] = {1,2,3,4,5};
        Stats<Integer>iob = new Stats<>(inums);
        double V = iob.average();
        System.out.println("iob average is " + V);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double>dob = new Stats<>(dnums);
        double W = dob.average();
        System.out.println("dob average is " + W);
    }
}
