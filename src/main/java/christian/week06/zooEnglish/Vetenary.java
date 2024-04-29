package christian.week06.zooEnglish;

import java.util.Vector;

import static christian.week06.zooEnglish.Main.rnd;

public class Vetenary {
    String name;

    public Vetenary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void healAnimal(Animal animal) {
        if (animal != null) {
            float heal = rnd.nextFloat(animal.getMaxHealth() * 0.3f,animal.getMaxHealth()*0.5f);
            animal.changeHealth(heal);
            System.out.printf("%s heals %s for %.2f Healthpoints!%n", name,animal.getName(),heal);
        }
    }

    public Animal getMostInjuredAnimal(Vector<Animal> injuredAnimals) {
        Animal worstCase = injuredAnimals.remove(0);
        float percantage;
        for (Animal ani : injuredAnimals) {
            percantage = (ani.getHealth() / ani.getMaxHealth());
            if (percantage < worstCase.getHealth() / worstCase.getMaxHealth()) {
                worstCase = ani;
            }
        }
        return worstCase;
    }
}
