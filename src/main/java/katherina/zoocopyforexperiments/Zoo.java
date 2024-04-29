package katherina.zoocopyforexperiments;

import java.util.HashMap;
import java.util.Map;
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

    public void printFutterKosten() {
        Map<Tierfutter, Float> futterBedarfMap = new HashMap<>();
        for (Gehege gehege : gehegeList) {
            gehege.getFutterBedarf(futterBedarfMap);
        }
        System.out.printf("\n\nDie täglichen Ausgaben für Tierfutter belaufen sich auf: %5.2f €/Tag\n", calculateFutterKosten(futterBedarfMap));
    }

    public float calculateFutterKosten(Map<Tierfutter, Float> futterbedarf) {
        float futterKosten = 0;
        for (Map.Entry<Tierfutter, Float> entry : futterbedarf.entrySet()) {
           // System.out.printf("\nFutter: %16.16s    ;    Futtermenge: %5.2f    ;    Kosten: %6.2f €/Tag", entry.getKey().getBezeichnung(), entry.getValue(), entry.getValue() * entry.getKey().getPreisProUnit());
            //Auskommentiert, statt gelöscht, falls ich aus irgendeinem Grund kontrollieren muss, ob das schon so stimmt, was bei der Summe rauskommt.
            futterKosten += entry.getValue() * entry.getKey().getPreisProUnit();
        }
        return futterKosten;
    }

    public void simulateDay(int day) {
        System.out.printf("\nDer Tag Nummer %d beginnt in unserem Zoo!%n~*~ ~*~ ~*~%n%n", day);
        System.out.println("In der Nacht sind die Tiere nicht immer friedlich zu einander.\n");
        for (Gehege gehege : gehegeList) {
            System.out.printf("***/// %s \\\\\\***%n", gehege.getName());
            gehege.bissSimulator();
            sleep(450);
            System.out.println();
        }
        for (Pfleger pfleger : personenliste) {
            sleep(450);
            pfleger.simulateDay();
            System.out.println();
        }
        for (Tierarzt tierarzt : arztliste) {
            sleep(450);
            Tier patient = patientenSuche();
            if (patient != null) {
                tierarzt.heal(patient);
            }
        }
        System.out.println("Alle Menschen sind nun wieder gegangen. Der Tag ist zu Ende und ein neuer Morgen wird neue Erlebnisse bringen.\n");
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
        printFutterKosten();
    }

    public static void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException ie) {
        }
    }
    //Hilfsklasse, die vor allem dazu da ist, die Verzögerung beim Ausdruck nicht crashen zu lassen.


}

