package katherina.week7.day01.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int year;

    private Vector<Gehege> gehegeList;
    private Vector<Pfleger> pflegerList;



    public Zoo(String name, int year) {
        this.name = name;
        this.year = year;
        gehegeList = new Vector<>();
        pflegerList = new Vector<>();

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
        if (gehege != null) {
            gehege.setZooIntern(this);
        }
        gehegeList.add(gehege);
    }

    public void addPersonal(Pfleger pfleger) {
        if (pfleger != null) {
            pfleger.setZooIntern(this);
        }
        pflegerList.add(pfleger);
    }


    @Override
    public String toString() {
        String zoostring = "";
        zoostring = "├── Zoo: " + name + ", gegründet " + year + "\n";
        if (gehegeList != null) {
            for (Gehege ausgabe : gehegeList) {
                zoostring += ausgabe;
            }
        }
        return zoostring;
    }
//So habe ich die Ausgabe in der gewünschten Reihenfolge:
    //String-Variable initialisieren, dann mit dem Wunsch-Grundinhalt belegen.
    //DANN abfragen, ob Gehege vorhanden sind und falls ja, die Ausgabe der Gehege an die Ausgabe des Grundinhalts tackern.
    //Dann steht alles in der Wunsch-Reihenfolge und es gibt keine herumschwirrende Null! Juhu!

}
