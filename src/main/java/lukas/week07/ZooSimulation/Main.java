package lukas.week07.ZooSimulation;

public class Main {

    public static void main(String[] args) {

        //ZOO1
        Zoo zoo1 = new Zoo("Tiergarten Dornbirn", 2017);


        //ENCLOSURES
        Enclosure zoo1Alpenwiese = new Enclosure("Alpenwiese");
        zoo1.addEnclosure(zoo1Alpenwiese);
        Enclosure zoo1Ried = new Enclosure("Ried");
        zoo1.addEnclosure(zoo1Ried);
        Enclosure zoo1TerrariumW = new Enclosure("Terrarium (warm)");
        zoo1.addEnclosure(zoo1TerrariumW);
        Enclosure zoo1Steppe = new Enclosure("Afrikanische Steppe");
        zoo1.addEnclosure(zoo1Steppe);

        //FOOD
        Food hay = new Food("Heu", Food.Unit.BALLEN, 34.50);
        Food worm = new Food("Wuermer", Food.Unit.STK, 0.30);
        Food water = new Food("Wasser", Food.Unit.LITER, 1.00);
        Food dope = new Food("Doping", Food.Unit.KILOGRAMM, 150);

        //ANIMALS
        Animal kuh1 = new Animal("Rijska", "Kuh", hay, 2);
        kuh1.addFood(water, 20);
        zoo1Alpenwiese.addAnimal(kuh1);

        Animal hirsch1 = new Animal("Josef", "Hirsch", hay, 3);
        hirsch1.addFood(water, 20);
        hirsch1.addFood(dope, 12);
        zoo1Alpenwiese.addAnimal(hirsch1);
        Animal reh1 = new Animal("Bambi", "Reh", hay, 5);
        reh1.addFood(water, 3);
        zoo1Alpenwiese.addAnimal(reh1);

        Animal storch1 = new Animal("Garmond", "Storch", worm, 25);
        storch1.addFood(water, 0.50);
        zoo1Ried.addAnimal(storch1);
        Animal storch2 = new Animal("Hugo", "Storch", worm, 30);
        storch2.addFood(water, 0.50);
        zoo1Ried.addAnimal(storch2);
        Animal storch3 = new Animal("Idaxis", "Storch", worm, 50);
        storch3.addFood(water, 0.50);
        zoo1Ried.addAnimal(storch3);

        Animal elephant1 = new Animal("Ubongo", "Elefant", hay, 15);
        elephant1.addFood(water, 10);
        zoo1Steppe.addAnimal(elephant1);
        Animal elephant2 = new Animal("Maputo", "Elefant", hay, 10);
        elephant2.addFood(water, 10);
        zoo1Steppe.addAnimal(elephant2);
        Animal giraffe1 = new Animal("Gucki", "Giraffe", hay, 3);
        giraffe1.addFood(water, 3);
        zoo1Steppe.addAnimal(giraffe1);
        Animal giraffe2 = new Animal("Langhals", "Giraffe", hay, 3);
        giraffe2.addFood(water, 3);
        zoo1Steppe.addAnimal(giraffe2);


        //KEEPERS
        Keeper keeper1 = new Keeper("Franz", "Kuh");
        keeper1.addEnclosure(zoo1Ried);
        keeper1.addEnclosure(zoo1Steppe);
        zoo1.addKeeper(keeper1);
//        Keeper keeper2 = new Keeper("Hubert", "Hirsch");
//        keeper2.addEnclosure(zoo1Ried);
//        keeper2.addEnclosure(zoo1Alpenwiese);
//        keeper2.addEnclosure(zoo1Steppe);
//        zoo1.addKeeper(keeper2);
//        Keeper keeper3 = new Keeper("Maria", "Giraffe");
//        keeper3.addEnclosure(zoo1TerrariumW);
//        keeper3.addEnclosure(zoo1Steppe);
//        zoo1.addKeeper(keeper3);
        Keeper keeper4 = new Keeper("Antonia", "Elefant");
        keeper4.addEnclosure(zoo1Alpenwiese);
        keeper4.addEnclosure(zoo1Steppe);
        zoo1.addKeeper(keeper4);


        //Print Zoo
        zoo1.printStructure();

        //Print Futterbedarf
        zoo1.printFoodStats();

        //Tagessimulation dynamisch
        System.out.println();
        System.out.println("=======SIMULATION 0.1==========");
        zoo1.startSimulationDynamic();

        //Print Zoo at End of Simulation
        zoo1.printStructure();
    }


}


