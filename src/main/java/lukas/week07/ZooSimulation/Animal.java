package lukas.week07.ZooSimulation;

import java.util.HashMap;

public class Animal {

    private String name;
    private String species;

    private HashMap<Food, Double> foodList;

    //---constructor---
    public Animal(String name, String species, Food food, double amount) {
        this.name = name;
        this.species = species;
        foodList = new HashMap<>();
        foodList.put(food,amount);
    }

    //---get/set---
    public String getName() {
        return name;
    }

    public HashMap<Food, Double> getFoodList() {
        return foodList;
    }

    //---methods---

    public void addFood(Food food, double amount) {
        foodList.put(food, amount);
    }

    public void printNameAndSpecies() {
        System.out.println("|-- " + name + ", " + species);
    }

    public void getFoodStatByGyula(HashMap<Food, Double> foodStat) {
        for (Food f : foodList.keySet()) {
            if (foodStat.containsKey(f)){
                foodStat.put(f, foodStat.get(f) + foodList.get(f));
            } else {
                foodStat.put(f, foodList.get(f));
            }
        }
    }


}
