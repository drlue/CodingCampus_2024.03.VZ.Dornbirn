package franco.week07.ZooV1Package;


import java.util.ArrayList;
import java.util.List;

public class EnclosureV1 {
   private String name;
   private List<AnimalV1>animalV1List;

    public EnclosureV1(String name){

        this.name=name;
        animalV1List=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAnimal(AnimalV1 animalV1) {
        if (animalV1 != null) {
            for (AnimalV1 ani : animalV1List)
                if (animalV1.equals(ani)) {
                    System.out.println("Animal already exists and not added");
                    break;
                }
            animalV1List.add(animalV1);
        } else {
            System.out.println("Animal is null!");
        }
    }
    public AnimalV1 createNewAndCheckIfExist(String name, String species, FoodV1 f, double amount){
        for (AnimalV1 ani: animalV1List) {
            if (ani.getName().equals(name)){
                ani.addFood(f, amount);
                return ani;
            }
        }
        AnimalV1 ani = new AnimalV1(name, species, f, amount);
        animalV1List.add(ani);
        return ani;
    }

    public void printStructure() {
        System.out.println("├── Enclosure: " + name);
        if (animalV1List.isEmpty()) {
            System.out.println("│       ├── (Empty)");
        } else {
            for (AnimalV1 ani : animalV1List) {
                System.out.print("│       ");
                ani.printNameAndSpecies();
            }
        }
    }


}
