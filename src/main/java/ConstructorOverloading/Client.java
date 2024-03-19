package ConstructorOverloading;

public class Client {

    public static void main(String[] args) {
        Box newbox1 = new Box(10,20,15);
        Box newbox2 = new Box();
        Box newbox3 = new Box(7);

        double vol;

        vol = newbox1.volume();
        System.out.println("volume of cube =" + vol);

        vol = newbox2.volume();
        System.out.println("volume of cube =" + vol);

        vol = newbox3.volume();
        System.out.println("volume of cube =" + vol);
    }
}
