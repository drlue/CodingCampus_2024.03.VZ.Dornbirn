package demian.week08.Zoo;

import ardijanla.ConsoleColors;

public class MainZooSimulator {
    public static void main(String[] args) {
        //Zoo deklarieren und initialisieren:
        Zoo zoo1 = new Zoo("Wildpark Vorarlberg", 1980);

        //Gehege für zoo1 deklarieren und initialisieren:

        Gehege geh1 = new Gehege("Pinguin-Becken");
        zoo1.addGehege(geh1);

        Gehege geh2 = new Gehege("Steinbock-Felsen");
        zoo1.addGehege(geh2);

        Gehege geh3 = new Gehege("Vogelkäfig");
        zoo1.addGehege(geh3);

        Gehege geh4 = new Gehege("Wiese");
        zoo1.addGehege(geh4);

        //Tiere für gehe

        Tier kuh1 = new Tier("Ali", "Kuh");
        Tier kuh2 = new Tier("Franz", "Kuh");
        Tier steinbock1 = new Tier("Manfred", "Steinbock");
        Tier vogel1 = new Tier("Flappy", "Krähe");
        Tier pinguin1 = new Tier("Pingu", "Pinguin");

        geh2.addAnimal(steinbock1);
        geh4.addAnimal(kuh1);
        geh4.addAnimal(kuh2);
        geh3.addAnimal(vogel1);
        geh1.addAnimal(pinguin1);
        geh1.addAnimal(kuh1);


        // Pfleger erstellen

        zookeeper pfleger1 = new zookeeper("Nadine", kuh1);
        zookeeper pfleger2 = new zookeeper("Daniel",vogel1);
        zookeeper pfleger3 = new zookeeper("Manfred",pinguin1);

        // Pfleger verantwortungen zuteilten:

        pfleger1.addResp(geh2);
        pfleger1.addResp(geh3);

        // Pfleger Zoo hinzufügen

        zoo1.addPfleger(pfleger1);
        zoo1.addPfleger(pfleger2);
        zoo1.addPfleger(pfleger3);

        // Pflegerliste ausdrucken:

        System.out.printf("%sPflegerliste Zoo1: %s", ConsoleColors.BLUE, ConsoleColors.RESET);
       for (zookeeper pfleger : zoo1.getPflegerliste()){
           System.out.print(pfleger.getName() + ",");
       }
        System.out.println();
        System.out.println();



        //Konsolenausdruck Zoo-Objekt:
        zoo1.printZooStruktur();
        System.out.println();

        //Konsolenausdruck Pfleger:
        System.out.println(pfleger1);


        //Simulation 1.0
        for (int i = 0; i < 5; i++) {
            // Am Tagesbeginn werden alle im Zoo1 enthaltenen gehege werden auf ungepflegt gesetzt:
            zoo1.setGehegeStatusAufUngepflegt();
            // Tag ausdrucken
            System.out.println("Tag" + (i+1) + ":");
            // Pfleger loschicken
            System.out.println("Zookepper stürmen los");
            // Pfleger Random Gehege zuteilen zum Arbeiten
            pfleger1.printGehegearbeit(geh1);

        }


    }


}
