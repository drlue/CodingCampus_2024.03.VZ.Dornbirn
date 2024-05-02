package christian.week08.schoolSimulationV2.humans;

import christian.week08.schoolSimulationV2.Main;

import java.util.ArrayList;

public class SchoolClass extends Human{
    private ArrayList<Pupil>listOfPupils;

    public SchoolClass(String name){
        super(name);
        listOfPupils =  new ArrayList<>();
    }
    //======================================================================================================get=========

    public Pupil getRandomPupil(){
        if(listOfPupils.size()>0){
            return listOfPupils.get(Main.rnd.nextInt(0,listOfPupils.size()-1));
        }else {
            return null;
        }
    }
    //======================================================================================================set=========
    //======================================================================================================create======
    //==================================================================================================add/remove======
    public void addToClass(Pupil pupil){
        if(!listOfPupils.contains(pupil)){
            listOfPupils.add(pupil);
        }
    }
    //==================================================================================================alter===========
    //==================================================================================================simulate========

}
