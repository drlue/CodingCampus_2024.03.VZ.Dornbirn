package katherina.week09.Schulsimulation;

import katherina.zoocopyforexperiments.Gehege;
import katherina.zoocopyforexperiments.Pfleger;
import katherina.zoocopyforexperiments.Tier;
import katherina.zoocopyforexperiments.Tierarzt;

import java.util.Vector;

import static katherina.zoocopyforexperiments.Zoo.sleep;

public class Schule {
    private String name;
    private String ort;
    private int gruendung;
    private Vector<Raum> raumliste;
    private Vector<Person> personenliste;


    public Schule(String name, String ort, int gruendung) {
        this.name = name;
        this.ort = ort;
        this.gruendung = gruendung;
        raumliste = new Vector<>();
        personenliste = new Vector<>();
    }

    public void addRaum(Raum raum) {
        if (!raumliste.contains(raum)) {
            raumliste.add(raum);
        } else {
            System.out.printf("Der Raum \" %s\" ist bereits vorhanden!", raum.getName());
        }
    }

    public void addPerson(Person person) {
        if (!personenliste.contains(person)) {
            personenliste.add(person);
        }
    }

    public void oeffnen(Person direx) {
        System.out.printf("%s schließgt die Schule auf. Der Tag beginnt.%n", direx.getName());
    }

    public void simulateDay(int day) {
        System.out.printf("\nSchultag Nummer %d!%n~*~ ~*~ ~*~%n%n", day);
        oeffnen(this.personenliste.firstElement());
        for (Person lehrperson : personenliste) {
            lehrperson.unterricht(lehrperson);
            sleep(450);
            System.out.println();
        }
    }

}
