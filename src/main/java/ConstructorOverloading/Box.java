package ConstructorOverloading;

public class Box {
    double Width;
    double Height;
    double Depth;

    Box(double w,double h,double d){
        this.Width = w;
        this.Height = h;
        this.Depth = d;
    }

    Box(){
        this.Width = -1;
        this.Height = -1;
        this.Depth = -1;
    }

    Box(double len){
        this.Width = this.Height = this.Depth = len ;
    }

    Box(Box ob){
        this.Width = ob.Width;
        this.Height = ob.Height;
        this.Depth = ob.Depth;
    }

    double volume(){
        double vol = this.Width * this.Height * this.Depth;
        return vol;
    }



}
