package christian.week06.zooEnglish;

import ardijanla.ConsoleColors;

import java.util.HashMap;
import java.util.Vector;

public class Enclousure {
    private String name;
    private boolean workFinished;
    private Vector<Animal> animalVector;


    public Enclousure(String name) {
        this.name = name;
        this.workFinished = false;
        animalVector = new Vector<>();
    }
    //==============================getter and setter================================

    public String getName() {
        return name;
    }

    public boolean getWorkFinished() {
        return workFinished;
    }

    public void switchWorkFinished() {
        if (!workFinished) {
            workFinished = true;
//            System.out.printf("workFinished = true\n");
        } else {
            workFinished = false;
//            System.out.printf("workFinished = false\n");
        }
    }

//=============================add/removeMethods=============================

    public void addAnimalToList(Animal ani) {
        if (!animalVector.contains(ani)) {
            animalVector.add(ani);
        }
    }

    public void removeAnimalFromList(Animal ani) {
        if (animalVector.contains(ani)) {
            animalVector.remove(ani);
        }
    }
    //==============================createMethods=======================================

    public void fillFoodHashmap(HashMap<Food, Float> foodHashmap) {
        for (Animal ani : animalVector) {
            Food foodKey = ani.getFood();
            if (foodHashmap.containsKey(foodKey)) {
                foodHashmap.put(foodKey, foodHashmap.get(foodKey) + ani.getAmountOfFood());
            } else {
                foodHashmap.put(foodKey, ani.getAmountOfFood());
            }
        }
    }

    //=============================print methods====================================

    public void printStructure() {
        System.out.printf("|---Enclousure: %s\n", name);
        if (!animalVector.isEmpty()) {
            for (Animal a : animalVector) {
                a.printStructure();

            }
        } else {
            System.out.printf("|---|--- Empty\n");
        }
    }

    //============================Simulation Methods============================
    public void animalActivitiesInEnc() {
        for (Animal ani : animalVector) {
            if (ani.isAlive()) {
                if (ani.startsFightOrNot()) {
                    int rndIndex = Main.rnd.nextInt(0, animalVector.size());
                    while (animalVector.get(rndIndex).getName().equals(ani.getName())) {
                        rndIndex = Main.rnd.nextInt(0, animalVector.size());
                    }
                    ani.bites(animalVector.get(rndIndex));
                    System.out.printf("%s%s%s bites %s%s%s\n", ConsoleColors.GREEN, ani.getName(), ConsoleColors.RESET, ConsoleColors.RED, animalVector.get(rndIndex).getName(), ConsoleColors.RESET);
                }
            }
        }
    }

    public void feedAllAnimals(Guardian gua) {
        if (!animalVector.isEmpty()) {
            for (Animal ani : animalVector) {
                if (!ani.getFed() && ani.isAlive()) {
                    ani.eatfood(gua);
                } else {
                    System.out.printf("%s%s%s recognized that %s%s%s is %sdead%s. He removes the carcass!\n", ConsoleColors.BLUE, gua.getName(), ConsoleColors.RESET, ConsoleColors.GREEN, ani.getName(), ConsoleColors.RESET, ConsoleColors.RED, ConsoleColors.RESET);
                    animalVector.remove(ani);
                }
            }
        }

    }

    public void watchRndAnimal(Guardian gua) {
        if (!animalVector.isEmpty()) {
            int rndIndex = Main.rnd.nextInt(0, animalVector.size());
            String verb = animalVector.get(rndIndex).getSpecies().equals(gua.getFavSpecies()) ? "observes" : "adores";
            System.out.printf("%s%s%s %s %s%s%s\n", ConsoleColors.BLUE, gua.getName(), ConsoleColors.RESET, verb, ConsoleColors.GREEN, animalVector.get(rndIndex).getName(), ConsoleColors.RESET);
        }
    }

    public Vector<Animal> reportInjuredAnimals(Guardian gua) {
        Vector<Animal> injuredAnimals = new Vector<>();
        if (!animalVector.isEmpty()) {
            for (Animal ani : animalVector) {
                float health = ani.getHealth();
                float maxHealth = ani.getMaxHealth();
                float percentage = (health / maxHealth) * 100;
                if (percentage < 99) {
                    System.out.printf("%s%s%s found that %s%s%s is injured. The animal has left %.2f of its maximum Health!\n", ConsoleColors.BLUE, gua.getName(), ConsoleColors.RESET, ConsoleColors.GREEN, ani.getName(), ConsoleColors.RESET, percentage);
                    injuredAnimals.add(ani);
                }

            }
        }
        return injuredAnimals;
    }

    public void resetDay() {
        for (Animal ani : animalVector) {
            ani.resetFed();
        }
        switchWorkFinished();
    }
}
