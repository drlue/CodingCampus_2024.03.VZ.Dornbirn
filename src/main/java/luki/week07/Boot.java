package luki.week07;

public class Boot extends Fahrzeug {
    public Boot(int geschwindigkeit) {
        super(geschwindigkeit);
    }

    @Override
    public void fahre() {
        System.out.println("Ich fahre im Wasser ohne Reifen!");
    }
}
