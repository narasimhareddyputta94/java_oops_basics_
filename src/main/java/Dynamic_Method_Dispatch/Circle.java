package Dynamic_Method_Dispatch;

public class Circle extends shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double caluclate_Area() {
        return Math.PI * radius * radius;
    }

    @Override
    double caluclate_Perimeter() {
        return 2 * Math.PI * radius;
    }
}
