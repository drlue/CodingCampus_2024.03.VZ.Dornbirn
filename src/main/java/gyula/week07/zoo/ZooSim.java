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
        zoo.addEnclosure(alpenwiese);

        Animal rijska = new Animal("Rijska", "Kuh");
        alpenwiese.addAnimal(rijska);

        zoo.printStructure();
    }
}
