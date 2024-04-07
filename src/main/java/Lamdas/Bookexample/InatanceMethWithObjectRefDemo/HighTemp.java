package Lamdas.Bookexample.InatanceMethWithObjectRefDemo;

public class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    public boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    public boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
