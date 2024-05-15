package gyula.week12.oopexample.model;

import java.util.Vector;

public class World {
    Vector<Continent> continents;

    public World(){
        continents = new Vector<>();
    }

    public void addContinent(Continent cont){
        if (!continents.contains(cont)){
            continents.add(cont);
        }
        cont.setWorld(this);
    }

    public Continent searchContinentByName(String name){
        for (Continent c : continents){
            if (c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }

    public void printStructure(){
        System.out.println("World and everything else");
        for (Continent c: continents){
            c.printStructure();
        }
    }
}
