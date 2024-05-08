package ardijanla.week08.SchwarzawlKlinik;

import java.util.ArrayList;
import java.util.List;

public class Room extends Ward{
    private int number;
    private List<Bed> beds;

    public Room(int number,String name) {
        super(name);
        this.number = number;
        this.beds = new ArrayList<>();
    }
}
