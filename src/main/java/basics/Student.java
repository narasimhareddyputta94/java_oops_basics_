package basics;

public class Student {

    String name;
    int age;
    String batchName;
    String courseName;
    String collegeName;

    void changeBatch(String newBatchName) {
        this.batchName = newBatchName;
    }

    void changeCourse(String newCourseName) {
        this.courseName = newCourseName;
    }

    void changeCollege(String newCollegeName) {
        this.collegeName = newCollegeName;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Batch: " + batchName);
        System.out.println("Course: " + courseName);
        System.out.println("College: " + collegeName);
    }


}
