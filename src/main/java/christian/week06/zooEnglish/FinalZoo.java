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
    private Vector<Vetenary> allVetenary;

    public FinalZoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.allEncVector = new Vector<>();
        this.allGuardianVector = new Vector<>();
        this.allVetenary = new Vector<>();
    }

    //====================================================================================================================================================add/removeMethods====================================
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

    public void addGuardianToList(Guardian guardian) {
        if (!allGuardianVector.contains(guardian)) {
            allGuardianVector.add(guardian);
        }
    }

    public void addVetenaryToList(Vetenary vetenary) {
        if (!allVetenary.contains(vetenary)) {
            allVetenary.add(vetenary);
        }
    }

    //======================================================================================================================================================printMethods=======================================================
    public void printStructure() {
        System.out.printf("Zoo: %s, founded in %d\n", name, foundingYear);
        for (Enclousure enc : allEncVector) {
            enc.printStructure();
        }
    }

    public void printStatistics() {
        System.out.printf("-".repeat(23) + "%sStatistics%s" + "-".repeat(29) + "\n", ConsoleColors.GREEN, ConsoleColors.RESET);

        //======================FoodCost==========

        HashMap<Food, Float> foodHashmap = new HashMap<>();
        for (Enclousure enc : allEncVector) {
            enc.fillFoodHashmap(foodHashmap);
        }
        float totalCost = 0;
        for (Map.Entry<Food, Float> entry : foodHashmap.entrySet()) {
            float amount = entry.getValue();
            float cost = entry.getValue() * entry.getKey().getPricePerUnit();
            String foodName = entry.getKey().getName();

            totalCost += totalCost + cost;
            System.out.printf("Food: %10s| Amount: %10.2f %s| Cost: %10.2f Euro\n", foodName, amount, entry.getKey().getPhysicalUnit(), cost);

        }
        System.out.printf("%sTotal Cost of Food/Day is:%s %30.2f Euro\n", ConsoleColors.GREEN, ConsoleColors.RESET, totalCost);

        //======================EndOfFoodCost======

        System.out.printf("-".repeat(21) + "%sEndOfStatistics%s" + "-".repeat(26) + "\n", ConsoleColors.GREEN, ConsoleColors.RESET);
    }

    //==================================================================================================================================================create and get methods==============================
    public Vector<Guardian> createCopyAllGua() {
        Vector<Guardian> copy = new Vector<>(allGuardianVector);
        return copy;
    }

    public Vector<Enclousure> createCopyAllEnc() {
        Vector<Enclousure> copy = new Vector<>(allEncVector);
        return copy;
    }

    public Guardian removeRndGuardian(Vector<Guardian> guaV) {
        Guardian gua = guaV.remove(Main.rnd.nextInt(0, guaV.size()));
        return gua;
    }

    public Vector<Enclousure> getRemainingWork() {
        Vector<Enclousure> remainingEnc = createCopyAllEnc();
        return remainingEnc;
    }

    //==============================================================================================================================================================Simulation=========================================================
    public void animalActivities() {
        for (Enclousure enc : allEncVector) {
            enc.animalActivitiesInEnc();
        }
    }

    public void workHour(int hour, Vector<Enclousure> remainingEnc) {
        Vector<Guardian> copyGua = createCopyAllGua();
        Vector<Animal> injuredAnimals = new Vector<>();

        while (!copyGua.isEmpty()) {
            Guardian guardian = removeRndGuardian(copyGua);
            injuredAnimals.addAll(guardian.startWork(hour, remainingEnc));
        }

        if ( injuredAnimals.size()>0 ) {
            for (Vetenary vet : allVetenary) {
                vet.healAnimal(vet.getMostInjuredAnimal(injuredAnimals));
            }
        }

    }

    public void resetDay() {
        for (Enclousure enc : allEncVector) {
            enc.resetDay();
        }
        for (Guardian gua : allGuardianVector) {
            gua.setWorkingEncNull();
        }
    }
}
