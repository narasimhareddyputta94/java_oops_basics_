package Bookexamples.bookexamples.bookexamples.Generic_Method_Demo;

public class GenMethodDemo {

    static <T extends Comparable<T>, V extends T> boolean Isin(T x, V[] y){


        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }

        }

        return false;   }

    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 4, 5};

        if(Isin(1, nums)){
            System.out.println("nums is in nums");
        }

        if(!Isin(6, nums)){
            System.out.println("6 is in not in  nums");
        }

        System.out.println();

        String[] strs = {"one", "two", "three", "four", "five"};

        if(Isin("two", strs)){
            System.out.println("two is in strs");
        }

        if(!Isin("six", strs)){
            System.out.println("six is not in strs");
        }

        // This will not compile
        // if(Isin("two", nums)){
        //     System.out.println("two is in nums");
        // }



    }
}
