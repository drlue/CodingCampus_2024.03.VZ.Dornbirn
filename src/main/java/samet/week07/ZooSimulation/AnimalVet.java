package samet.week07.ZooSimulation;

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
            System.out.println(this.name + " heals " + weakestAnimal.getName() + ". ");
            animals.remove(weakestAnimal);
            double percent = this.random.nextDouble(0.3, 1.0) * this.random.nextDouble();
            weakestAnimal.heal(percent);
        }
    }
}

