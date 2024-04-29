package katherina.week09.Schulsimulation;

import ardijanla.ConsoleColors;

import java.util.Random;

import static katherina.zoocopyforexperiments.Zoo.sleep;

public class Lernende extends Person {
    private Klasse klasse;

    enum Klasse {
        EINS,
        ZWEI,
        DREI,
        VIER,
    };

    public Lernende(String name, Klasse klasse) {
        super(name);
        this.klasse = klasse;
    }

    public String getName() {
        return name;
    }

    @Override
    public void ankunft(){
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(name+ " ist zu spät und muss zum Direktor gehen.");
            strafe();
        }else {
        System.out.printf("%s geht in den Unterricht.%n", name);}
        sleep(450);
        System.out.println();
    }
}
