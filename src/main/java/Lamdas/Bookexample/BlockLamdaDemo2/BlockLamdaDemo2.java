package Lamdas.Bookexample.BlockLamdaDemo2;

public class BlockLamdaDemo2 {
    public static void main(String[] args) {

        StringFunc reverse = (str) ->{
            String result = "";
            int i;
            for(i = str.length()-1;i>=0;i--){
                result = result + str.charAt(i);
            }
            return result;
        };

        System.out.println("Lamda reversed is" + reverse.fucn("lamda"));
        System.out.println("Expression reversed is" + reverse.fucn("Expression"));
    }
}
