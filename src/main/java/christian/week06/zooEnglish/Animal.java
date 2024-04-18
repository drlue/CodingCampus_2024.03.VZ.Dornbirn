package christian.week06.zooEnglish;

public class Animal {
    private String name;
    private String species;
    private Food food;
    private float amountOfFood;
    private boolean fed;

    public Animal(String name, String species, Food food, float amountOfFood) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.amountOfFood = amountOfFood;
        this.fed = false;
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

    public boolean getFed() {
        return fed;
    }
    public void resetFed(){
        fed = false;
    }

    //==================printMethods====================
    public void printStructure() {
        System.out.printf("|---|---%s, %s\n", name, species);
    }

    //====================alterStates=======================
    public void eatfood (Guardian gua){
        System.out.printf("%s gets food from %s\n",name,gua.getName());
        fed = true;
    }
}
