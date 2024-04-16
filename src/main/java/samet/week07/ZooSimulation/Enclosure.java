package samet.week07.ZooSimulation;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {

    private String name;

    private List<Animal> animalList;

    public Enclosure(String gehege) {
        this.name = gehege;
        animalList = new ArrayList<>();

    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animalList.remove(animal);

    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void printZooStructure() {
        System.out.printf("|   |-- Gehege: %s%n", name);
        for (Animal animal : animalList) {
            animal.printZooStructure();
        }
        if (animalList.isEmpty()) {
            System.out.println("|       |-- (leer)");

        }
    }
}









