package katherina.week7.day01.zoo;

import java.util.Vector;

public class Pfleger {
    private String name;
    private Vector<Pfleger> personenliste;
    private Zoo zoo;

    public Pfleger(String name) {
        this.name = name;
        personenliste = new Vector<>();
    }


    public void setZooIntern(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public String toString() {
        String personenstring = "";
        personenstring = "        ├── zuständig: " + name + "\n";
        if (personenliste != null) {
            for (Pfleger ausgabe : personenliste) {
                personenstring += ausgabe;
            }
        }
        return personenstring;
    }
}

