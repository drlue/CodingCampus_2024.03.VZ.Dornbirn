package ardijanla.week07.zoo007;

import java.util.Random;

public class moin {
    public static void main(String[] args) {
        //Erstelle Zooo
        Zoo zoo = new Zoo("Tiergarten Dornbirn", 2022);

        //Erstelle Gehege
        Enclosure alpenwiese = new Enclosure("Alpenwiese");
        Enclosure ried = new Enclosure("Ried");
        Enclosure terrarium = new Enclosure("Terrarium (warm)");

        //Füge dem Zooo Gehege hinzu
        zoo.addEnclosure(alpenwiese);
        zoo.addEnclosure(ried);
//        zoo.addEnclosure(terrarium);

        //Erstelle Futter
        Food grass = new Food("Gras", "Kilogramm", 0.5);
        Food fish = new Food("Fisch", "Kilogramm", 2.0);

        //Füge den Gehegen Tiere hinzu
        alpenwiese.addAnimal(new Animal("Rijska", "Elefant", grass, 5, 15, 5));
        alpenwiese.addAnimal(new Animal("herold", "chimpanse", grass, 5, 15, 5));
        alpenwiese.addAnimal(new Animal("frederik", "Ameise", grass, 5, 15, 5));
        ried.addAnimal(new Animal("Garmond", "Fisch", fish, 1, 14, 1));
        ried.addAnimal(new Animal("markus", "Giraffe", fish, 1, 10, 4));
        ried.addAnimal(new Animal("jürgen", "fuchs", fish, 1, 12, 2));

        Animal pferd = new Animal("Alex", "Pferd", fish, 2, 20, 12);
        ried.addAnimal(pferd);

        //Erstelle Pfleger
        Keeper peter = new Keeper("Peter");
        peter.addResponsibility(alpenwiese);

        Keeper jonas = new Keeper("Jonas");
        jonas.addResponsibility(ried);
        jonas.addFavoriteAnimal(pferd);

        //Füge Pfleger dem Zooo hinzu
        zoo.addKeeper(peter);
        zoo.addKeeper(jonas);

        for (int i = 1; i < 7; i++) {
            zoo.simulateDay();
        }


        zoo.printStructure();
    }
}
