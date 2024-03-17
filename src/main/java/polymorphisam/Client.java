package polymorphisam;

public class Client {
    public static void main(String[] args) {
        User user = new User("user", "password");
        System.out.println(user.Username);
        System.out.println(user.Password);

        System.out.println("DEBUG");

        Instructor instructor = new Instructor("John", "CSE");
        instructor.Department = "CSE";
        instructor.Course = "Java";
        System.out.println(instructor.Username);
        System.out.println(instructor.Password);
        System.out.println(instructor.Department);
        System.out.println(instructor.Course);

        System.out.println("DEBUG");

        Student student = new Student("John", "CSE");
        student.Name = "John";
        student.Email = "narasimha@123";
        System.out.println(student.Username);
        System.out.println(student.Password);
        System.out.println(student.Name);
        System.out.println(student.Email);

        System.out.println("DEBUG");



    }
}
