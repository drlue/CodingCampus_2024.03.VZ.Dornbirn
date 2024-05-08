package ardijanla.week08.SchwarzawlKlinik;

import java.util.ArrayList;
import java.util.List;

public class WaitingRoom extends Ward{
    private List<Patient> patients;

    public WaitingRoom(String name){
        super(name);
        patients = new ArrayList<>();
    }


}
