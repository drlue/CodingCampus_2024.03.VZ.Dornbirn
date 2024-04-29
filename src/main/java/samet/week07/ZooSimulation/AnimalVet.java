package samet.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.util.List;
import java.util.Random;

public class AnimalVet {

    private String name;
    Random random = new Random();

    public AnimalVet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void healAnimal(List<Animal> animals) {
        double min = 1.0;
        Animal weakestAnimal = null;
        for (Animal animal : animals) {
            if (animal.isAlive()) {
                int health = animal.getHealth();
                int maxHealth = animal.getMaxHealth();
                double percent = (double) health / maxHealth;

                if (percent < min) {
                    weakestAnimal = animal;
                    min = percent;
                }
            }
        }
        if (weakestAnimal != null) {
            System.out.println(this.name + " heals " + ConsoleColors.GREEN + weakestAnimal.getName() + ConsoleColors.RESET + ". ");
            animals.remove(weakestAnimal);
            weakestAnimal.heal(random.nextDouble(1.3, 2.0));
        }
    }
}

