package abstractclass;

public class Tiger extends Animal{

        @Override
        void walk() {
            System.out.println("Tiger is walking");
        }

        @Override
        void eat() {
            System.out.println("Tiger is eating");
        }


        void run() {
            System.out.println("Tiger is running");
        }

}
