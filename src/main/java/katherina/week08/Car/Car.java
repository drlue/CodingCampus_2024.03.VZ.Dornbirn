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


    public int drive(int kilometer) {
        System.out.printf("START %s %s||%n", hersteller, modell);
        int restKM = kilometer;
        double verbrauch = verbrauchProKM() / 100;
        while (restKM > 0) {
            if (tankinhalt > verbrauch) {
                restKM--;
                tankinhalt -= verbrauch;
                System.out.print("=");
                if ((kilometer - restKM) % 60 == 0) {
                    System.out.println();
                }
            } else {
                tankinhalt += 25.0;
                System.out.print("[BOX]");
            }
        }
        System.out.printf("|[]=[]> ENDE||%nWir sind nach %d km angekommen!%n Es sind noch %.2f Liter Kraftstoff übrig.%n%n", kilometer - restKM, tankinhalt);
        return kilometer - restKM;
    }


    public double verbrauchProKM() {
        switch (antriebsart) {
            case GAS:
                return ((gewicht / 100) * 0.3 + kiloWatt * 19.9) / 100;
            case BENZIN:
                return ((gewicht / 100) * 0.3) + (kiloWatt * 8.5) / 100;
            case DIESEL:
                return (((gewicht / 100) * 0.3) + (kiloWatt * 7.0) / 100);
            default:
                return ((((gewicht / 100) * 0.5) + (kiloWatt + 20)) / 100)*30;
            //default ist Strom.
        }
    }

}

