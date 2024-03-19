package inheritance.example1;

public class Box {

    double width;
    double height;
    double depth;

    Box(Box ob){
        this.width = ob.width;
        this.depth = ob.depth;
        this.height = ob.height;

    }

    Box(double w,double d, double h){
        this.width = w;
        this.depth = d;
        this.height = h;
    }

    Box(){
        this.width = -1;
        this.depth = -1;
        this.height = -1;
    }

    Box(double len){
        this.width = this.depth = this.height = len;
    }

    double volume (){
        return width*depth*height;
    }
}
