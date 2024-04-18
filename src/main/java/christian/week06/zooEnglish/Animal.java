package christian.week06.zooEnglish;

public class Animal {
    private String name;
    private String species;
    private Food food;
    private float amountOfFood;

    public Animal(String name, String species, Food food, float amountOfFood) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.amountOfFood = amountOfFood;
    }
    //=======================getter and setter=======================


    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }

    public float getAmountOfFood() {
        return amountOfFood;
    }

    //==================printMethods====================
    public void printStructure() {
        System.out.printf("|---|---%s, %s\n", name, species);
    }
}
