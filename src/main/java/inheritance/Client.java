package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("John", "CSE", "Java");
        instructor.display();
        instructor.login("John", "password");
        System.out.println("DEBUG");
    }
}
