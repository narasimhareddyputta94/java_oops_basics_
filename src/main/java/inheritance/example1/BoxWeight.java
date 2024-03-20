package inheritance.example1;

public class BoxWeight extends Box{
    double weight;

//    BoxWeight(double w , double h, double d, double m){
//
//        this.width = w;
//        this.height = h;
//        this.depth = d;
//        this.weight = m;
//
//    }
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        this.weight = m;
    }

    BoxWeight(BoxWeight ob){
        super(ob);
        this.weight = ob.weight;
    }
}
