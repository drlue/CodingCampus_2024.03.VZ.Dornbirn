package katherina.week08.Car;

public class Car {
    private String hersteller;
    private String modell;
    private double kiloWatt;
    private double tankinhalt;
    private double gewicht;

    enum Antriebsart {
        BENZIN,
        DIESEL,
        GAS,
        STROM
    }

    private Antriebsart antriebsart;

    public Car(String hersteller, String modell, double kiloWatt, double tankinhalt, double gewicht, Antriebsart antriebsart) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.kiloWatt = kiloWatt;
        this.tankinhalt = tankinhalt;
        this.gewicht = gewicht;
        this.antriebsart = antriebsart;
    }

    public void setTankinhalt(double tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    public int drive(int kilometer) {
        System.out.print("START||");
        double strecke = 0;
        while (tankinhalt > 0 && kilometer > 0) {
            verbrauchProKM();
            //Unterfunktion: Immer wenn ich den nächsten Kilometer gefahren bin, prüfe ich: Kann ich weiterfahren?
            //Wenn ja: Drucke =
            //Wenn nein: Drucke [Box]. Tanke auf. Fahre weiter.
            kilometer--;
            strecke++;
            System.out.print("=");
        }
        if (tankinhalt <= 0) {
            auffuellen(tankinhalt);
            setTankinhalt(tankinhalt);
            verbrauchProKM();
            System.out.print("|[]=[]> ENDE||\n");
        } else {
            System.out.printf("|[]=[]> ENDE||\n%nWir sind nach %.2f km angekommen!%n Es sind noch %.2f Liter Kraftstoff übrig.%n", strecke, tankinhalt);
        }

        return (int) strecke;
    }

    public void auffuellen(double fuellung) {
        System.out.print("[Box]");
        setTankinhalt(tankinhalt);
        fuellung = 25;
        tankinhalt += fuellung;
        verbrauchProKM();
    }

    public void verbrauchProKM() {
        double strecke = 0;
        switch (antriebsart) {
            case GAS -> tankinhalt -= ((gewicht / kiloWatt) / 1.1) / 100;
            case BENZIN -> tankinhalt -= ((gewicht / kiloWatt) / 1.2) / 100;
            case DIESEL -> tankinhalt -= ((gewicht / kiloWatt) / 1.3) / 100;
            case STROM -> tankinhalt -= ((gewicht / kiloWatt) / 1.6) / 100;
        }
        System.out.print("=");
    }

}

