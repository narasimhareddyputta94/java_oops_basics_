package Manualconstructor;

public class Student {

    String name;
    int age;
    String batchName;
    String courseName;
    String collegeName;

    public Student(String name, int age, String batchName, String courseName, String collegeName){
        System.out.println("Inside the constructor : " + this.name +" "+name);
        this.name = name;
        this.age = age;
        this.batchName = batchName;
        this.courseName = courseName;
        this.collegeName = collegeName;
    }

    public Student(Student oldstudent){
        this.name = oldstudent.name;
        this.age = oldstudent.age;
        this.batchName = oldstudent.batchName;
        this.courseName = oldstudent.courseName;
        this.collegeName = oldstudent.collegeName;
    }



    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Batch Name: " + batchName);
        System.out.println("Course Name: " + courseName);
        System.out.println("College Name: " + collegeName);
    }
}
