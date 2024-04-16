package samet.week07.ZooSimulation;

public class ZooMain {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn gegründet",2022);
        Keeper keeper = new Keeper("Günter");

        Enclosure alpenwiese = new Enclosure("Alpenwiese");
        zoo.addEnclosure(alpenwiese);
        zoo.addKeeper(keeper);

        Enclosure ried = new Enclosure("Ried");
        zoo.addEnclosure(ried);



        Enclosure terrarium = new Enclosure("Terrarium (warm)");
        zoo.addEnclosure(terrarium);

        Animal rijska = new Animal("Rijska","Kuh");
        Animal gandalf = new Animal("Gandalf","Kuh");
        Animal ciquito = new Animal("Ciquito","Kuh");
        alpenwiese.addAnimal(rijska);
        alpenwiese.addAnimal(gandalf);
        alpenwiese.addAnimal(ciquito);

        Animal garmond = new Animal("Garmond","Reh");
        Animal hugo = new Animal("Hugo","Reh");
        Animal idaxis = new Animal("Idaxis","Reh");
        ried.addAnimal(garmond);
        ried.addAnimal(hugo);
        ried.addAnimal(idaxis);

        Animal king = new Animal("King","Schlange");
        Animal queen = new Animal("Queen", "Schlange");
        Animal prince = new Animal("Prince","Schlange");
        terrarium.addAnimal(king);
        terrarium.addAnimal(queen);
        terrarium.addAnimal(prince);



        zoo.printZooStructure();


    }




    }



