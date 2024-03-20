package Dynamic_Method_Dispatch;

public class Rectangle extends shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double caluclate_Area() {
        return length * breadth;
    }

    @Override
    double caluclate_Perimeter() {
        return 2 * (length + breadth);
    }
}
