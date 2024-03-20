package Dynamic_Method_Dispatch;

public class Client {
    public static void main(String[] args) {
        shape s;
        s = new Circle(5);
        System.out.println("Area of Circle: " + s.caluclate_Area());
        System.out.println("Perimeter of Circle: " + s.caluclate_Perimeter());

        System.out.println("DEBUG");

        s = new Rectangle(5, 6);
        System.out.println("Area of Rectangle: " + s.caluclate_Area());
        System.out.println("Perimeter of Rectangle: " + s.caluclate_Perimeter());
    }
}
