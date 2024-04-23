package katherina.week7.day01.zoo;

import java.util.Random;
import java.util.Vector;

public class Zoo {
    public static Random random = new Random();

    private String name;
    private int year;
    private Vector<Gehege> gehegeList;
    private Vector<Pfleger> personenliste;
    private Vector<Tierarzt> arztliste;

    public Zoo(String name, int year) {
        this.name = name;
        this.year = year;
        gehegeList = new Vector<>();
        personenliste = new Vector<>();
        arztliste = new Vector<>();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void addGehege(Gehege gehege) {
        if (!gehegeList.contains(gehege)) {
            gehegeList.add(gehege);
        } else {
            System.out.printf("Der Zoo namens \" %s\" enthält bereits das Gehege namens %s!", name, gehege.getName());
        }
    }

    public void removeGehege(Gehege gehege) {
        gehegeList.remove(gehege);
    }
    //Remove-Methoden lasse ich stehen, auch wenn ich sie nicht im Gebrauch habe.

    public void addPersonalAndBereich(Pfleger pfleger, Gehege gehege) {
        pfleger.addBereich(gehege);
        if (!personenliste.contains(pfleger)) {
            personenliste.add(pfleger);
        }
    }

    public void removePersonal(Pfleger pfleger) {
        personenliste.remove(pfleger);
    }
    //Ist grau, aber bleibt, falls es mal gebraucht wird.

    public void addVet(Tierarzt tierarzt) {
        if (tierarzt != null) {
            tierarzt.setZooIntern(this);
        }
        arztliste.add(tierarzt);
    }

    private Tier patientenSuche() {
        Tier patient = null;
        for (Gehege gehege : gehegeList) {
            Tier tier = gehege.kaputtestesTier();
            if (patient == null ||
                    (tier != null && tier.aktuelleGesundheit() < patient.aktuelleGesundheit())) {
                patient = tier;
            }
        }
        return patient;
    }

    public void simulateDay(int day) {
        System.out.printf("\nDer Tag Nummer %d beginnt in unserem Zoo!%n~*~ ~*~ ~*~%n", day);
        for (Gehege gehege : gehegeList) {
            gehege.bissSimulator();
            sleep(350);
            System.out.println();
        }
        for (Pfleger pfleger : personenliste) {
            sleep(350);
            pfleger.simulateDay();
            System.out.println();
        }
        for (Tierarzt tierarzt : arztliste) {
            Tier patient = patientenSuche();
            if (patient != null) {
                tierarzt.heal(patient);
            }
        }
    }

    public void printStructure() {
        System.out.printf("├── Zoo: %s, gegründet %d%n", name, year);
        for (Tierarzt tierarzt : arztliste) {
            tierarzt.printStructure();
        }
        for (Gehege gehege : gehegeList) {
            Vector<Pfleger> pflegerImGehege = new Vector<>();
            for (Pfleger pfleger : personenliste) {
                if (pfleger.zustaendigkeit(gehege)) {
                    pflegerImGehege.add(pfleger);
                }
            }
            gehege.printStructure(pflegerImGehege);
        }
    }

    public static void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException ie) {
        }
    }
    //Hilfsklasse, die vor allem dazu da ist, die Verzögerung beim Ausdruck nicht crashen zu lassen.


}

