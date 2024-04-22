package samet.week07.ZooSimulation;

import java.util.Map;
import java.util.Random;

public class Animal {

    private String name;
    private String species;
    private Food food;
    private float requiredFood;
    private boolean feeded;
    private int hp;
    private int maxHp;
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
        this.hp = hp;
        this.maxHp = maxHp;
        this.bite = bite;
        this.status = status;

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

    public Status getStatus(){
        return status;
    }
    public int setHp(int hp){
        this.hp = hp;
        return hp;
    }
    public void setStatus(Status status){
        this.status=status;
   }


    public void dead() {
        if (status == Status.Alive && this.hp <= 0) {
            status = Status.Dead;
        }
    }

    public boolean alive() {
        if (status == Status.Alive) {
           return true;
        } else {
            return false;
        }}

    public int getMaxHp() {
        return maxHp;
    }

    public void bite(Animal target){
        if (this.status == Status.Dead){
            System.out.println(this.name + " is dead and can not bite!!");
        }
        if (target.getStatus() == Status.Alive){
            Random random = new Random();
            double chance = random.nextDouble();
            if (chance <= 0.4){
                System.out.println(this.name + " bite" + target.getName() + ".");
               int bitedamage = random.nextInt(21);
                target.setHp(target.getMaxHp() - bitedamage);
                System.out.println("Health of" + target.getName() + " reduced " +bitedamage + "to" + target.getMaxHp());
            }else {
                System.out.println(this.name + "tried" + target.getName() + " to bite");
            }
        }
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


