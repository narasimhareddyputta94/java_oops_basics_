package collections;

public class Student implements Comparable<Student>{

    int id;
    String name;
    int age;
    double psp;

    public Student(int id, String name, int age, double psp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    @Override
    public int compareTo(Student o) {
        if (this.psp > o.psp) {
            return 1;
        } else if (this.psp < o.psp) {
            return -1;
        } else {
            return 0;
        }
    }






}




