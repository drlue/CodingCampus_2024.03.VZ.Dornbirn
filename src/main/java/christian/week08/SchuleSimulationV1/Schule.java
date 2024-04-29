package christian.week08.SchuleSimulationV1;

import ardijanla.ConsoleColors;
import christian.week08.SchuleSimulationV1.personV1.Direktor;
import christian.week08.SchuleSimulationV1.personV1.Schulklasse;
import christian.week08.SchuleSimulationV1.raeume.KlassenZimmer;
import christian.week08.SchuleSimulationV1.raeume.Raum;

import java.util.ArrayList;

public class Schule {
    private String name;
    private ArrayList<Schulklasse> listOfKlasse;
    private ArrayList<Raum> listOfRaeume;
    private Direktor direktor;

    public Schule(String name, Direktor direktor) {
        this.name = name;
        this.direktor = direktor;
        listOfKlasse = new ArrayList<>();
        listOfRaeume = new ArrayList<>();
    }

    //======================================================================================================get=========
    //======================================================================================================set=========
    //======================================================================================================create======
    //==================================================================================================add/remove======
    public void addRaumToList(Raum raum) {
        listOfRaeume.add(raum);
    }

    public void addKlasseToList(Schulklasse klasse) {
        listOfKlasse.add(klasse);
    }

    //==================================================================================================alter===========
    //==================================================================================================simulate========
    public void simulateSchool(int hour, int minute) {
        if (hour > 7 && hour < 13) {
            //TODO Raum-Methoden in Raum!
            for (Raum raum : listOfRaeume) {
                if (raum.getClass() == KlassenZimmer.class) {
                    raum.setAktiveKlasse(((KlassenZimmer) raum).getKlassefromPlan(hour));
                    raum.setAktiverLehrer(((KlassenZimmer) raum).getLehrer(hour));
                }
                if (minute == 5) {
                    System.out.printf("Lehrer %s %sbeginnt%s die Arbeit um %d nach %d mit der Klasse %s in %s. Es wird %s%s%s gelernt!%n", raum.getLehrerName(), ConsoleColors.GREEN, ConsoleColors.RESET, minute, hour, raum.getKlassenname(), raum.getName(), ConsoleColors.CYAN, raum.getAktiverLehrer().getSchulfachString(), ConsoleColors.RESET);
                } else if (minute == 15 && Main.rnd.nextInt(0, 100) < 5) {
                    int rndIndex = Main.rnd.nextInt(0, raum.getAktiveKlasse().getLengthfromSchuelerList());
                    System.out.printf("Der Schueler %s kommt 15 Minuten zu %sspät%s und muss zum Direktor %s%n", raum.getAktiveKlasse().getNameOfSchuelerAtIdx(rndIndex), ConsoleColors.RED_BACKGROUND, ConsoleColors.RESET, direktor.getName());
                } else if (minute == 45) {
                    System.out.printf("Lehrer %s %sbeendet%s die Arbeit um %d nach %d mit der Klasse %s in %s%n", raum.getLehrerName(), ConsoleColors.RED, ConsoleColors.RESET, minute, hour, raum.getKlassenname(), raum.getName());
                } else if (minute == 46) {
                    System.out.printf("Die Lehrer und Schueler der %s haben Pause und suchen einen neuen Raum%n", raum.getKlassenname());
                }
            }
        }
    }
}
