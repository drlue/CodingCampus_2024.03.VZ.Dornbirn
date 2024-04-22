package samet.week07.ZooSimulation;

import java.util.Map;

public class Animal {

    private String name;
    private String species;
    private Food food;
    private float requiredFood;
    private boolean feeded;
    private int health;
    private int maxHealth;
    private int bite;

    enum Status {
        Dead, Alive
    }

    private Status status;


    public Animal(String name, String species, Food food, float requiredFood, int hp, int maxHp, int bite) {

        this.name = name;
        this.species = species;
        this.food = food;
        this.requiredFood = requiredFood;
        this.feeded = false;
        this.health = hp;
        this.maxHealth = maxHp;
        this.bite = bite;
        this.status = Status.Alive;

    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public Food getFood() {
        return food;
    }

    public Status getStatus() {
        return status;
    }

    public int setHp(int hp) {
        this.health = hp;
        return hp;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public void dead() {
        if (status == Status.Alive && this.health <= 0) {
            status = Status.Dead;
        }
    }

   public boolean alive() {
        if (status == Status.Alive) {
            return true;
        } else {
            return false;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }


    public void bite(Animal neighbor){

    }



    public void getFoodRequirements(Map<Food, Float> neededFood) {
        if (neededFood.containsKey(food)) {
            neededFood.put(food, neededFood.get(food) + requiredFood);
        } else {
            neededFood.put(food, requiredFood);
        }
    }

    public void printZooStructure() {
        System.out.printf("|       |-- %s, %s%n", name, species);
    }

}


