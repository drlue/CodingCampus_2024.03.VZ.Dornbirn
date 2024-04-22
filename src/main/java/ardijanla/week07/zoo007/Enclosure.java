package ardijanla.week07.zoo007;

import ardijanla.ConsoleColors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Enclosure {
    Random rnd = new Random();
    String name;
    private List<Animal> animals;
    boolean serviced;

    public Enclosure(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }


    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void animalFight() {
        for (Animal aggressor : animals) {
            if (rnd.nextDouble() < 0.4) {
                //Animal rndAnimal = getRandomAnimal(x);
                Animal victim = animals.get(rnd.nextInt(animals.size()));
                if (victim != aggressor && aggressor.isAlive() && victim.isAlive()) {
                    aggressor.bite(victim);
                }
            }
        }
    }

    public void performService(Keeper keeper){
        if (!serviced) {
            serviced = true;
            System.out.printf("%s%s%s %skümmert%s sich um das Gehege: %s[%s]%s %n", ConsoleColors.RED, keeper.getName(), ConsoleColors.RESET, ConsoleColors.GREEN, ConsoleColors.RESET, ConsoleColors.BLUE, name, ConsoleColors.RESET);
            for (Animal animal : animals) {
                animal.care(keeper);
            }
            // TODO Zufalliges Tier fuer betrachten
        }
    }

    public void removeDeadAnimals(){
        List<Animal> deadAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (!animal.isAlive()) {
                deadAnimals.add(animal);
                System.out.printf("%s wird vom gehege entfernt.. RIP%n",animal.getName());
            }
        }
        animals.removeAll(deadAnimals);
    }


    void printStructure() {
        System.out.println("│   ├── Gehege: " + name);
        if (animals.isEmpty()) {
            System.out.println("│       ├── (leer)");
        } else {
            for (Animal animal : animals) {
                if (animal.isAlive()) {
                    System.out.println("│       ├── " + animal);
                }
            }

        }
    }
}
