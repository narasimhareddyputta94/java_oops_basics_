package Lamdas.Bookexample.VarCapture;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLamda = (n) ->{
            int v = num + n;
//            num++;
            return v;
        };

//        num = 9;
        }
    }

