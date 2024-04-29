package franco.week07.ZooV1Package;

import java.util.HashMap;
import java.util.List;

public class AnimalV1 {

    private String name;

    private String species;

    private HashMap<FoodV1, Double> foodV1DoubleHashMap;

    private double maxHealth;
    private double bite;
    private Status status;

    private enum Status {
        ALIVE,
        DEAD
    }


    public AnimalV1(String name, String species, FoodV1 foodV1, double amount) {
        this.name = name;
        this.species = species;
        foodV1DoubleHashMap = new HashMap<>();
        foodV1DoubleHashMap.put(foodV1, amount);
        this.maxHealth = maxHealth;
        this.bite = bite;

    }

    //gettter and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }
    //Method
    public boolean isAlive() {

        if (status == Status.ALIVE) {
            return true;
        } else {
            return false;
        }
    }
    public void IsDead() {
        if (status == Status.ALIVE && this.maxHealth <= 0) {
            status = Status.DEAD;
        }
    }

    public void printNameAndSpecies() {
        System.out.println("├── " + name + ", " + species);
    }

    public void addFood(FoodV1 foodv1, double amount) {
        foodV1DoubleHashMap.put(foodv1, amount);
    }
}
