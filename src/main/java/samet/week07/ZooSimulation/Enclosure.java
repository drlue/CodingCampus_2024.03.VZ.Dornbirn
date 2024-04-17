package samet.week07.ZooSimulation;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {

    private String name;

    private List<Animal> animalList;

    public Enclosure(String enclosure) {
        this.name = enclosure;
        animalList = new ArrayList<>();

    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

//    public void removeAnimal(Animal animal) {
//        animalList.remove(animal);
//
//    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void printZooStructure(List<Keeper> workers) {
        System.out.printf("|   |-- Gehege: %s", name);
        if (!workers.isEmpty()) {
            System.out.print(" (Pfleger: ");
            for (int i = 0; i < workers.size(); i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(workers.get(i).getName());
            }
            System.out.println(")");
        } else {
            System.out.println(" !!! VORSICHT, kein zustaendiger Pfleger wurde identifiziert.");
        }
        for (Animal animal : animalList) {
            animal.printZooStructure();
        }
        if (animalList.isEmpty()) {
            System.out.println("|       |-- (leer)");


        }
    }

}











