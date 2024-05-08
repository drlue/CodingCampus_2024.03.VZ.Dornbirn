package katherina.week09.Schulsimulation;

import java.util.Vector;

public class Schule {
    private String name;
    private String ort;
    private int gruendung;
    private Vector<Raum> raumliste;
    protected Vector<Person> personenliste;


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

    public void simulateDay(int day) {
        System.out.printf("\nSchultag Nummer %d!%n~*~ ~*~ ~*~%n%n", day);
        personenliste.forEach(person -> {
            person.oeffnen();
            person.unterricht();
            person.ankunft();
        });
        personenliste.getFirst().schliessen();
    }

}
