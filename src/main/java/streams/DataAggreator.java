package streams;

import java.util.ArrayList;
import java.util.List;

public class DataAggreator {

    public List<Integer> getItems(){
        DatabaseService service = new DatabaseService(new ArrayList<>());
        service.list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        return service.list;
    }
}
