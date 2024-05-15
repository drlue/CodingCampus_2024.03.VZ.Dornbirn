package christian.week09.sqlManagment.SqlOOP.model;

import java.util.ArrayList;

public class World {
    private ArrayList<Continent>listOfContinents;

    public World(){
        listOfContinents = new ArrayList<>();
    }
    //================================================================================================get=========
    //================================================================================================set=========
    //================================================================================================create=========

    public void addContinentToList(Continent continent){
        if(!listOfContinents.contains(continent)){
            listOfContinents.add(continent);
        }
    }
    //================================================================================================alter=========
    //================================================================================================remove=========
    //================================================================================================SQL=========
    //================================================================================================print=========
    public void printWorldStructure(){
        for(Continent continent : listOfContinents){
            continent.printStructure();
        }
    }
}
