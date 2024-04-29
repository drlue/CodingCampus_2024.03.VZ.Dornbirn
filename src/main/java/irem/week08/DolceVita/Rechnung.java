package irem.week08.DolceVita;

import java.util.Date;

class Rechnung {
    int rechnungsnummer;
    double betrag;
    Date datum;

    public Rechnung(double betrag, Date datum) {
        this.betrag = betrag;
        this.datum = datum;
    }

    public void fugePostenHinzu(Speise item, int menge) {
        betrag += item.getPreis() * menge;
    }

    public double berechneGesamtbetrag() {
        return betrag;
        }
    }
