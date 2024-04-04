package streams;

import java.util.List;

public class DatabaseService {

    public List<Integer> list;

    public DatabaseService(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getItems(){
        return list;
    }
}
