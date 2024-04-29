package irem.week08.DolceVita;

public class Produkt {
    private String name;
    private double preis;
    private double selbstkosten;

    public Produkt(String name, double preis, double selbstkosten) {
        this.name = name;
        this.preis = preis;
        this.selbstkosten = selbstkosten;
    }

    public double berechneGewinn() {
        return preis - selbstkosten;
    }
}
