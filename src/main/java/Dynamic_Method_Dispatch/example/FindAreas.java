package Dynamic_Method_Dispatch.example;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Recatangle r = new Recatangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());
    }
}
