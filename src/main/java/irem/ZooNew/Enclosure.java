package irem.ZooNew;

import java.util.*;
import java.util.stream.Collectors;

import static franco.week02.day05.Array.random;

public class Enclosure {
    Random rand = new Random();

    private String name;
    Vector<Animal> animalsVector;
    private boolean caredForToday;


    public Enclosure(String name) {
        this.name = name;
        this.caredForToday = false;
        animalsVector = new Vector<>();
    }

    public void addAnimal(Animal animal) {
        if (animal != null && !animalsVector.contains(animal)) {
                animalsVector.add(animal);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isCaredForToday() {
        return caredForToday;
    }

    public void resetCareStatus() {
        caredForToday = false;
    }
    public void feedAnimals(Keeper keeper) {
        for (Animal animal : animalsVector) {
            System.out.println(keeper.getName() + " feeds " + animal.getName());
        }
        caredForToday = true;
    }

    public void printStructure() {
        System.out.println("│   ├── Enclosure: " + name);
        if (animalsVector.isEmpty()) {
            System.out.println("│       ├── (Empty)");
        } else {
            for (Animal ani : animalsVector) {
                ani.printNameAndSpecies();
            }
        }
    }

    public void observeAnimals(Keeper keeper) {
        if (!animalsVector.isEmpty()) {
            Animal animal = animalsVector.get(Zoo.rand.nextInt(animalsVector.size()));
            String message = "watching";
            System.out.println(name + " is observing " + animal + " more closely.");
            String favoriteSpecies = null;
            if (animal.getSpecies().equals(favoriteSpecies)) {
                message = "wondering";
                System.out.println(name + " admires " + animal + " because it is their favorite species.");
            }
        }
    }
    public void animalInteractions() {
        int animals = 0;
        Vector<Animal> copyOfAnimals = new Vector<>(animals);
        for (Animal animal : copyOfAnimals) {
            if (animal.isAlive()) {
                Animal target = copyOfAnimals.get(random.nextInt(copyOfAnimals.size()));
                if (animal != target) {
                    animal.attemptToBite(target);
                }
            }
        }

        animalsVector.removeIf(a -> !a.isAlive());
    }
    //for each schleife überprüft ohne das wir int abfrage amchen ob das gehege leer ist

}
