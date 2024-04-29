package samet.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Enclosure {
    Random random = new Random();

    private String name;

    private List<Animal> animalList;

    public Enclosure(String enclosure) {
        this.name = enclosure;
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

    public void getFoodneed(Map<Food, Float> foodneed) {
        for (Animal animal : animalList) {
            animal.getFoodRequirements(foodneed);
        }
    }

    public void printZooStructure(List<Keeper> workers) {
        System.out.printf("|   |-- Enclosure: %s", ConsoleColors.CYAN + name + ConsoleColors.RESET);
        if (!workers.isEmpty()) {
            System.out.print(" (Keeper: ");
            for (int i = 0; i < workers.size(); i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(workers.get(i).getName());
            }
            System.out.println(")");
        } else {
            System.out.println(" !!! Watch out, no Keeper in Enclosure!");
        }
        for (Animal animal : animalList) {
            animal.printZooStructure();
        }
        if (animalList.isEmpty()) {
            System.out.println("|       |-- (empty)");
        }
    }

    public void doClean(Keeper keeper) {
        System.out.printf("%s%s%s cleans the %s%s%s enclosure and feed the animals.%n", ConsoleColors.BLUE, keeper.getName(), ConsoleColors.RESET, ConsoleColors.CYAN, name, ConsoleColors.RESET);
    }

    public void watchRandomAnimal(Keeper keeper) {
        if (!animalList.isEmpty()) {
            Animal animal = animalList.get(Zoo.random.nextInt(animalList.size()));
            String message = "watching the Animals for 2 minutes";
            if (animal.getSpecies().equals(keeper.getFavoriteAnimal())) {
                message = "wondering his/her favorite Animal";
            }
            System.out.printf("%s%s%s %s %s%s%s%n", ConsoleColors.BLUE, keeper.getName(), ConsoleColors.RESET, message, ConsoleColors.YELLOW, animal.getName(), ConsoleColors.RESET);
        }
    }

    public void biteAnimal() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal currentAnimal = animalList.get(i);
            if (currentAnimal.isAlive() && animalList.size() > 1) {
                if (random.nextDouble() <= 0.4) {
                    Animal neighbor = null;

                    while (neighbor == null || neighbor.equals(currentAnimal) || !neighbor.isAlive()) {
                        neighbor = animalList.get(random.nextInt(animalList.size()));
                    }
                    currentAnimal.bite(neighbor);
                    String message = " bites ";
                    System.out.println(currentAnimal.getName() + ConsoleColors.PURPLE + message + ConsoleColors.RESET + neighbor.getName());
                }
            }
        }
    }

    public void printHpOfAnimals() {
        for (Animal currentAnimal : this.animalList) {
            System.out.printf("%s has Hp of %s ", currentAnimal.getName(), currentAnimal.getHealth());
            if (!currentAnimal.isAlive()) {
                System.out.println(ConsoleColors.RED + currentAnimal.getName() + ConsoleColors.RESET + " is dead. ");
            } else {
                System.out.println();
            }
        }
    }

    public void removeDeadAnimals(Keeper keeper) {
        List<Animal> deadAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isAlive()) {
                deadAnimals.add(animal);
            }
        }
        for (Animal deadAnimal : deadAnimals) {
            this.animalList.remove(deadAnimal);
            System.out.println(ConsoleColors.BLUE + keeper.getName() + ConsoleColors.RESET + " removes the dead Animal " + ConsoleColors.RED + deadAnimal.getName() + ConsoleColors.RESET + " from the enclosure.");
        }
    }
}











