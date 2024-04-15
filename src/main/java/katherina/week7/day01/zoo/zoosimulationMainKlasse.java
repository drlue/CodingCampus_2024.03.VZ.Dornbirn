package katherina.week7.day01.zoo;

import java.util.Vector;

public class zoosimulationMainKlasse {

    public static void main(String[] args) {
        Zoo tiergartenAndelsbuch = new Zoo("Tiergarten Andelsbuch", 2024);

        System.out.println(tiergartenAndelsbuch);

        Vector<String> gehege = new Vector<>();
        Gehege alpenwiese = new Gehege("Alpenwiese");
        gehege.add(String.valueOf(alpenwiese));
        Gehege ried = new Gehege("Ried");
        gehege.add(String.valueOf(ried));
        Gehege terrariumW = new Gehege("Terrarium (warm)");
        gehege.add(String.valueOf(terrariumW));


        Vector<String> wiesentiere = new Vector<>();
        Tier kuh1 = new Tier("Rijska", "Kuh");
        wiesentiere.add(String.valueOf(kuh1));

        alpenwiese.setTier(kuh1);
        System.out.print(alpenwiese);


        for (String s : wiesentiere) {
            System.out.print(s);
        }

        Vector<String> riedtiere = new Vector<>();
        Tier storch1 = new Tier("Garmond", "Storch");
        riedtiere.add(String.valueOf(storch1));
        ried.setTier(storch1);
        Tier storch2 = new Tier("Hugo", "Storch");
        riedtiere.add(String.valueOf(storch2));
        ried.setTier(storch2);
        Tier storch3 = new Tier("Idaxis", "Storch");
        riedtiere.add(String.valueOf(storch3));
        ried.setTier(storch3);
        System.out.print(ried);

        for (String s : riedtiere) {
            System.out.print(s);
        }


        Vector<String> warmeTerrariumtiere = new Vector<>();
        for (int index = 0; index < warmeTerrariumtiere.size(); index++) {
            if (!warmeTerrariumtiere.isEmpty()) {
                System.out.println(warmeTerrariumtiere.get(index));
            } else {
                System.out.println("        (leer)");
            }

        }

    }
}
