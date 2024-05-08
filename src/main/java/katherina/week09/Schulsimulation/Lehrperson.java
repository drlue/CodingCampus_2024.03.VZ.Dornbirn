package katherina.week09.Schulsimulation;

import katherina.week06.day02.Fotoapparat.Objektiv;

import static katherina.zoocopyforexperiments.Zoo.sleep;

public class Lehrperson extends Person {
        private String fach;
        private Raum raum;


    public Lehrperson(String name, String fach) {
        super(name);
        this.fach = fach;
    }

    public String getFach() {
        return fach;
    }

    public void setRaum(Raum raum) {
        if (raum != null) {
            if (raum.getLehrperson() != null) {
                raum.getLehrperson().raum = null;
            }
            raum.setLehrpersonIntern(this);
        }
        this.raum = raum;
    }


    @Override
    public void unterricht(){
        System.out.printf("%s betritt %s, und beginnt den Unterricht in %s.%n", name, raum.getName(), fach);
        sleep(450);
        System.out.println();
    }

}
