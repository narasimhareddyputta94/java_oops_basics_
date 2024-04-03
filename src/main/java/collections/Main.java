package collections;

import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        List<Integer> v = new Vector<>();
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + ((Vector<Integer>) v).capacity());

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);

        System.out.println("Capacity after 10 additions: " + ((Vector<Integer>) v).capacity());

        v.add(11);
        v.add(12);
        v.add(13);
        v.add(14);
        v.add(15);
        v.add(16);
        v.add(17);
        v.add(18);
        v.add(19);
        v.add(20);

        System.out.println("Capacity after 20 additions: " + ((Vector<Integer>) v).capacity());

        v.add(21);
        v.add(22);
        v.add(23);
        v.add(24);
        v.add(25);
        v.add(26);
        v.add(27);
        v.add(28);
        v.add(29);
        v.add(30);

        System.out.println("Capacity after 30 additions: " + ((Vector<Integer>) v).capacity());

        v.add(31);
        v.add(32);
        v.add(33);
        v.add(34);
        v.add(35);
        v.add(36);
        v.add(37);
        v.add(38);
        v.add(39);
        v.add(40);

        System.out.println("Capacity after 40 additions: " + ((Vector<Integer>) v).capacity());

        v.add(41);
        v.add(42);
        v.add(43);
        v.add(44);
        v.add(45);
        v.add(46);
        v.add(47);
        v.add(48);
        v.add(49);
        v.add(50);

        System.out.println("Capacity after 50 additions: " + ((Vector<Integer>) v).capacity());

        v.add(51);
        v.add(52);
        v.add(53);
        v.add(54);
        v.add(55);
        v.add(56);
        v.add(57);
        v.add(58);
        v.add(59);
        v.add(60);

        System.out.println("Capacity after 60 additions: " + ((Vector<Integer>) v).capacity());


    }
}
