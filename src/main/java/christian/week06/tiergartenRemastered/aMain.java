package christian.week06.tiergartenRemastered;

import java.util.Random;

public class aMain {
    public static Random rnd = new Random();


    public static void main(String[] args) {

        Zoo zoo = new Zoo("HappyZoo2", 2024);

        Futter fruechte = new Futter("Fruechte", "kg", 1.5f);
        Futter heu = new Futter("Heu", "Heuballen", 10.5f);

        Gehege elefantenStall = new Gehege("Elefantenstall");
        Gehege affenStall = new Gehege("Affenstall");
        Gehege kuhStall = new Gehege("Kuhstall");

        Tier affe1 = new Tier("Albert", "Kapuzineraffe", fruechte, 1.2f, 40, 10);
        Tier affe2 = new Tier("Jürgen", "Kapuzineraffe", fruechte, 1.2f, 40, 10);
        Tier elefant1 = new Tier("Alfred", "Elefant", heu, 1.5f, 500, 100);
        Tier elefant2 = new Tier("Manni", "Elefant", heu, 1.8f, 500, 100);
        Tier kuh1 = new Tier("Berta", "Kuh", heu, 0.7f, 350, 60);
        Tier kuh2 = new Tier("Birgit", "Kuh", heu, 0.8f, 350, 60);
        Tier kuh3 = new Tier("Britta", "Kuh", heu, 0.7f, 350, 60);

        Pfleger pfleger1 = new Pfleger("Hansi", "Elefant");
        Pfleger pfleger2 = new Pfleger("Paul", "Kuh");
        TierArzt tierArzt1 = new TierArzt("DrDre");
        TierArzt tierArzt2 = new TierArzt("DrT");


        zoo.addGehege(elefantenStall);
        zoo.addGehege(affenStall);
        zoo.addGehege(kuhStall);

        affenStall.addTierToList(affe1);
        affenStall.addTierToList(affe2);

        elefantenStall.addTierToList(elefant1);
        elefantenStall.addTierToList(elefant2);

        kuhStall.addTierToList(kuh1);
        kuhStall.addTierToList(kuh2);
        kuhStall.addTierToList(kuh3);

        pfleger1.addGehegeToList(affenStall);
        pfleger1.addGehegeToList(elefantenStall);

        pfleger2.addGehegeToList(kuhStall);
        pfleger2.addGehegeToList(elefantenStall);

        tierArzt1.addGehegeToList(elefantenStall);
        tierArzt2.addGehegeToList(elefantenStall);
        tierArzt1.addGehegeToList(kuhStall);
        tierArzt2.addGehegeToList(kuhStall);
        tierArzt1.addGehegeToList(affenStall);
        tierArzt2.addGehegeToList(affenStall);

        zoo.addPfleger(pfleger1);
        zoo.addPfleger(pfleger2);
        zoo.addTierArztToList(tierArzt1);
        zoo.addTierArztToList(tierArzt2);


        zoo.printStructure();
        zoo.printFutterKosten();
        sleep(1000);

        for (int days = 1; days < 20; days++) {
            System.out.println("\nTag: " + days);
            sleep(1000);
            zoo.tierAktivitaeten();
            sleep(2000);
            zoo.arbeitBeauftragen();

            zoo.resetDay();
        }
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
