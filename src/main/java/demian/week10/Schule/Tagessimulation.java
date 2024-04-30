package demian.week10.Schule;

import ardijanla.ConsoleColors;
import demian.week10.Schule.Raeume.Fachgebiet;
import demian.week10.Schule.Raeume.Unterrichtsraum;
import demian.week10.Schule.Schulklasse.Personen.Schueler;
import demian.week10.Schule.Schulklasse.Schulklasse;

import java.util.Random;

public class Tagessimulation {
    public static void main(String[] args) {

        //Schule gründen
        Schule digitalcampus = new Schule("Digitalcampus");
        //Schulklasse gründen
        Schulklasse dieKleinenHorvathAufsteiger = new Schulklasse("Die kleinen Horvath Aufsteiger");
        //Schulklasse zu Schule hinzufügen
        digitalcampus.addToKlassenliste(dieKleinenHorvathAufsteiger);
        //Schüler erstellen und zu Schulklasse hinzufügen
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Katharina"));
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Irem"));
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Lukas"));
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Demian"));
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Aki"));
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Ardi"));
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Fuchsmann"));
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Franco"));
        dieKleinenHorvathAufsteiger.addSchuelerToKlasse(new Schueler("Samet"));
        //Unterrichtsräume erstellen und zu Schulklasse hinzufügen
       dieKleinenHorvathAufsteiger.addStundenplanToKlasse(new Unterrichtsraum("Strukturierte Programmierung"));
       dieKleinenHorvathAufsteiger.addStundenplanToKlasse(new Unterrichtsraum("OO Programmierung"));
       dieKleinenHorvathAufsteiger.addStundenplanToKlasse(new Unterrichtsraum("WEB"));
       dieKleinenHorvathAufsteiger.addStundenplanToKlasse(new Unterrichtsraum("Datenbank"));
       dieKleinenHorvathAufsteiger.addStundenplanToKlasse(new Unterrichtsraum("Projekt"));
       dieKleinenHorvathAufsteiger.addStundenplanToKlasse(new Unterrichtsraum("Eigenstudium"));


       //Schulsimulation
        for (int i = 0; i < 5; i++) {   // Eine Woche Simulieren
            System.out.println();
            System.out.printf("%sTag" + (i+1) + ": %s%n", ConsoleColors.GREEN_BACKGROUND, ConsoleColors.RESET);
            //Am Morgen kommen die Schüler und Lehrer in die Schule:
            System.out.println("Die Schüler und Lehrer machen sich auf den Weg in die Schule");
            System.out.printf("%s    \\_/\n" +
                    "  --(_)--  .\n" +
                    "    / \\   /_\\\n" +
                    "          |Q|\n" +
                    "    .-----' '-----.                                  __\n" +
                    "   /____[SCHOOL]___\\                                ()))\n" +
                    "    | [] .-.-. [] |                                (((())\n" +
                    "  ..|____|_|_|____|..................................)(... ldb%s\n\n", ConsoleColors.PURPLE, ConsoleColors.RESET);
            //Wenn die Schüler zu spät kommen müssen sie zum Direktor:
            String randomschueler = digitalcampus.getRandomSchueler();
            System.out.printf("%s" + randomschueler + "%s hat es leider nicht pünktlich geschafft und muss zum Direktor.%n", ConsoleColors.BLUE_BOLD, ConsoleColors.RESET);
            if (randomschueler.equals("Ardi")){
                System.out.printf("%sArdi behauptet das sich seine Katze angeschissen hat und er sie noch duschen musste.%s%n", ConsoleColors.RED_BOLD, ConsoleColors.RESET);
            }
            //Random Schulklasse auswählen
            Schulklasse simulationsKlasse = digitalcampus.getRandomSchulkasse();
            System.out.printf("%nHeute schauen wir uns an was die Klasse %s" + simulationsKlasse.getName() + "%s machen.%n", ConsoleColors.BLUE_BOLD, ConsoleColors.RESET);
            //Tagessimulation der Klasse:
            dieKleinenHorvathAufsteiger.dailySimulation();




        }



    }
}
