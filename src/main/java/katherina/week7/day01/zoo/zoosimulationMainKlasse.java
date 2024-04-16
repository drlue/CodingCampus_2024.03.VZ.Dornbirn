package katherina.week7.day01.zoo;

public class zoosimulationMainKlasse {


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

        Tier kuh1 = new Tier("Rijska", "Kuh");
        alpenwiese.addTier(kuh1);
        Tier kuh2 = new Tier("Baldrian", "Kuh");
        alpenwiese.addTier(kuh2);
        Tier murmeli = new Tier("Pfiffikus","Murmeltier");
        alpenwiese.addTier(murmeli);

        Tier storch1 = new Tier("Garmond", "Storch");
        ried.addTier(storch1);
        Tier storch2 = new Tier("Hugo", "Storch");
        ried.addTier(storch2);
        Tier storch3 = new Tier("Idaxis", "Storch");
        ried.addTier(storch3);

        //Hier könnte außerdem unser Terrariumstier stehen! Aktuell haben wir noch keins.

        Tier koi1 = new Tier("Yamato","Koi-Karpfen");
        aquarium.addTier(koi1);
        Tier koi2 = new Tier("Makoto","Koi-Karpfen");
        aquarium.addTier(koi2);
        Tier seeigel = new Tier("Stachelus","Seeigel");
        aquarium.addTier(seeigel);

        Pfleger paul = new Pfleger("Paul Rossmann","Murmeltier");
        alpenwiese.addPersonal(paul);
        Pfleger alexandra = new Pfleger("Alexandra Kovacevic","Koi-Karpfen");
        ried.addPersonal(alexandra);

        System.out.println(tiergartenAndelsbuch);

        tiergartenAndelsbuch.simulateDay(1);
    }
}
