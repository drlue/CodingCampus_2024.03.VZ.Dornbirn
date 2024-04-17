package katherina.week7.day01.zoo;

import gyula.week07.zoo.Enclosure;
import gyula.week07.zoo.Guardian;

import java.util.Vector;

public class Zoo {

    private String name;
    private int year;
    private Vector<Gehege> gehegeList;
    private Vector<Pfleger> personenliste;
    enum Status { ENTER, FEED, WATCH, ADMIRE, LEAVE,REST};
    private Status status;
    private int dauer;

    public Zoo(String name, int year) {
        this.name = name;
        this.year = year;
        gehegeList = new Vector<>();
        personenliste = new Vector<>();
        status = Status.ENTER;
        dauer = 0;
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

    public void addPersonalAndBereich(Pfleger pfleger, Gehege gehege){
        pfleger.addBereich(gehege);
        if (!personenliste.contains(pfleger)){
            personenliste.add(pfleger);
        }
    }

    public Vector<Pfleger> getPersonenliste() {
        return personenliste;
    }

    public void removePersonal(Pfleger pfleger) {
        personenliste.remove(pfleger);
    }

    public static void sleep(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException ie){}
    }

//Es geht auch viel simpler:
    //Pfleger geht durch alle Gehege und füttert alle Tiere im Gehege (KEIN Tiereinzelaufruf!!!!!!!!)
    //DANACH zufälloges Tier beobachten. (und im letzten Schritt abgleichen, ob es das Lieblingstier ist.)

    public void zoosimulator(){
        System.out.println("Alle Gehege sind noch unversorgt.");
        for (int index = 0; index < gehegeList.size(); index++) {

            System.out.printf("%s betritt %s und füttert alle dort lebenden Tiere.",getPersonenliste().stream().findAny(), getGehegeliste().stream().findAny());
        }
        sleep(250);
    }

//    public void simulateDay(){
//
//        for (int day = 1; day <= 1; day++) {
//            System.out.printf("Tag %d in unserem Zoo bricht an:%n", day);
//            for (int hour = 0; hour < 24; hour++) {
//                for (int index = 0; index < personenliste.size(); index++) {
//                    personenliste.get(index).activity(hour);
//                }
//                sleep(250);
//            }
//        }
//    }

    @Override
    public String toString() {
        String zoostring;
        String personenstring="";
        zoostring = "├── Zoo: " + name + ", gegründet " + year + "\n";
        if (gehegeList != null) {
            for (Gehege ausgabe : gehegeList) {
                zoostring += ausgabe;
            }
        }
            for (Pfleger ausgabe : personenliste) {
                personenstring += ausgabe;
            }
        return zoostring+personenstring;
    }
//So habe ich die Ausgabe in der gewünschten Reihenfolge:
    //String-Variable initialisieren, dann mit dem Wunsch-Grundinhalt belegen.
    //DANN abfragen, ob Gehege vorhanden sind und falls ja, die Ausgabe der Gehege an die Ausgabe des Grundinhalts tackern.
    //Dann steht alles in der Wunsch-Reihenfolge und es gibt keine herumschwirrende Null! Juhu!

}
