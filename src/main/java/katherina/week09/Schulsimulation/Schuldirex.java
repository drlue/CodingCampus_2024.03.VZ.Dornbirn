package katherina.week09.Schulsimulation;

import static katherina.zoocopyforexperiments.Zoo.sleep;

public class Schuldirex extends Person {


    public Schuldirex(String name) {
        super(name);
    }

    @Override
    public void strafe(){
        System.out.printf("%s brummt hierfür eine kleine Schulstrafe auf.%n", name);
        sleep(450);
        System.out.println();
    }

    @Override
    public void oeffnen(){
        System.out.printf("%s schließt die Schule auf und der Schultag fängt an.%n", name);
        sleep(450);
        System.out.println();
    }

    @Override
    public void schliessen() {
        System.out.printf("%s schließt die Schule zu. Bis zum nächsten Tag.%n", name);
        sleep(450);
        System.out.println();
    }

}

