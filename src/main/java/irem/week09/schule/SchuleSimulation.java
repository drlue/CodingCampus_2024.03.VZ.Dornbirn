package irem.week09.schule;

import ardijanla.ConsoleColors;


import java.util.ArrayList;
import java.util.List;

public class SchuleSimulation {
    private List<Person> personen;
    private List<Raum> raeume;
    private List<Stundenplan> stundenplaene;

    public SchuleSimulation() {
        personen = new ArrayList<>();
        raeume = new ArrayList<>();
        stundenplaene = new ArrayList<>();

        initialisiereSchule();
    }

    private void initialisiereSchule() {

        Raum klassenraum = new Raum(RaumTyp.KLASSENRAUM, "Raum 101");
        Raum direktorenzimmer = new Raum(RaumTyp.DIREKTORZIMMER, "Direktorenzimmer");
        raeume.add(klassenraum);
        raeume.add(direktorenzimmer);

        Lehrer lehrer = new Lehrer("Herr Görkem");
        Schueler schueler = new Schueler("Karamel");
        Schuldirektor direktor = new Schuldirektor("Frau Sinem", direktorenzimmer);
        personen.add(lehrer);
        personen.add(schueler);
        personen.add(direktor);

        Stundenplan stundenplan = new Stundenplan(lehrer, "Mathematik", klassenraum);
        stundenplaene.add(stundenplan);
    }

    public void starteTagesablauf() {
        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"};
        for (String tag : wochentage) {
            System.out.print(ConsoleColors.GREEN);
            System.out.println(tag + " beginnt die Schule.");

            if (tag.equals("Montag")) {
                montagsRoutine();
            } else if (tag.equals("Mittwoch")) {
                mittwochsRoutine();
            } else {
                normalerSchultag();
            }
            System.out.println(ConsoleColors.RED);
            System.out.println(tag + " endet die Schule.\n");
            System.out.println(ConsoleColors.RESET);
        }

    }

    private void montagsRoutine() {
        System.out.print(ConsoleColors.PURPLE);
        System.out.println("\nMontagmorgen: Lehrerversammlung im Lehrerzimmer.");
        for (Stundenplan stundenplan : stundenplaene) {
            stundenplan.druckeDetails();
        }
        System.out.println(ConsoleColors.RESET);
    }

    private void mittwochsRoutine() {
        System.out.println(ConsoleColors.PURPLE);
        System.out.println("Mittwoch ist Projekttag.");
        for (Person person : personen) {
            if (person instanceof Schueler) {
                System.out.println(person.getName() + " arbeitet am Projekt.");
            }
        }
        System.out.println(ConsoleColors.RESET);
    }

    private void normalerSchultag() {
        System.out.println(ConsoleColors.YELLOW);
        System.out.println("Normaler Schultag mit Unterricht und Pausen.");
        for (Stundenplan stundenplan : stundenplaene) {
            stundenplan.druckeDetails();
            System.out.println("Pause zwischen den Stunden.");
        }
        System.out.println(ConsoleColors.RESET);

    }
}
