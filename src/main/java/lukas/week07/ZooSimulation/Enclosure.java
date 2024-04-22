package lukas.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.util.HashMap;
import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector<Animal> animals;
    private boolean isFinished;
    private int cleaningDuration;

    //---constructor---
    public Enclosure(String name) {
        this.name = name;
        animals = new Vector<>();
        isFinished = false;
        cleaningDuration = 0;
    }

    //---get/set---
    public String getName() {
        return name;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    //---methods---
    public void addAnimal(Animal animal) {
        if (animal != null) {
            for (Animal a : animals) {
                if (animal.equals(a)) {
                    System.out.println("Animal already exists and not added");
                    break;
                }
            }
            animals.add(animal);
        } else {
            System.out.println("Animal is null!");
        }
    }

    public Animal getRandomAnimal() {
        if (!animals.isEmpty()) {
            return animals.get(Zoo.random.nextInt(animals.size()));
        } else {
            return null;
        }
    }


    public void getFoodStat(HashMap<Food, Double> foodStat) {
        for (Animal ani : animals) {
            ani.getFoodStat(foodStat);
        }
    }

    public Animal getMaxInjuredAnimal() {
        float minHealthPercent = Float.MAX_VALUE;
        Animal maxInjuredAnimal = null;
        for(Animal ani : animals) {
            if ((float)(ani.getCurrentHealth())/ani.getMaxHealth()< minHealthPercent) {
                maxInjuredAnimal = ani;
            }
        }
        return maxInjuredAnimal;
    }

    public Vector<Animal> getInjuredAnimals() {
        Vector<Animal> injuredAnimals = new Vector<>();
        for(Animal ani : animals) {
            if (ani.getCurrentHealth()< ani.getMaxHealth() && ani.getCurrentHealth() > 0) {
                injuredAnimals.add(ani);
            }
        }
        return injuredAnimals;
    }

    public void workInEnclosure(Keeper keeper, int duration) {
        cleaningDuration = duration;
        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            if (a.getCurrentHealth() < 0) { //animal is death
                animals.remove(a);
                System.out.printf("%s%s|--%s wird von %s aus dem Gehege entfernt :-( %s%n",
                        ConsoleColors.BLACK,
                        ConsoleColors.WHITE_BACKGROUND,
                        a.getName(),
                        keeper.getName(),
                        ConsoleColors.RESET);
            } else {
                a.feed(keeper);
            }
        }
        isFinished = true;
    }

    public void reset() {
        isFinished = false;
        for (Animal a : animals) {
            a.reset();
        }
    }

    public String getColoredName(String color) {
        return color + name + ConsoleColors.RESET;
    }


    //----------------------------------SIMULATION 0.2
    public void activityInEnclosure(int hour) {
        for (Animal aggressor : animals) {
            Vector<Animal> victims = getListOfPossibleVictimsFor(aggressor);
            if (!victims.isEmpty()) {
                Animal victim = victims.get(Zoo.random.nextInt(victims.size()));
                aggressor.bites(victim, hour);
            }
        }
    }

    private Vector<Animal> getListOfPossibleVictimsFor(Animal aggressor) {
        Vector<Animal> possibleVictims = new Vector<>(animals);
        possibleVictims.remove(aggressor);
        for (int i = 0; i < possibleVictims.size(); i++) {
            if (possibleVictims.get(i).getCurrentHealth() < 0) {
                possibleVictims.remove(possibleVictims.get(i));
            }
        }
        return possibleVictims;
    }


    //---print
    public void printEnclosureStructure(Vector<Keeper> keepers) {
        System.out.print("|-- Gehege: " + name);
        System.out.print(" - Pfleger: ");

        int keeperCount = 0;
        for (Keeper k : keepers) {
            if (k.isResponsibleForEnclosure(this)) {
                System.out.print(keeperCount == 0 ? "" : ", ");
                k.printKeeper();
                keeperCount++;
            }
        }
        System.out.println();
        if (animals.isEmpty()) {
            System.out.println("|       |-- (leer)");
        } else {
            for (Animal a : animals) {
                System.out.print("|       ");
                a.printNameAndSpecies();
            }
        }
    }

    public void printAnimalList() {
        for (Animal a : animals) {
            System.out.printf("%s, ", a.getName());
        }
        System.out.println();
    }

}
