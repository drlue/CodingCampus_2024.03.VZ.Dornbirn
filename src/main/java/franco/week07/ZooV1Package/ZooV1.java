package franco.week07.ZooV1Package;


import samet.week07.ZooSimulation.Keeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZooV1 {
    public static Random random = new Random();
    private String name;
    private int establishedYear;

    private List<EnclosureV1> enclosureV1List;
    private List<FoodV1> foodV1List;
    private List<CaretakerV1>caretakerV1List;


    public ZooV1(String name, int establishedYear) {

        this.name = name;
        this.establishedYear = establishedYear;
        enclosureV1List = new ArrayList<>();
        foodV1List = new ArrayList<>();
        caretakerV1List=new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Please enter a valid name...");
        } else {
            this.name = name;
        }
    }
    public EnclosureV1 addNewEnclosureAndCheckIfExist(String name) {
        for (EnclosureV1 enc : enclosureV1List) {
            if (enc.getName().equals(name)) {
                return enc;
            }
        }
        EnclosureV1 enc = new EnclosureV1(name);
        enclosureV1List.add(enc);
        return enc;
    }
    public FoodV1 addNewFoodAndCheckIfExist(String foodName, double pricePerUnit){
        for (FoodV1 f: foodV1List){
            if (f.getName().equals(foodName)){
                return  f;
            }
        }
        FoodV1 food = new FoodV1(foodName,  pricePerUnit);
        foodV1List.add(food);
        return food;
    }
    public void addCarerAndTask(CaretakerV1 carer,EnclosureV1 enclosureV1){
        carer.addTask(enclosureV1);
        if(!caretakerV1List.contains(carer)){
            caretakerV1List.add(carer);
        }
    }

    public void addNewAnimalAndCheckIfExist(String encName, String name, String species,
                                            FoodV1 food ,String foodNAme, double pricePerUnit, double amount) {
        EnclosureV1 enc = addNewEnclosureAndCheckIfExist(encName);
        FoodV1 foodV1 = addNewFoodAndCheckIfExist(foodNAme, pricePerUnit);
        AnimalV1 animalV1 = enc.createNewAndCheckIfExist(name, species, food, amount);
    }

    public void printStructure() {
        System.out.printf("├──Zoo: %s , founded in %d\n", name, establishedYear);

        if (enclosureV1List.isEmpty()) {
            System.out.println("│       ├── (Empty)");
        } else {
            for (EnclosureV1 enc : enclosureV1List) {
                System.out.print("│   ");
                enc.printStructure();
            }
        }
    }
    public void simulation(int day){
        System.out.printf("Day %d beginn at 07:00 Morning%n", day);
        for (CaretakerV1 carer : caretakerV1List) {
            carer.simulatedDay();
        }
    }

}
