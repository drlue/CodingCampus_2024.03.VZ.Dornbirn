package katherina.week7.day01.zoo;

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

        Tier kuh1 = new Tier("Rijska", "Kuh", 1000, 1000, 200);
        alpenwiese.addTier(kuh1);
        Tier kuh2 = new Tier("Baldrian", "Kuh", 1200, 1200, 150);
        alpenwiese.addTier(kuh2);
        Tier murmeli = new Tier("Pfiffikus", "Murmeltier", 250, 250, 30);
        alpenwiese.addTier(murmeli);

        Tier storch1 = new Tier("Garmond", "Storch", 300, 300, 50);
        ried.addTier(storch1);
        Tier storch2 = new Tier("Hugo", "Storch", 250, 250, 45);
        ried.addTier(storch2);
        Tier storch3 = new Tier("Idaxis", "Storch", 350, 350, 55);
        ried.addTier(storch3);

        //Hier könnte außerdem unser Terrariumstier stehen! Aktuell haben wir noch keins.

        Tier koi1 = new Tier("Yamato", "Koi-Karpfen", 400, 400, 15);
        aquarium.addTier(koi1);
        Tier koi2 = new Tier("Makoto", "Koi-Karpfen", 450, 450, 15);
        aquarium.addTier(koi2);
        Tier seeigel = new Tier("Stachelus", "Seeigel", 250, 250, 50);
        aquarium.addTier(seeigel);

        Pfleger paul = new Pfleger("Paul Rossmann", "Murmeltier");
        tiergartenAndelsbuch.addPersonalAndBereich(paul, alpenwiese);
        Pfleger alexandra = new Pfleger("Alexandra Kovacevic", "Koi-Karpfen");
        tiergartenAndelsbuch.addPersonalAndBereich(alexandra, ried);

        tiergartenAndelsbuch.printStructure();



        System.out.println();
        for (int day = 1; day <= 3; day++) {
tiergartenAndelsbuch.tierAktivitaeten();
            tiergartenAndelsbuch.simulateDay(day);
        }

    }
}
