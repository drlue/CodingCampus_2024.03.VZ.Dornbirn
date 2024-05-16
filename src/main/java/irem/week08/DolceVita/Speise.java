package irem.week08.DolceVita;

public class Speise {
    String name;
    double preis;
    double selbstkosten;
    double berechneGewinn;

    public Speise(String name, double preis, double selbstkosten) {
        this.name = name;
        this.preis = preis;
        this.selbstkosten = selbstkosten;
        this.berechneGewinn = berechneGewinn;
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
    public double getBerechneGewinn() {
        return preis - berechneGewinn;
    }
}
