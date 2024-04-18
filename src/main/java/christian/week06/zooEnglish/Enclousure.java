package christian.week06.zooEnglish;

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
            System.out.printf("workFinished = true\n");
        } else {
            workFinished = false;
            System.out.printf("workFinished = false\n");
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
        if (animalVector.size() > 0) {
            for (Animal a : animalVector) {
                a.printStructure();

            }
        } else {
            System.out.printf("|---|--- Empty\n");
        }
    }

    //============================Simulation Methods============================
    public void feedAllAnimals(Guardian gua) {
        for (Animal ani : animalVector) {
            if (!ani.getFed()) {
                ani.eatfood(gua);
            }
        }
    }
    public void resetDay(){
        for (Animal ani : animalVector){
            ani.resetFed();
        }
        switchWorkFinished();
    }
}
