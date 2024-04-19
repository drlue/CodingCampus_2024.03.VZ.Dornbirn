package lukas.week07.ZooSimulation;

import ardijanla.ConsoleColors;

import java.util.HashMap;

public class Animal {

    private String name;
    private String species;
    private HashMap<Food, Double> foodMap;
    private boolean isFed;

    private int currentHealth;
    private int maxHealth;
    private int snapPower;
    private boolean isAggressive;

    //---constructor---
    public Animal(String name, String species, Food food, double amount) {
        this.name = name;
        this.species = species;
        foodMap = new HashMap<>();
        foodMap.put(food, amount);
        isFed = false;
        maxHealth = 100;
        currentHealth = maxHealth;
        this.snapPower = 60;
        isAggressive = true;
    }

    //---get/set---
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public boolean isAggressive() {
        return isAggressive;
    }

    public void setAggressive(boolean aggressive) {
        this.isAggressive = aggressive;
    }

    //---methods---

    public void addFood(Food food, double amount) {
        foodMap.put(food, amount);
    }

    public void getFoodStat(HashMap<Food, Double> foodStat) {
        for (Food f : foodMap.keySet()) {
            if (foodStat.containsKey(f)) {
                foodStat.put(f, foodStat.get(f) + foodMap.get(f));
            } else {
                foodStat.put(f, foodMap.get(f));
            }
        }
    }

    public void feed(Keeper keeper) {
        if (!isFed) {
            //System.out.println("|--" + getColoredName(ConsoleColors.RED) + " wird von " + keeper.getColoredName(ConsoleColors.GREEN) + " gefüttert.");
            isFed = true;
        }
    }

    public void reset() {
        isFed = false;
        isAggressive = true;
    }

    public String getColoredName(String color) {
        return color + species + " " + name + ConsoleColors.RESET;
    }

    public boolean canBite() {
        int ticksPerDay = 24;
        return (isAggressive() && getCurrentHealth() > 0 && Zoo.random.nextInt(100 * ticksPerDay) <= 40);
    }


    public void bites(Animal victim, int hour) {
        if (canBite()){
            victim.currentHealth += snapPower * (-1);
            setAggressive(false);

            //print
            System.out.printf("%d Uhr: %s (Biss = %d) %sbeisst%s %s (noch %d Health)%n",
                    hour,
                    getColoredName(ConsoleColors.RED),
                    snapPower,
                    ConsoleColors.PURPLE,
                    ConsoleColors.RESET,
                    victim.getColoredName(ConsoleColors.CYAN),
                    victim.getCurrentHealth());
            if (victim.currentHealth < 0) {
                System.out. printf("%s%sR I P %s!%s%n", ConsoleColors.BLACK, ConsoleColors.YELLOW_BACKGROUND, victim.name, ConsoleColors.RESET);
            }
        }
    }


    //---print
    public void printNameAndSpecies() {
        System.out.println("|-- " + name + ", " + species);
    }


}
