package irem.week07.Zoo;

public class ZooSimulationMain {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn", 2022);
        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");

        alpenwiese.addTiere(new Tiere("Rijska", "Kuh"));
        ried.addTiere(new Tiere("Garmond", "Storh"));
        ried.addTiere(new Tiere("Hugo", "Storh"));
        ried.addTiere(new Tiere("Idaxis", "Storh"));

        zoo.addGehege(alpenwiese);
        zoo.addGehege(ried);
        zoo.addGehege(terrarium);

        System.out.println(zoo);
    }
}


