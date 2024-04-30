package demian.week10.Schule.Schulklasse;

import ardijanla.ConsoleColors;
import demian.week10.Schule.Raeume.Unterrichtsraum;
import demian.week10.Schule.Schulklasse.Personen.Schueler;

import java.util.Random;
import java.util.Vector;

public class Schulklasse {

    private String name;
    private Vector<Schueler> schuelerliste;
    private Vector<Unterrichtsraum> stundenplan;

    public Schulklasse(String name) {
        this.name = name;
        schuelerliste = new Vector<>();
        stundenplan = new Vector<>();
    }

    public void addSchuelerToKlasse(Schueler schueler) {
        schuelerliste.add(schueler);
    }

    public void addStundenplanToKlasse(Unterrichtsraum unterrichtsraum) {
        stundenplan.add(unterrichtsraum);
    }

    public String getRandSchueler() {
        Random rand = new Random();
        int randomSchuelerNr = rand.nextInt(0, schuelerliste.size());
        return schuelerliste.get(randomSchuelerNr).getName();
    }

    public String getName() {
        return name;
    }

    public void dailySimulation() {
        //Jede Klasse hat 6 Einheiten
        for (int j = 0; j < 6; j++) {
            if (j == 0) {
                System.out.printf("%n--> Die Schüler begeben sich zum %s" + stundenplan.get(j) + "%s Unterricht%n", ConsoleColors.BLUE_BOLD, ConsoleColors.RESET);
                System.out.println(" --> Nach 25min Unterricht gibt es eine Pause");
                System.out.println(" --> Die Lehrer gehen in der Pause in das Lehrerzimmer");
                System.out.println(" --> Die Schüler spielen");
            } else if (j == 5) {
                System.out.printf("%n--> Die Schüler gehen zum %s" + stundenplan.get(j) + "%s Unterricht.%n", ConsoleColors.BLUE_BOLD, ConsoleColors.RESET);
                System.out.println(" --> Nach 25min ist der Unterricht beendet");
                System.out.printf(" --> Die Schüler gehen nach Hause%n");
            } else {
                System.out.printf("%n--> Die Schüler gehen zum %s" + stundenplan.get(j) + "%s Unterricht.%n", ConsoleColors.BLUE_BOLD, ConsoleColors.RESET);
                System.out.println(" --> Nach 25min Unterricht gibt es eine Pause");
                System.out.println(" --> Die Lehrer gehen in der Pause in das Lehrerzimmer");
                System.out.println(" --> Die Schüler spielen");
            }
        }
    }
}
