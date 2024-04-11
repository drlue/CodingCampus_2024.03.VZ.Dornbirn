package luki.week07;

public class Fahrrad extends Fahrzeug {
    public Fahrrad(int geschwindigkeit) {
        super(geschwindigkeit);
    }

    @Override
    public void fahre() {
        System.out.println("ICH fahre gemuetlich im Dorf mit 2 Reifen HAHAHAHHAHAHAH Calender ist outdated ");
    }
    public void schimpfiSchimpfi(){
        System.out.println(" Pass doch auf du :......");

    }
    
    public void pumpItUp() {
        System.out.println("Ich pumpe die Reifen auf!");
    }
 public void flickPatschen() {
        System.out.println("You have a flat tyre!");
    }
}
