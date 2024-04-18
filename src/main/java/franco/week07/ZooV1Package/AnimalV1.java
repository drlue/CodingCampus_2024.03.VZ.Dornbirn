package franco.week07.ZooV1Package;

import lukas.week07.ZooSimulation.Food;

import java.util.HashMap;
import java.util.List;

public class AnimalV1 {

    private String name;
    private String species;

    private HashMap<FoodV1, Double> foodV1DoubleHashMap;

    public AnimalV1(String name, String species, FoodV1 foodV1, double amount) {
        this.name = name;
        this.species = species;
        foodV1DoubleHashMap = new HashMap<>();
        foodV1DoubleHashMap.put(foodV1, amount);

    }
    //gettter and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //Method

    public void printNameAndSpecies() {
        System.out.println("|-- " + name + ", " + species);
    }

    public void addFood(FoodV1 foodv1, double amount) {
        foodV1DoubleHashMap.put(foodv1, amount);
    }
}
