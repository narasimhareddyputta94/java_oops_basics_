package Dynamic_Method_Dispatch.example;

public class Triangle extends Figure{
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
