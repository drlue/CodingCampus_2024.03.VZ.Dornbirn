package irem.ZooNew;

import christian.week06.Personen.Person;

import java.util.Vector;

public class Keeper {

    private String name;
    private Vector<Enclosure> enclosures;
    private String favoriteSpecies;



    public Keeper(String name, String favoriteSpecies) {
        this.name = name;
        this.enclosures = new Vector<>();
        this.favoriteSpecies = favoriteSpecies;
    }
    public void addEnclosure(Enclosure enclosure){
        enclosures.add(enclosure);
    }

    public void careForEnclosures() {
        for (Enclosure enclosure : enclosures) {
            if (!enclosure.isCaredForToday()) {
                System.out.println(name + " is caring for enclosure " + enclosure.getName() + ".");
                enclosure.feedAnimals(this);
            }
        }
    }

    public String getName() {
        return name;
    }

}


