package lukas.week07.ZooSimulation;

import java.time.Year;

public class Main {

    public static void main(String[] args) {

        //ZOO1
        Zoo zoo1 = new Zoo("Tiergarten Dornbirn", 2017);
/*
        //ENCLOSURES
        Enclosure zoo1Alpenwiese = new Enclosure("Alpenwiese");
        zoo1.addEnclosure(zoo1Alpenwiese);
        Enclosure zoo1Ried = new Enclosure("Ried");
        zoo1.addEnclosure(zoo1Ried);
        Enclosure zoo1TerrariumW = new Enclosure("Terrarium (warm)");
        zoo1.addEnclosure(zoo1TerrariumW);

        //FOOD
        Food hay = new Food("Heu", Food.Unit.BALLEN, 34.50);
        Food worm = new Food("Wuermer", Food.Unit.STK, 0.30);
        Food water = new Food("Wasser", Food.Unit.LITER, 1.00);
        Food dope = new Food("Doping", Food.Unit.KILOGRAMM, 150);

        //ANIMALS
        Animal kuh1 = new Animal("Rijska", "Kuh", hay, 2);
        kuh1.addFood(water,20);
        zoo1Alpenwiese.addAnimal(kuh1);

        Animal hirsch1 = new Animal("Josef", "Hirsch", hay, 3);
        hirsch1.addFood(water, 20);
        hirsch1.addFood(dope, 12);
        zoo1Alpenwiese.addAnimal(hirsch1);
        Animal reh1 = new Animal("Bambi", "Reh", hay, 5);
        reh1.addFood(water, 3);
        zoo1Alpenwiese.addAnimal(reh1);

        Animal storch1 = new Animal("Garmond", "Storch", worm, 25);
        storch1.addFood(water,0.50);
        zoo1Ried.addAnimal(storch1);
        Animal storch2 = new Animal("Hugo", "Storch", worm, 30);
        storch2.addFood(water,0.50);
        zoo1Ried.addAnimal(storch2);
        Animal storch3 = new Animal("Idaxis", "Storch", worm, 50);
        storch3.addFood(water,0.50);
        zoo1Ried.addAnimal(storch3);
*/

        zoo1.searchAndCreateAnimal("Alpenwiese", "Rijska", "Kuh", "Heu", Food.Unit.BALLEN, 34.50, 2);
        zoo1.searchAndCreateAnimal("Alpenwiese", "Rijska", "Kuh", "Wasser", Food.Unit.LITER, 0.50, 12);
        zoo1.searchAndCreateAnimal("Alpenwiese", "Rijska 2", "Kuh", "Heu", Food.Unit.BALLEN, 34.50, 2);
        zoo1.searchAndCreateAnimal("Alpenwiese 2", "Rijska 3", "Kuh", "Heu", Food.Unit.BALLEN, 34.50, 2);
        zoo1.searchAndCreateAnimal("Alpenwiese 2", "Rijska 4", "Kuh", "Heu", Food.Unit.BALLEN, 34.50, 2);
        zoo1.searchAndCreateAnimal("Alpenwiese", "Rijska 5", "Kuh", "Heu", Food.Unit.BALLEN, 34.50, 2);



        //Print Zoo
        zoo1.printStructure();

        //Print Futterbedarf
        //zoo1.printFoodStat();
        zoo1.printFoodStatByGyula();

        //



    }
}
