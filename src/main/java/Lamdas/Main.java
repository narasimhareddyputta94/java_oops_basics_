package Lamdas;

import collections.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //V1
//        Somethingdoer somethingdoer = new Somethingdoer();
//        somethingdoer.run();


        //V2
        Runnable SomethingdoerLamda = () -> {
            System.out.println("I am doing");
        };

        Thread thread = new Thread(SomethingdoerLamda);
        thread.start();

        //V3
        Thread thread1 = new Thread(() -> {
            System.out.println("I am doing");
        });


        //Another example

        List<Student> students = new ArrayList<>();

        students.addAll(
                List.of(
                        new Student(1, "John", 23,98),
                        new Student(2, "Doe", 24, 99),
                        new Student(3, "Jane", 25, 100),
                        new Student(4, "Smith", 26, 89)
                )
        );

        Comparator<Student > comparator = (Student a,Student b) -> {
            if(a.getName().equals(b.getName())){
                return 0;
        }
            if(a.getName().compareTo(b.getName()) > 0){
                return -1;
        }
            return 1;
        };

        Collections.sort(students, comparator);

        System.out.println(students);






    }
}
