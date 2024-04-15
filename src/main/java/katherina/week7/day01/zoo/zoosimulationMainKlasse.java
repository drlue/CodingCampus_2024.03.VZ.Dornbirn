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

        Tier kuh1 = new Tier("Rijska", "Kuh");
        alpenwiese.addWiesentier(kuh1);

        Tier storch1 = new Tier("Garmond", "Storch");
        ried.addRiedTier(storch1);
        Tier storch2 = new Tier("Hugo", "Storch");
        ried.addRiedTier(storch2);
        Tier storch3 = new Tier("Idaxis", "Storch");
        ried.addRiedTier(storch3);

        //Hier könnte außerdem unser Terrariumstier stehen! Aktuell haben wir noch keins.


        Pfleger paul = new Pfleger("Paul Rossmann");
        ried.addPersonal(paul);
        Pfleger alexandra = new Pfleger("Alexandra Kovacevic");



        System.out.println(tiergartenAndelsbuch);

    }
}
