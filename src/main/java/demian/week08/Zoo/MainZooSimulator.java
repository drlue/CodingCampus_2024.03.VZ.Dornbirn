package demian.week08.Zoo;

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


        // Pfleger

        zookeeper pfleger1 = new zookeeper("Nadine");

        pfleger1.addresp(geh2);
        pfleger1.addresp(geh3);


        //Konsolenausdruck Zoo-Objekt:
        zoo1.printZooStruktur();
        System.out.println();

        //Konsolenausdruck Pfleger:
        System.out.println(pfleger1);


        // TESTBEREICH:


    }


}
