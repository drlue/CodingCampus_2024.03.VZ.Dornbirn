package katherina.week7.day01.zoo;

import java.util.Random;
import java.util.Vector;

public class Zoo {
    public static Random random = new Random();

    private String name;
    private int year;
    private Vector<Gehege> gehegeList;
    private Vector<Pfleger> personenliste;


    public Zoo(String name, int year) {
        this.name = name;
        this.year = year;
        gehegeList = new Vector<>();
        personenliste = new Vector<>();
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
            System.out.printf("Der Zoo namens \" %s\" enthält bereits das Gehege namens \"%\"!", name, gehege.getName());
        }
    }

    public void removeGehege(Gehege gehege) {
        gehegeList.remove(gehege);
    }

    public Vector<Gehege> getGehegeliste() {
        return gehegeList;
    }

    public Gehege getGehege(Gehege gehege) {
        return gehege;
    }

    public void addPersonal(Pfleger pfleger) {
        if (pfleger != null) {
            pfleger.setZooIntern(this);
        }
        personenliste.add(pfleger);
    }

    public void addPersonalAndBereich(Pfleger pfleger, Gehege gehege) {
        pfleger.addBereich(gehege);
        if (!personenliste.contains(pfleger)) {
            personenliste.add(pfleger);
        }
    }

    public Vector<Pfleger> getPersonenliste() {
        return personenliste;
    }

    public void removePersonal(Pfleger pfleger) {
        personenliste.remove(pfleger);
    }

    public void simulateDay(int day) {
        System.out.printf("\nDer Tag Nummer %d beginnt in unserem Zoo!%n~*~ ~*~ ~*~%n", day);
        for (Gehege gehege : gehegeList) {
            gehege.bissSimulator();
            //   sleep(1000);

            for (Pfleger pfleger : personenliste) {
                //   sleep(1000);
                pfleger.simulateDay();
            }
        }
    }


    public static void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException ie) {
        }
    }


    public void printStructure() {
        System.out.printf("├── Zoo: %s, gegründet %d%n", name, year);
        for (Pfleger pfleger : personenliste) {
            pfleger.printStructure();
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


}
