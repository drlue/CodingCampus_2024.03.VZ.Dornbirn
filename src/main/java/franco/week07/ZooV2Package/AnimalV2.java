package franco.week07.ZooV2Package;

import ardijanla.ConsoleColors;

import java.util.HashMap;

public class AnimalV2 {
    private String name;
    private String species;
    private int health;
    private int maxHealth;
    private int  attack;


    private HashMap<FoodV2, Double> foodV2DoubleHashMap;


    public AnimalV2(String name, String species) {
        this.name = name;
        this.species = species;
        foodV2DoubleHashMap=new HashMap<>();

    }

    //>>>>>>>>>>>>>>>>>>>>>>PRINT METHODS<<<<<<<<<<<<<<<<<<<
    public void printStructure() {
        System.out.println("│        ├── " + ConsoleColors.BLUE_BOLD + name + species + ConsoleColors.RESET);
    }
    public void addFood(FoodV2 food,double amount){
        foodV2DoubleHashMap.put(food,amount);
    }
}
