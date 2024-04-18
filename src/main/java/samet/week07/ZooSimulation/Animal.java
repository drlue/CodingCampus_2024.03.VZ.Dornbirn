package samet.week07.ZooSimulation;


import java.util.Map;

public class Animal {

    private String name;
    private String species;
    private Food food;
    private float requiredFood;
    private boolean feeded;
 //   private




    public Animal(String name, String species,Food food ,float requiredFood) {

        this.name = name;
        this.species = species;
        this.food = food;
        this.requiredFood = requiredFood;
        this.feeded = false;

    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
    public Food getFood(){
        return food;
    }

    public void getFoodRequirements(Map<Food,Float> neededFood){
        if (neededFood.containsKey(food)){
            neededFood.put(food , neededFood.get(food)+ requiredFood);
            }else {
            neededFood.put(food,requiredFood);
    }
}


    public void printZooStructure(){
        System.out.printf("|       |-- %s, %s%n", name, species);
    }




    }


