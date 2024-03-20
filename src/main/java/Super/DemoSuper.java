package Super;

import inheritance.example1.BoxWeight;

public class DemoSuper {
    public static void main(String[] args) {
        WeightBox mybox1 = new WeightBox(10,20,15,34);
        WeightBox mybox2 = new WeightBox(2,3,4,0.076);
        WeightBox mybox3 = new WeightBox();

        double vol;

        vol = mybox1.volume();
        System.out.println("volume of mybox1 is " + vol);
        System.out.println("weight of mybox2 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("volume of mybox2 is "+ vol);
        System.out.println("weight of mybox2 is " + mybox2.weight);
        System.out.println();


        vol = mybox3.volume();
        System.out.println("volume of mybox3 is "+ vol);
        System.out.println("weight of mybox3 is " + mybox3.weight);



    }
}
