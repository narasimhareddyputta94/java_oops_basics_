package ConstructorOverloading;

public class Client {

    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,34,10.5);
        Shipment shipment2 = new Shipment(2,3,4,0.076,10.5);
        Shipment shipment3 = new Shipment();

        double vol;

        vol = shipment1.volume();
        System.out.println("volume of shipment1 is " + vol);
        System.out.println("weight of shipment1 is " + shipment1.weight);
        System.out.println("cost of shipment1 is $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("volume of shipment2 is "+ vol);
        System.out.println("weight of shipment2 is " + shipment2.weight);
        System.out.println("cost of shipment2 is $" + shipment2.cost);
        System.out.println();

        vol = shipment3.volume();
        System.out.println("volume of shipment3 is "+ vol);
        System.out.println("weight of shipment3 is " + shipment3.weight);
        System.out.println("cost of shipment3 is $" + shipment3.cost);


    }

}
