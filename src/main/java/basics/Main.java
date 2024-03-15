package basics;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        student1.batchName = "B20";
        student1.courseName = "B.Tech";
        student1.collegeName = "IIT";
        student1.display();
        student1.changeBatch("B21");
        student1.changeCourse("M.Tech");
        student1.changeCollege("IIT Delhi");
        student1.display();
    }
}
