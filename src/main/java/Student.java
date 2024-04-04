public class Student {
    private String name;
    private int age;
    private double psp;

    public Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
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
}
