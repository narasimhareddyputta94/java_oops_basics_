package inheritance.example1;

public class Client {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);

        double vol;

        vol = mybox1.volume();
        System.out.println("volume of mybox1 is " + vol);
        System.out.println("weight of mybox2 is " + mybox1.weight);
        System.out.println();


        vol = mybox2.volume();
        System.out.println("volume of mybox2 is "+ vol);
        System.out.println("weight of mybox2 is " + mybox2.weight);


    }
}
