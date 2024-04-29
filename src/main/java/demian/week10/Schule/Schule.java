package demian.week10.Schule;

import demian.week10.Schule.Schulklasse.Schulklasse;

import java.util.Random;
import java.util.Vector;

public class Schule {
    private String name;
    private Vector<Schulklasse> klassenliste;

    public Schule(String name) {
        this.name = name;
        klassenliste = new Vector<>();
    }

    public void addToKlassenliste(Schulklasse Klasse) {
        klassenliste.add(Klasse);
    }

    public String getRandomSchueler(){
        Random rand = new Random();
        //Random Schulklasse:
        int randomKlasse = rand.nextInt(0,klassenliste.size());
        //Random Schülername:
        return klassenliste.get(randomKlasse).getRandSchueler();
    }

    public Schulklasse getRandomSchulkasse(){
        Random rand = new Random();
        //Random Schulklasse:
        int randomKlasse = rand.nextInt(0,klassenliste.size());
        return klassenliste.get(randomKlasse);
    }

    public Vector<Schulklasse> getKlassenliste() {
        return klassenliste;
    }
}
