package demian.week08.Zoo;

import ardijanla.ConsoleColors;
import demian.week08.Enum.KonsolenFarben;

public class MainZooSimulator {
    public static void main(String[] args) {
        //Zoo deklarieren und initialisieren:
        Zoo zoo1 = new Zoo("Wildpark Vorarlberg", 1980);

        //Gehege für zoo1 deklarieren und initialisieren:

        Gehege gehPingu = new Gehege("Pinguin-Becken");
        zoo1.addGehege(gehPingu);

        Gehege gehSteinb = new Gehege("Steinbock-Felsen");
        zoo1.addGehege(gehSteinb);

        Gehege gehVogelk = new Gehege("Vogelkäfig");
        zoo1.addGehege(gehVogelk);

        Gehege gehWies = new Gehege("Wiese");
        zoo1.addGehege(gehWies);

        //Tiere für gehe

        Tier kuh1 = new Tier("Ali", "Kuh");
        Tier kuh2 = new Tier("Franz", "Kuh");
        Tier steinbock1 = new Tier("Manfred", "Steinbock");
        Tier vogel1 = new Tier("Flappy", "Krähe");
        Tier pinguin1 = new Tier("Pingu", "Pinguin");
        Tier maus1 = new Tier("Mickey","Maus");
        Tier drache1 = new Tier("Hans", "Drache");

        gehSteinb.addAnimal(steinbock1);
        gehWies.addAnimal(kuh1);
        gehWies.addAnimal(kuh2);
        gehVogelk.addAnimal(vogel1);
        gehPingu.addAnimal(pinguin1);
        gehPingu.addAnimal(kuh1);
        gehWies.addAnimal(maus1);
        gehVogelk.addAnimal(drache1);


        // Pfleger erstellen

        zookeeper pflNadine = new zookeeper("Nadine", kuh1);
        zookeeper pflDaniel = new zookeeper("Daniel",vogel1);
        zookeeper pflManfred = new zookeeper("Manfred",pinguin1);
        zookeeper pflAlina = new zookeeper("Alina", drache1);

        // Pfleger verantwortungen zuteilten:

        pflNadine.addResp(gehSteinb);
        pflNadine.addResp(gehVogelk);
        pflDaniel.addResp(gehSteinb);
        pflDaniel.addResp(gehVogelk);
        pflDaniel.addResp(gehPingu);
        pflManfred.addResp(gehWies);
        pflManfred.addResp(gehVogelk);
        pflAlina.addResp(gehWies);


        // Pfleger Zoo hinzufügen

        zoo1.addPfleger(pflNadine);
        zoo1.addPfleger(pflDaniel);
        zoo1.addPfleger(pflManfred);
        zoo1.addPfleger(pflAlina);

        // Lieblinstiere zu Pfleger hinzufügen
        pflNadine.setLieblingstier(steinbock1);

        // Pflegerliste ausdrucken:

        System.out.printf("%sPflegerliste Zoo1: %s", ConsoleColors.BLUE, ConsoleColors.RESET);
       for (zookeeper pfleger : zoo1.getZookeeperList()){
           System.out.print(pfleger.getName() + ",");
       }
        System.out.println();
        System.out.println();



        //Konsolenausdruck Zoo-Objekt:
        zoo1.printZooStruktur();
        System.out.println();

        //Konsolenausdruck Pfleger:
        System.out.println(pflNadine);


//        //Simulation 1.0
//
//        System.out.printf("%n%n%s ZOOSIMULATION: %s%n%n", KonsolenFarben.BLUE_BACKGROUND.getCode(),KonsolenFarben.RESET.getCode());
//        for (int i = 0; i < 2; i++) {
//            // Am Tagesbeginn werden alle im Zoo1 enthaltenen gehege werden auf ungepflegt gesetzt:
//            zoo1.setGehegeStatusAufUngepflegt();
//            // Tag ausdrucken
//            System.out.printf("%sTag" + (i+1) + ":%s\n",ConsoleColors.BLUE, ConsoleColors.RESET);
//            // Zoo Tagessimulation starten
//            zoo1.tagesSimulation();
//
//        }

        // Simulation 2.0

        System.out.printf("%n%n%sDigimon Kampfarena: %n%n%s", ConsoleColors.PURPLE_BRIGHT, ConsoleColors.RESET);
        //Kampfsimulation des Zoos starten und das x MAL
        for (int i = 0; i < 30; i++) {
            System.out.printf("%sTAG%d: %s%n%n",ConsoleColors.BLUE_BOLD,i+1,ConsoleColors.RESET);
            zoo1.fightSIM();
            System.out.println();
        }


    }


}
