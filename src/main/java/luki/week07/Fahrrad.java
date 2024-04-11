package luki.week07;

public class Fahrrad extends Fahrzeug {
    public Fahrrad(int geschwindigkeit) {
        super(geschwindigkeit);
    }

    @Override
    public void fahre() {
        System.out.println("Ich fahre gemütlich mit dem Velo im Dorf mit 2 Reifen");
    }
}
