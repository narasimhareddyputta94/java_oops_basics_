package Manualconstructor;

public class Clinet {
    public static void main(String[] args) {
        Student student1 = new Student("John", 21, "B1", "B.Tech", "IIT");
        student1.display();

        System.out.println("DEBUG");

        Student student2 = new Student("Johni", 21, "B1q", "B.Techq", "IIIT");
        student2.display();
    }
}
