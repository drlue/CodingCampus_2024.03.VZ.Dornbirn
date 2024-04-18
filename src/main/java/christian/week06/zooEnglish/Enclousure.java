package christian.week06.zooEnglish;

import java.util.HashMap;
import java.util.Vector;

public class Enclousure {
    private String name;
    private Vector<Animal> animalVector;


    public Enclousure(String name){
        this.name = name;
        animalVector = new Vector<>();
    }
    //==============================getter and setter================================

    //=============================add/removeMethods=============================

    public void addAnimalToList(Animal ani){
        if(!animalVector.contains(ani)){
            animalVector.add(ani);
        }
    }
    public void removeAnimalFromList(Animal ani){
        if(animalVector.contains(ani)){
            animalVector.remove(ani);
        }
    }
    //==============================createMethods=======================================

    public void fillFoodHashmap(HashMap<Food,Float> foodHashmap){
        for(Animal ani : animalVector){
            Food foodKey = ani.getFood();
            if (foodHashmap.containsKey(foodKey)){
                foodHashmap.put(foodKey,foodHashmap.get(foodKey)+ani.getAmountOfFood());
            } else {
                foodHashmap.put(foodKey,ani.getAmountOfFood());
            }
        }
    }

    //=============================print methods====================================

    public void printStructure(){
        System.out.printf("|---Enclousure: %s\n",name);
        if(animalVector.size()>0){
            for (Animal a:animalVector){
                a.printStructure();

            }
        } else {
            System.out.printf("|---|--- Empty\n");
        }

    }
}
