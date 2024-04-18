package christian.week06.zooEnglish;

import ardijanla.ConsoleColors;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class FinalZoo {
    private String name;
    private int foundingYear;
    private Vector<Enclousure> allEncVector;
    private Vector<Guardian> allGuardianVector;

    public FinalZoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.allEncVector = new Vector<>();
        this.allGuardianVector = new Vector<>();
    }

    //=================add/removeMethods=====================================================================================================
    public void addEnclousureToList(Enclousure enc) {
        if (!allEncVector.contains(enc)) {
            allEncVector.add(enc);
        }
    }

    public void removeEnclousureFromList(Enclousure enc) {
        if (allEncVector.contains(enc)) {
            allEncVector.remove(enc);
        }
    }

    //=============printMethods============================================================================================================
    public void printStructure() {
        System.out.printf("Zoo: %s, founded in %d\n", name, foundingYear);
        for (Enclousure enc : allEncVector) {
            enc.printStructure();
        }
    }

    public void printStatistics() {
        System.out.printf("-".repeat(23)+"%sStatistics%s"+"-".repeat(29)+"\n",ConsoleColors.GREEN,ConsoleColors.RESET);

        //======================FoodCost==========

        HashMap<Food,Float>foodHashmap = new HashMap<>();
        for (Enclousure enc : allEncVector) {
            enc.fillFoodHashmap(foodHashmap);
        }
        float totalCost = 0;
        for( Map.Entry<Food,Float> entry:foodHashmap.entrySet()){
            float amount = entry.getValue();
            float cost = entry.getValue()*entry.getKey().getPricePerUnit();
            String foodName = entry.getKey().getName();

            totalCost += totalCost + cost;
            System.out.printf("Food: %10s| Amount: %10.2f %s| Cost: %10.2f Euro\n",foodName,amount,entry.getKey().getPhysicalUnit(),cost);

        }
        System.out.printf("%sTotal Cost of Food/Day is:%s %30.2f Euro\n", ConsoleColors.GREEN,ConsoleColors.RESET,totalCost);

        //======================EndOfFoodCost======

        System.out.printf("-".repeat(21)+"%sEndOfStatistics%s"+"-".repeat(26)+"\n",ConsoleColors.GREEN,ConsoleColors.RESET);
    }
}
