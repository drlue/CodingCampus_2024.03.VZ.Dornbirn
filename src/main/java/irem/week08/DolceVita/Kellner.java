package irem.week08.DolceVita;

import java.util.Date;

public class Kellner{
    String name;
    int id;
    int bedienteGaste;
    double gesamtumsatz;

    public Kellner(String name, int id) {
        this.name = name;
        this.id = id;
        this.bedienteGaste = 0;
        this.gesamtumsatz = 0.0;
    }

    public void aufnehmenBestellung(Tisch tisch) {
        System.out.println(name + " nimmt Bestellung auf bei Tisch " + tisch.tischNummer);
        bedienteGaste++;
    }

    public void servierenBestellung(Tisch tisch) {
        System.out.println(name + " serviert Bestellung bei Tisch " + tisch.tischNummer);
    }

    public Rechnung abrechnenTisch(Tisch tisch) {
        Rechnung rechnung = new Rechnung(tisch.rechnung.berechneGesamtbetrag(), new Date());
        gesamtumsatz += rechnung.betrag;
        System.out.println(name + " erstellt Rechnung für Tisch " + tisch.tischNummer + " mit Betrag: " + rechnung.betrag);
        return rechnung;
    }
}


