package irem.week08.DolceVita;

import java.sql.Date;

public class Tisch {
    int tischNummer;
    int kapazitat;
    Kellner zustandig;
    Rechnung rechnung;

    public Tisch(int tischNummer, int kapazitat) {
        this.tischNummer = tischNummer;
        this.kapazitat = kapazitat;
        this.rechnung = null;
    }

    public void zuweisenKellner(Kellner kellner) {
        this.zustandig = kellner;
        System.out.println("Kellner " + kellner.name + " zugewiesen zu Tisch " + tischNummer);
    }

    public boolean istBesetzt() {
        return zustandig != null;
    }
}

