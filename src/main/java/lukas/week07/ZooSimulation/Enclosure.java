package lukas.week07.ZooSimulation;

import java.util.HashMap;
import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector<Animal> animals;

    //---constructor---
    public Enclosure(String name) {
        this.name = name;
        animals = new Vector<>();
    }

    //---get/set---
    public String getName() {
        return name;
    }

    public Vector<Animal> getAnimals() {
        return animals;
    }

    //---methods---
    public Animal searchAndCreateAnimal(String name, String species, Food f, double amount){
        for (Animal ani: animals) {
            if (ani.getName().equals(name)){
                ani.addFood(f, amount);
                return ani;
            }
        }
        Animal ani = new Animal(name, species, f, amount);
        animals.add(ani);
        return ani;
    }

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
    public void printStructure() {
        System.out.println("|-- Gehege: " + name);
        if (animals.isEmpty()) {
            System.out.println("|       |-- (leer)");
        } else {
            for (Animal a : animals) {
                System.out.print("|       ");
                a.printNameAndSpecies();
            }
        }
    }

    public void getFoodStatByGyula(HashMap<Food, Double> foodStat) {
        for (Animal ani:  animals) {
            ani.getFoodStatByGyula(foodStat);
        }
    }




    public HashMap<Food, Double> getFoodStat() {
        // TODO: 2024.04.14 Clean up old food stats
        HashMap<Food, Double> foodOverview = new HashMap<>();
                for (Animal animal : getAnimals()) {
                    for (Food food : animal.getFoodList().keySet()) {
                        if (foodOverview.get(food) != null) {
                            Double oldValue = foodOverview.get(food);
                            foodOverview.put(food, oldValue + animal.getFoodList().get(food));
                        } else {
                            foodOverview.put(food, animal.getFoodList().get(food));
                        }
                    }
                }
        return foodOverview;
    }
}
