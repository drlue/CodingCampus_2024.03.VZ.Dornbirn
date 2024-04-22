package gyula.week07.zoo;

import luki.week07.A;

public class ZooSim {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tierpark Feldkirch", 1965);
        Enclosure alpenwiese = new Enclosure("Alpenwiese");
        zoo.addEnclosure(alpenwiese);

        Enclosure ried = new Enclosure("Ried");
        zoo.addEnclosure(ried);

        Enclosure terrarium = new Enclosure("Terrarium (warm)");
        zoo.addEnclosure(terrarium);

        Animal rijska = new Animal("Rijska", "Kuh", 100, 20);
        alpenwiese.addAnimal(rijska);

        Animal zuska = new Animal("Zuska", "Ziege", 40, 20);
        alpenwiese.addAnimal(zuska);
        Animal zoltan = new Animal("Zoltan", "Ziege", 40, 20);
        alpenwiese.addAnimal(zoltan);

        Animal paula = new Animal("Paula", "Pferd", 120, 25);
        alpenwiese.addAnimal(paula);
        Animal peter = new Animal("Peter", "Pferd", 40, 25);
        alpenwiese.addAnimal(peter);

        Animal martin = new Animal("Martin", "Muecke", 1, 5);
        alpenwiese.addAnimal(martin);
        Animal manuela = new Animal("Manuela", "Muecke", 1, 5);
        alpenwiese.addAnimal(manuela);
        Animal michael = new Animal("Michael", "Muecke", 1, 6);
        alpenwiese.addAnimal(michael);

        Guardian stefan = new Guardian("Stefan-Sigfried", "Kuh");
        zoo.addGuardianAndTask(stefan, alpenwiese);
        zoo.addGuardianAndTask(stefan, ried);

        Guardian tony = new Guardian("Tony", "Elephant");
        zoo.addGuardianAndTask(tony, terrarium);

        Veterian vet = new Veterian("Dr. Doolitle");
        zoo.addVeterian(vet);

        zoo.printStructure();

        System.out.println();
        for (int day = 1; day <= 7; day++) {
            zoo.simulateDay(day);
        }

        zoo.printStructure();
    }
}
