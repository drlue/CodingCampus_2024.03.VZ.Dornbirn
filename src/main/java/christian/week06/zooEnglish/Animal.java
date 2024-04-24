package christian.week06.zooEnglish;

import ardijanla.ConsoleColors;

public class Animal {
    private String name;
    private String species;
    private Food food;
    private float amountOfFood;
    private boolean fed;
    private boolean alive;
    private float health;
    private float maxHealth;
    private float bite;

    public Animal(String name, String species, Food food, float amountOfFood, float maxHealth, float bite) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.amountOfFood = amountOfFood;
        this.fed = false;
        this.alive = true;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.bite = bite;

    }
    //==========================================================================================================================getter and setter=======================

    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }

    public float getAmountOfFood() {
        return amountOfFood;
    }

    public boolean getFed() {
        return fed;
    }

    public void resetFed() {
        fed = false;
    }

    public String getSpecies() {
        return species;
    }

    public float getHealth() {
        return health;
    }

    public float getMaxHealth() {
        return maxHealth;
    }

    public boolean isAlive() {
        return alive;
    }

    //============================================================================================================================printMethods====================
    public void printStructure() {
        System.out.printf("|---|---%s, %s\n", name, species);
    }

    //===========================================================================================================================alterStates=======================
    public void eatfood(Guardian gua) {
        System.out.printf("%s%s%s gets food for %s%s%s\n", ConsoleColors.BLUE, gua.getName(), ConsoleColors.RESET, ConsoleColors.GREEN,name , ConsoleColors.RESET);
        fed = true;
    }

    public void getbitten(float bite) {
        changeHealth(bite * -1);
    }

    public void changeHealth(float change) {
        this.health += change;
        if (health <= 0) {
            die();
        } else if (health > maxHealth) {
            health = maxHealth;
        }
    }
    public void die(){
        alive = false;
        System.out.printf("%s%s%s%s dies!%s\n",ConsoleColors.GREEN,name,ConsoleColors.RESET,ConsoleColors.RED, ConsoleColors.RESET);
    }

    //==============================================================================================================================Simulation=====================
    public boolean startsFightOrNot() {
        return Main.rnd.nextInt(0, 101) <= 40;
    }

    public void bites(Animal victim) {
        if(victim.isAlive()){
            victim.getbitten(this.bite);
        }

    }
}
