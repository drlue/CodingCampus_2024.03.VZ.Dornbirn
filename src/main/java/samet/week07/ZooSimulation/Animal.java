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
    private int damage;

    enum Status {
        Dead, Alive
    }

    private Status status;


    public Animal(String name, String species, Food food, float requiredFood, int hp, int maxHp, int damage) {

        this.name = name;
        this.species = species;
        this.food = food;
        this.requiredFood = requiredFood;
        this.feeded = false;
        this.health = hp;
        this.maxHealth = maxHp;
        this.damage = damage;
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

    public void setStatus(Status status) {
        this.status = status;
    }

   public boolean isAlive() {
        if (this.health <= 0 || this.status == Status.Dead) {
            return false;
        } else {
            return true;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void addDamage(int damage){
        this.health -= damage;
        if (this.health <= 0){
            this.health = 0;
            this.status = Status.Dead;
        }
    }

    public void heal(double percent) {
        int restoredHp = ((int) (this.maxHealth * percent));
        this.health = this.health + restoredHp;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
        System.out.println(this.name + "´s new health is " + this.health + " HP.");
    }

    public int getHealth() {
        return health;
    }


    public void bite(Animal neighbor){
        neighbor.addDamage(this.damage);

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


