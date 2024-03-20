package Dynamic_Method_Dispatch.example;

public class Recatangle extends Figure{
    Recatangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
