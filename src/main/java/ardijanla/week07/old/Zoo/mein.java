package ardijanla.week07.old.Zoo;

public class mein {
    public static void main(String[] args) {
        Zooo zoo = new Zooo("Tiergarten Dornbirn", "2022");

        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");

        zoo.addGehege(alpenwiese);
        zoo.addGehege(ried);


        Tier pferd = new Tier("jura", "pferd",150,54);
        Tier kuh = new Tier("Rijska", "Kuh",12,24);
        Tier bear = new Tier("petrus", "bär",200,12);
        Tier hund = new Tier("flamur", "hund",100,45);

        alpenwiese.addTier(hund);
        alpenwiese.addTier(bear);
        alpenwiese.addTier(pferd);
        alpenwiese.addTier(kuh);
        ried.addTier(kuh);
        ried.addTier(pferd);


        Futter brot = new Futter("Brot", "KG", 1.5);
        Futter heu = new Futter("heu", "KG", 1.75);
        Futter stroh = new Futter("stroh", "KG", 5.7);
        pferd.setFutterBedarf(brot, 1);
        kuh.setFutterBedarf(heu, 3);
        hund.setFutterBedarf(brot, 2);
        bear.setFutterBedarf(stroh, 5);


        Pfleger Ardijan = new Pfleger("Ardijan");
        Ardijan.setFavoriteGattung(kuh.gattung);
        Ardijan.addGehege(ried);
        Ardijan.addGehege(alpenwiese);
        zoo.addPfleger(Ardijan);


        Pfleger christian = new Pfleger("christian");
        christian.addGehege(ried);
        zoo.addPfleger(christian);
        alpenwiese.nachbarbeissen();
        alpenwiese.nachbarbeissen();
        alpenwiese.nachbarbeissen();

//        zoo.starteTagesroutine();
        zoo.wochenroutine();

//        System.out.println("Die kosten Für das Füter im Zooo betragen: " + zoo.getGesamkostenSTR());
//        System.out.println(zoo.getTreeView());

    }
}
