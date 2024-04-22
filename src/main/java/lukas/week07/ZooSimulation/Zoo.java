package lukas.week07.ZooSimulation;

import java.sql.SQLOutput;
import java.time.Year;
import java.util.HashMap;
import java.util.Vector;

public class Zoo {

    private String name;
    private Year foundingYear;
    private Vector<Enclosure> enclosures;
    private Vector<Food> foods;

    //---constructor---
    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = Year.of(foundingYear);
        enclosures = new Vector<>();
        foods = new Vector<>();
    }

    public Enclosure searchAndCreateEnclosure(String name){
        for (Enclosure enc: enclosures) {
            if (enc.getName().equals(name)){
                return enc;
            }
        }
        Enclosure enc = new Enclosure(name);
        enclosures.add(enc);
        return enc;
    }

    public Food searchAndCreateFood(String foodName, Food.Unit unit, double prise){
        for (Food f: foods){
            if (f.getName().equals(foodName)){
                return  f;
            }
        }
        Food food = new Food(foodName, unit, prise);
        foods.add(food);
        return food;
    }

    public Animal searchAndCreateAnimal(String enclosureName, String name, String species, String foodName, Food.Unit unit, double prise, double amount){
        Enclosure enc = searchAndCreateEnclosure(enclosureName);
        Food f = searchAndCreateFood(foodName, unit, prise);
        Animal ani = enc.searchAndCreateAnimal(name, species, f, amount);

        return ani;
    }


    //---methods---
    public void addEnclosure(Enclosure enclosure) {
        if (enclosure != null) {
            for (Enclosure enc : enclosures) {
                if (enclosure.equals(enc)) {
                    System.out.println("Enclosure already exists and not added");
                    break;
                }
            }
            enclosures.add(enclosure);
        } else {
            System.out.println("Enclosure is null!");
        }
    }


    public void printStructure() {
        System.out.println("|-- Zoo: " + name + ", gegründet " + foundingYear.toString());
        if (enclosures.isEmpty()) {
            System.out.println("|   |-- (leer)");
        } else {
            for (Enclosure e : enclosures) {
                System.out.print("|   ");
                e.printStructure();
            }
        }
    }

    private HashMap<Food, Double> getFoodStat() {
        HashMap<Food, Double> foodOverview = new HashMap<>();
        if (!enclosures.isEmpty()) {
            for (Enclosure encl : enclosures) {
                for (Food food : encl.getFoodStat().keySet()) {
                    if (foodOverview.get(food) != null) {
                        Double oldValue = foodOverview.get(food);
                        foodOverview.put(food, oldValue + encl.getFoodStat().get(food));
                    } else {
                        foodOverview.put(food, encl.getFoodStat().get(food));
                    }
                }
            }
        }
        return foodOverview;
    }

    private void getFoodStatByGyula(HashMap<Food, Double> foodStat) {
        for (Enclosure enc: enclosures) {
            enc.getFoodStatByGyula(foodStat);
        }
    }

    public void printFoodStatByGyula() {
        HashMap<Food, Double> foodStat = new HashMap<>();
        getFoodStatByGyula(foodStat);
        double total = 0;
        System.out.println();
        System.out.println("Täglicher Futterbedarf '" + name + "'");
        for (Food food : foodStat.keySet()){
            double amount = foodStat.get(food);
            total += amount*food.getPricePerUnit();
            System.out.printf("%-10s %10.2f %-10s a %7.2f Eur %10.2f Eur \n", food.getName()+":", amount, food.getUnit(), food.getPricePerUnit(), amount*food.getPricePerUnit());

        }
        System.out.println("-".repeat(62));
        System.out.printf("%-46s %10.2f Eur", "TOTAL", total);

    }


    public void printFoodStat() {
        double total = 0;
        System.out.println();
        System.out.println("Täglicher Futterbedarf '" + name + "'");
        for (Food food : getFoodStat().keySet()){

            double amount = getFoodStat().get(food);
            total += amount*food.getPricePerUnit();
            System.out.printf("%-10s %10.2f %-10s a %7.2f Eur %10.2f Eur \n", food.getName()+":", amount, food.getUnit(), food.getPricePerUnit(), amount*food.getPricePerUnit());

        }
        System.out.println("-".repeat(62));
        System.out.printf("%-46s %10.2f Eur", "TOTAL", total);

    }

}
