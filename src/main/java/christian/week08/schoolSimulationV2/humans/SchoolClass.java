package christian.week08.schoolSimulationV2.humans;

import java.util.ArrayList;

public class SchoolClass extends Human{
    private ArrayList<Pupil>listOfPupils;

    public SchoolClass(String name){
        super(name);
        listOfPupils =  new ArrayList<>();
    }
}
