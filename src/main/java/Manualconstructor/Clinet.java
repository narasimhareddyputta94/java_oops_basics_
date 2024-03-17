package Manualconstructor;

public class Clinet {
    public static void main(String[] args) {
        Student student1 = new Student("John", 21, "B1", "B.Tech", "IIT");
        student1.display();


        Student student2 = new Student(student1);
        student2.display();

        student2.name = "Jane";
        System.out.println("DEBUG");


    }
}
