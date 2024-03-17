package MethodOverloading;

public class A {
    int age;
    String name;

    public void display(int age, String name) {
        System.out.println("Age: " + age + " Name: " + name);
    }

    public void display(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public void display(int age, String name, String address) {
        System.out.println("Age: " + age + " Name: " + name + " Address: " + address);
    }

    public void display(String name, int age, String address) {
        System.out.println("Name: " + name + " Age: " + age + " Address: " + address);
    }

    public void display(String name, String address, int age) {
        System.out.println("Name: " + name + " Address: " + address + " Age: " + age);
    }

//    public void display(String address, String name, int age) {
//        System.out.println("Address: " + address + " Name: " + name + " Age: " + age);
//    }
}
