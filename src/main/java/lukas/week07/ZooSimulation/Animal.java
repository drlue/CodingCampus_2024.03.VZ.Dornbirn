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
    private boolean isTreated;
    private boolean isInTreatmentAtMoment;

    //---constructor---
    public Animal(String name, String species, Food food, double amount, int maxHealth, int snapPower) {
        this.name = name;
        this.species = species;
        foodMap = new HashMap<>();
        foodMap.put(food, amount);
        isFed = false;
        this.maxHealth = maxHealth;
        currentHealth = maxHealth;
        this.snapPower = snapPower;
        isAggressive = true;
        isTreated = false;
        isInTreatmentAtMoment = false;
    }

    //---get/set---
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }


    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public boolean isAggressive() {
        return isAggressive;
    }

    public void setAggressive(boolean aggressive) {
        this.isAggressive = aggressive;
    }

    public boolean isTreated() {
        return isTreated;
    }

    public void setTreated(boolean treated) {
        isTreated = treated;

    }

    public void setInTreatmentAtMoment(boolean inTreatmentAtMoment) {
        isInTreatmentAtMoment = inTreatmentAtMoment;
        isTreated = true;
    }

    public boolean isInTreatmentAtMoment() {
        return isInTreatmentAtMoment;
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

    public float getRelativeHealth(){
        return currentHealth / (float)maxHealth;
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
        isTreated = false;
    }

    public String getColoredName(String color) {
        return color + species + " " + name + ConsoleColors.RESET;
    }
    public String getColoredName() {
        return getColoredName(ConsoleColors.RED);
    }

    public boolean canBite() {
        int ticksPerDay = 24;
        return (isAggressive() &&
                getCurrentHealth() > 0 &&
                !isInTreatmentAtMoment &&
                Zoo.random.nextInt(100 * ticksPerDay) <= 40);
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

    public void heal(Doctor doc, int hour){
        int newHealth = Math.min((int) (currentHealth * (Zoo.random.nextDouble(1.3,2.0))),maxHealth);
        //print
        if(newHealth != currentHealth) {
            isInTreatmentAtMoment = false; //treatment is over
            System.out.printf("%d Uhr: %s hat %s behandelt (Health %d --> %d)%n",
                    hour,
                    doc.getColoredName(),
                    getColoredName(),
                    currentHealth,
                    newHealth);
        }
        else{
            System.out.printf("%s hat keine Patienten %n",
                    doc.getColoredName());
        }
        //set
        currentHealth = newHealth;
    }


    //---print
    public void printNameAndSpecies() {
        System.out.println("|-- " + name + ", " + species);
    }


}
