package generics.Tri;


import java.util.List;

public class Client {

    private static <TYPE> void print(List<Triplet<TYPE>> triplets){

            for(Triplet<TYPE> triplet : triplets){

            System.out.println(triplet.getLeft() + "     ---    " + triplet.getMiddle() + "     -----     " + triplet.getRight());
        }

    }

    private static double avg(Triplet<Integer> triplets){
        int left = triplets.getLeft();
        int right = triplets.getRight();
        int middle = triplets.getMiddle();

        return (double)(left + middle + right )/3;
    }



    public static void main(String[] args) {
        Triplet<String> idNameEmail = new Triplet<>("10704","Narasimha@spr","Narasimha_Reddy");
        Triplet<Integer> idAgeRollNo = new Triplet<>(10704,16,21);

        List<Triplet<String>> triplets = List.of(idNameEmail,idNameEmail);
        print(triplets);
        System.out.print(avg(idAgeRollNo));
    }

}
