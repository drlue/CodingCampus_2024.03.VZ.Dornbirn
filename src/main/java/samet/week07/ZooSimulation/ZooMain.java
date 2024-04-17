package samet.week07.ZooSimulation;

public class ZooMain {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn ",2022);
        Enclosure alpenwiese = new Enclosure("Alpenwiese");
        zoo.addEnclosure(alpenwiese);

        Enclosure ried = new Enclosure("Ried");
        zoo.addEnclosure(ried);

        Enclosure terrarium = new Enclosure("Terrarium (warm)");
        zoo.addEnclosure(terrarium);

        Animal rijska = new Animal("Rijska","Kuh","Heu",20,0.16f);
        Animal gandalf = new Animal("Gandalf","Kuh","Heu",20,0.16f);
        Animal ciquito = new Animal("Ciquito","Kuh","Heu",20,0.16f);
        alpenwiese.addAnimal(rijska);
        alpenwiese.addAnimal(gandalf);
        alpenwiese.addAnimal(ciquito);

        Animal garmond = new Animal("Garmond","Tiger","Fleisch",10,4.99f);
        Animal hugo = new Animal("Hugo","Tiger","Fleisch",15,4.99f);
        Animal idaxis = new Animal("Idaxis","Tiger","Fleisch",12,4.99f);
        ried.addAnimal(garmond);
        ried.addAnimal(hugo);
        ried.addAnimal(idaxis);

        Animal king = new Animal("King","Schlange","Maus",1,0.49f);
        Animal queen = new Animal("Queen", "Schlange","Maus",1,0.49f);
        Animal prince = new Animal("Prince","Schlange","Maus",1,0.49f);
        terrarium.addAnimal(king);
        terrarium.addAnimal(queen);
        terrarium.addAnimal(prince);

        Keeper gunter = new Keeper("Günter");
        Keeper stefan = new Keeper("Stefan");
        Keeper josef = new Keeper("Josef");

        zoo.addGuardianAndTask(gunter,alpenwiese);
        zoo.addGuardianAndTask(stefan,ried);
        zoo.addGuardianAndTask(josef,terrarium);



        zoo.printZooStructure();


    }




    }



