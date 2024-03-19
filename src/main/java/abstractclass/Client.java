package abstractclass;

public class Client {
    public static void main(String[] args) {


        Animal animal = new Cat();
        animal.walk();
        animal.eat();
        animal.sleep();
    }
}
