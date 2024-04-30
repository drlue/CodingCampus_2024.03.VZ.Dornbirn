package irem.week08.DolceVita;

public class Speise {
    String name;
    double preis;
    double selbstkosten;

    public Speise(String name, double preis, double selbstkosten) {
        this.name = name;
        this.preis = preis;
        this.selbstkosten = selbstkosten;
    }

    public String getName() {
        return name;
    }
    public double getPreis() {
        return preis;
    }
    public double getSelbstkosten() {
        return selbstkosten;
    }
    public double berechneGewinn() {
        return preis - selbstkosten;
    }
}
