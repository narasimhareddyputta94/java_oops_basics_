package collections;

public class Student implements Comparable<Student>{

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

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




