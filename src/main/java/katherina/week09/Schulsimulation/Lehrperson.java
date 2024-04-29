package katherina.week09.Schulsimulation;

import static katherina.zoocopyforexperiments.Zoo.sleep;

public class Lehrperson extends Person {
        private String fach;

    public Lehrperson(String name, String fach) {
        super(name);
        this.fach = fach;
    }

    public String getFach() {
        return fach;
    }

    @Override
    public void unterricht(){
        System.out.printf("%s betritt das Klassenzimmer, und beginnt den Unterricht in %s.%n", name,fach);
        sleep(450);
        System.out.println();
    }

}
