package streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        for(Integer i: list){
            System.out.print(i+" ");
        }

        System.out.println();

        DataAggreator dataAggreator = new DataAggreator();
        List<Integer> list1 = dataAggreator.getItems();

        for(Integer i: list1){
            System.out.print(i*4+" ");
        }

        System.out.println();



        Stream<Integer> s1 = list.stream();

        s1.forEach(
                (i) -> {
                    System.out.print(i*100+" ");
                }
        );


        System.out.println();

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(List.of(1,2,3,4,5,6,7,8,9,7,8,9,10));

        Stream<Integer> s2 = set1.stream();
        s2.forEach(
                (i) -> {
                    System.out.print(i*1000+" ");
                }
        );

        List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,10);
        Set<Integer> set2 = new HashSet<>();

        Stream s3 = list2.stream();
        s3.forEach(
                (i) -> {
                    set2.add((Integer)i);
                }
        );

        System.out.println();

        set2.forEach(
                (i) -> {
                    System.out.print(i*10000+" ");
                }
        );
    }
}
