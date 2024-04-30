package katherina.week08.Schwarzwaldklinik;

import java.util.Vector;

public class Krankenhaus {
    private String name;
    private String openHours;
    private int maxBelegung;
    private Vector<Abteilung> abteilungsliste;

    public Krankenhaus(String name, String openHours, int maxBelegung) {
        this.name = name;
        this.openHours = openHours;
        this.maxBelegung = maxBelegung;
        abteilungsliste = new Vector<>();

    }

    public void addAbteilung(Abteilung abteilung) {
        if (!abteilungsliste.contains(abteilung)) {
            abteilungsliste.add(abteilung);
        } else {
            System.out.printf("Dieses Krankenhaus enthält bereits eine Abteilung für \" %s\" enthält bereits das Gehege namens %s!", abteilung.getName());
        }
    }


    public void printStructure() {
        System.out.printf("├── Krankenhaus: %s%n", name);
        for (Abteilung abteilung : abteilungsliste) {
            abteilung.printStructure();
        }
    }

}


