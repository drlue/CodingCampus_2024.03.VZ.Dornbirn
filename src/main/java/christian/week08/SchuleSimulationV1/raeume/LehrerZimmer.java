package christian.week08.SchuleSimulationV1.raeume;

import christian.week08.SchuleSimulationV1.personV1.Lehrer;

import java.util.ArrayList;

public class LehrerZimmer extends Raum {
    private ArrayList<Lehrer> listOfLehrer;


    public LehrerZimmer(String name) {
        super(name);
        listOfLehrer = new ArrayList<>();

    }
    //======================================================================================================get=========
    //======================================================================================================set=========
    //======================================================================================================create======
    //==================================================================================================add/remove======
    //==================================================================================================alter===========
    //==================================================================================================simulate========
}
