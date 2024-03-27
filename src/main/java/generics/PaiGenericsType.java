package generics;

public class PaiGenericsType <FIRST,SECOND>{

    private FIRST first;
    private SECOND second;

    public PaiGenericsType(FIRST first,SECOND second){
        this.first = first;
        this.second = second;
    }

    public FIRST getFirst() {
        return first;
    }

    public SECOND getSecond(){
        return second;
    }
}
