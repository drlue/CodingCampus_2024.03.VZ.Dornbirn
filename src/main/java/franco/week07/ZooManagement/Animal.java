package franco.week07.ZooManagement;

import java.util.HashMap;

public class Animal {
    private String name;
    private String species;
    private HashMap<Food, Double> foodDoubleHashMap;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        foodDoubleHashMap = new HashMap<>();
    }

    public void addFood(Food food, Double amount) {
        foodDoubleHashMap.put(food, amount);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " ," + species;
    }

    public void getFoodStats(HashMap<Food, Double> foodStat) {

        for (Food element : foodDoubleHashMap.keySet()) {
            if (foodStat.containsKey(element)) {
                foodStat.put(element, foodStat.get(element) + foodDoubleHashMap.get(element));
            } else {
                foodStat.put(element, foodDoubleHashMap.get(element));
            }
        }

    }
//    @Override
//
//    public String toString() {
//        StringBuilder sb = new StringBuilder("├── food: " + name + "\n");
//        if (foodList.isEmpty()) {
//            sb.append("│   ├── (Empty)\n");
//        } else {
//            for (Map.Entry<Food, Double> entry : foodList.entrySet()) {
//                Food food = entry.getKey();
//                Double amount = entry.getValue();
//                sb.append("│   ├── " + food.toString() + " " + amount + "\n");
//            }
//        }
//        return sb.toString();
//    }


}
