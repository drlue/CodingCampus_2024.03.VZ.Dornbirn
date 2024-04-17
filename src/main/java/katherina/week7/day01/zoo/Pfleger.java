package katherina.week7.day01.zoo;


import gyula.week07.zoo.Enclosure;

import java.util.Random;
import java.util.Vector;

public class Pfleger {
    private static Random random = new Random();

    public static void copyInto(Pfleger[] tierpfleger) {

    }

    enum Status {ENTER, FEED, WATCH, ADMIRE, LEAVE, REST}

    ;
    private Status status;
    private int dauer;

    private String name;
    private String liebling;
    private Zoo zoo;

    private Vector<Gehege> bereich;

    public Pfleger(String name, String liebling) {
        this.name = name;
        this.liebling = liebling;
        status = Status.ENTER;
        dauer = 0;
        bereich = new Vector<>();
    }

    public void addBereich(Gehege gehege) {
        if (!bereich.contains(gehege)) {
            bereich.add(gehege);
        }
    }

    public void setZooIntern(Zoo zoo) {
        this.zoo = zoo;
    }

    public void activity(int hour) {
        switch (status) {
            case ENTER -> {
                if (hour == 7) {
                    System.out.printf("Es ist %d Uhr. %s tritt zur Arbeit an.%n", hour, name);
                    status = Status.FEED;
                    dauer = 1;
                }
            }
            case FEED -> {
                System.out.printf("Es ist nun %d Uhr. %s füttert [Tier] in" + zoo.getGehegeliste().get(3) + ".%n", hour, name);
                for (int anzahlGehege = 0; anzahlGehege < zoo.getGehegeliste().size(); anzahlGehege++) {
//                    for (int tier = 0; tier < getTierlist.Gehege().size(); tier++) {
//                        dauer++;
//                    }
                    dauer++;
                }
                status = Status.WATCH;
                dauer = random.nextInt(3, 6);
            }
//            case WATCH -> {
//                System.out.printf("Es ist nun %d Uhr. %s beobachtet" + random.nextInt(Tier.Gehege.size()) +" eine Weile.%n", hour, name);
//                //"iff" das gewatchte Tier das Lieblingstier ist, dann ist das nächste Case
//                //nicht "WATCH", sondern "ADMIRE".
//                status = Status.LEAVE;
//                dauer = random.nextInt(1, 4);
//            }
//            case ADMIRE -> {
//                System.out.printf("Es ist nun %d Uhr. %s findet"+ liebling+" wunderschön und beobachtet es..%n", hour,name);
//                status = Status.LEAVE;
//
//                dauer=5;
//            }
//            case LEAVE -> {
//                System.out.printf("Es ist nun %d Uhr. %s verlässt das Gehege und geht zum nächsten.%n",hour,name);
//                if (hour <= 18 || gehegeList.lastElement()=false) {
//                    status = Status.ENTER;
//                }
//                else {
//                    System.out.printf("Es ist nun %d Uhr. %s geht nach Hause.%n",hour,name);
//                    status = Status.REST;
//                }
//            }
//            case REST -> {
//            }
        }
    }

    public boolean zustaendigkeit(Gehege gehege){
        return bereich.contains(gehege);
    }

public void printStructure() {
    System.out.printf("│  ├── heute im Dienst: %s", name);
    for (int index = 0; index < bereich.size(); index++) {
        if (index == 0){
            System.out.printf(" (zuständig für: ");
        } else {
            System.out.printf(", ");
        }
        System.out.print(bereich.get(index).getName());
        if (index == bereich.size() - 1){
            System.out.print(")");
        }
    }
    System.out.println();
}


    public String getName() {
        return name;
    }
}

