package franco.week07.ZooV1Package;


import java.util.ArrayList;
import java.util.List;

public class ZooV1 {
    private String name;
    private int establishedYear;

    private List<EnclosureV1> enclosureV1List;
    private List<FoodV1> foodV1List;


    public ZooV1(String name, int establishedYear) {

        this.name = name;
        this.establishedYear = establishedYear;
        enclosureV1List = new ArrayList<>();
        foodV1List = new ArrayList<>();

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
    //Get and set

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        if (establishedYear < 0) {
            System.out.println("Enter a positive year...");
        } else {
            this.establishedYear = establishedYear;
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

    public void addNewAnimalAndCheckIfExist(String encName, String name, String species,
                                            FoodV1 food, String foodNAme, double pricePerUnit, double amount){
        EnclosureV1 enc=addNewEnclosureAndCheckIfExist(encName);
        FoodV1 foodV1=addNewFoodAndCheckIfExist(foodNAme,pricePerUnit);
        AnimalV1 animalV1=enc.createNewAndCheckIfExist(name,species,food,amount);
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

}
