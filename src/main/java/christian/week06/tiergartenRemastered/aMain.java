package christian.week06.tiergartenRemastered;

public class aMain {

    public static void main(String[] args) {
        int tag = 0;

        Zoo zoo = new Zoo("HappyZoo2", 2024);

        Futter fruechte = new Futter("Fruechte", "kg",1.5f);
        Futter heu = new Futter("Heu", "Heuballen",10.5f);

        Gehege elefantenStall = new Gehege("Elefantenstall");
        Gehege affenStall = new Gehege("Affenstall");

        Tier affe1 = new Tier("Albert","Kapuzineraffe",fruechte,1.2f);
        Tier affe2 = new Tier("Jürgen","Kapuzineraffe",fruechte,1.2f);
        Tier elefant1 =  new Tier("Alfred", "Elefant",heu,1.5f);
        Tier elefant2 =  new Tier("Manni", "Elefant", heu, 1.8f);

        zoo.addGehege(elefantenStall);
        zoo.addGehege(affenStall);
        affenStall.addTierToList(affe1);
        affenStall.addTierToList(affe2);
        elefantenStall.addTierToList(elefant1);
        elefantenStall.addTierToList(elefant2);

        Pfleger pfleger1 = new Pfleger("Hansi");
        pfleger1.addGehegeToList(affenStall);
        pfleger1.addGehegeToList(elefantenStall);

        zoo.addPfleger(pfleger1);


        zoo.printStructure();

        zoo.printStructure();
        zoo.printFutterKosten();
        pfleger1.rundgang(pfleger1);

    }
    public static void tagesSimulation (){

    }
}
