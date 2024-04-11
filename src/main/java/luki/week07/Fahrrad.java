package luki.week07;

public class Fahrrad extends Fahrzeug {
    public Fahrrad(int geschwindigkeit) {
        super(geschwindigkeit);
    }

    @Override
    public void fahre() {
        System.out.println("ICH fahre gemuetlich im Dorf mit 2 Reifen HAHAHAHHAHAHAH Calender ist outdated ");
    }

    public void flickPatschen() {
        System.out.println("You have a flat tyre!");
    }
}
