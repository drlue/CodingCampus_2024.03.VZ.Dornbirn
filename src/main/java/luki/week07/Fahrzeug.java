package luki.week07;

public class Fahrzeug {
    int geschwindigkeit;

    public Fahrzeug(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public String toString() {
        return "Geschwindigkeit: " + this.geschwindigkeit + " mp/h";
    }

    public void fahre() {
        System.out.println("Ich fahre mit " + this.geschwindigkeit + " km/h");
    }
}
