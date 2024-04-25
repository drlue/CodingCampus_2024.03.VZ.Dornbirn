package katherina.zoocopyforexperiments;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ZooSim {


    public static void main(String[] args) {
        Zoo tiergartenAndelsbuch = new Zoo("Tiergarten Andelsbuch", 2024);

        Gehege alpenwiese = new Gehege("Alpenwiese");
        tiergartenAndelsbuch.addGehege(alpenwiese);
        Gehege ried = new Gehege("Ried");
        tiergartenAndelsbuch.addGehege(ried);
        Gehege terrariumW = new Gehege("Terrarium (warm)");
        tiergartenAndelsbuch.addGehege(terrariumW);
        Gehege aquarium = new Gehege("Aquarium");
        tiergartenAndelsbuch.addGehege(aquarium);

        Tierfutter heu = new Tierfutter("Heu", "Kilogramm", 0.03f);
        Tierfutter karottenuss = new Tierfutter("Karotte-Nuss-Mix", "Kilogramm", 8);
        Tierfutter eintagskueken = new Tierfutter("Eintagskueken", "Kilogramm", 7.59f);
        Tierfutter insektenmix = new Tierfutter("Insektenmix", "Kilogramm", 14.99f);
        Tierfutter teichfischmix = new Tierfutter("Teichfischmix", "Kilogramm", 7.56f);
        Tierfutter noriflocken = new Tierfutter("Noriflocken", "Gramm", 0.30f);
        Tierfutter mineralstein = new Tierfutter("Mineralstein", "Stück", 2.99f);

        Tier kuh1 = new Tier("Rijska", "Kuh", heu, 20, 1000, 1000, 200);
        alpenwiese.addTier(kuh1);
        Tier kuh2 = new Tier("Baldrian", "Kuh", heu, 20, 1200, 1200, 150);
        alpenwiese.addTier(kuh2);
        Tier murmeli = new Tier("Pfiffikus", "Murmeltier", karottenuss, 1.2f, 250, 250, 30);
        alpenwiese.addTier(murmeli);
        Tier murmeli2 = new Tier("Whistle", "Murmeltier", karottenuss, 1.2f, 250, 250, 30);
        alpenwiese.addTier(murmeli2);
        Tier murmeli3 = new Tier("Beerenschreck", "Murmeltier", karottenuss, 1.2f, 250, 250, 30);
        alpenwiese.addTier(murmeli3);
        Tier steinbock = new Tier("Böckli", "Steinbock", heu, 5, 500, 500, 300);
        alpenwiese.addTier(steinbock);
        Tier schaf1 = new Tier("Lisa", "Schaf", heu, 3, 150, 150, 25);
        alpenwiese.addTier(schaf1);

        Tier storch1 = new Tier("Garmond", "Storch", eintagskueken, 0.6f, 300, 300, 50);
        ried.addTier(storch1);
        Tier storch2 = new Tier("Hugo", "Storch", eintagskueken, 0.6f, 250, 250, 45);
        ried.addTier(storch2);
        Tier storch3 = new Tier("Idaxis", "Storch", eintagskueken, 0.6f, 350, 350, 55);
        ried.addTier(storch3);
        Tier storch4 = new Tier("Adelina", "Storch", eintagskueken, 0.6f, 350, 350, 55);
        ried.addTier(storch4);
        Tier kiebitz = new Tier("Piepmatz", "Kiebitz", insektenmix, 0.1f, 50, 50, 5);
        ried.addTier(kiebitz);
        Tier kiebitz2 = new Tier("Matzepiep", "Kiebitz", insektenmix, 0.1f, 50, 50, 5);
        ried.addTier(kiebitz2);
        Tier kiebitz3 = new Tier("Flauschepiep", "Kiebitz", insektenmix, 0.1f, 50, 50, 5);
        ried.addTier(kiebitz3);

        //Hier könnte außerdem unser Terrariumstier stehen! Aktuell haben wir noch keins.

        Tier koi1 = new Tier("Yamato", "Koi-Karpfen", teichfischmix, 0.02f, 400, 400, 15);
        aquarium.addTier(koi1);
        Tier koi2 = new Tier("Makoto", "Koi-Karpfen", teichfischmix, 0.02f, 450, 450, 15);
        aquarium.addTier(koi2);
        Tier koi3 = new Tier("Hotaru", "Koi-Karpfen", teichfischmix, 0.02f, 450, 450, 15);
        aquarium.addTier(koi3);
        Tier seeigel = new Tier("Stachelus", "Seeigel", noriflocken, 2, 250, 250, 50);
        aquarium.addTier(seeigel);
        Tier flussschnecke = new Tier("Schnecki", "Flussschnecke", mineralstein, 1 / 14f, 145, 145, 5);
        aquarium.addTier(flussschnecke);

        Pfleger paul = new Pfleger("Paul Rossmann", "Murmeltier");
        tiergartenAndelsbuch.addPersonalAndBereich(paul, alpenwiese);
        Pfleger sally = new Pfleger("Sally Morgan", "Storch");
        tiergartenAndelsbuch.addPersonalAndBereich(sally, ried);
        Pfleger alexandra = new Pfleger("Alexandra Kovacevic", "Koi-Karpfen");
        tiergartenAndelsbuch.addPersonalAndBereich(alexandra, aquarium);

        Tierarzt drdolittle = new Tierarzt("Dr. Dolittle");
        tiergartenAndelsbuch.addVet(drdolittle);

        tiergartenAndelsbuch.printStructure();


        System.out.println();
        for (int day = 1; day <= 1; day++) {
            tiergartenAndelsbuch.simulateDay(day);
        }
    }

}

