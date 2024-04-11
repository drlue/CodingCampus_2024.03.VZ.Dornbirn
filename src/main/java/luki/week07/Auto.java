package luki.week07;

public class Auto extends Fahrzeug {
    String marke;

    public Auto(int geschwindigkeit, String marke) {
        super(geschwindigkeit);
        this.marke = marke;
    }

    public Auto(String marke) {
        this(100, marke);
    }

    @Override
    public String toString() {
        return "Marke: " + marke + "," + super.toString();
    }

    @Override
    public void fahre() {
        System.out.println("Ich fahre mit 4 Reifen: "+marke + " und "+super.toString());
    }
}
