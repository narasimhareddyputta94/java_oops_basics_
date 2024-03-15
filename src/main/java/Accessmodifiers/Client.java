package Accessmodifiers;

public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.changename("John");
        student1.age = 20;
        student1.batchName = "B20";
        student1.courseName = "B.Tech";
        student1.collegeName = "IIT";
        student1.give_mock_test();
      }
}
