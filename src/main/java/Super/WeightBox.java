package Super;

public class WeightBox extends Box {
    double weight;

    WeightBox(WeightBox ob) {
        super(ob);
        weight = ob.weight;
    }

    WeightBox(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    WeightBox() {
        super();
        weight = -1;
    }

    WeightBox(double len, double m) {
        super(len);
        weight = m;
    }
}
