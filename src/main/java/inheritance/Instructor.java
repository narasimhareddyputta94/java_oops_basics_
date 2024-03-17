package inheritance;

public class Instructor extends User{
    String department;
    String subject;

    public Instructor(String username, String department, String subject) {
        this.username = username;
        this.department = department;
        this.subject = subject;
    }

    public Instructor(Instructor instructor) {
        this.username = instructor.username;
        this.department = instructor.department;
        this.subject = instructor.subject;
    }

    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
    }
}
