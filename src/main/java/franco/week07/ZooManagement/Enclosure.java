package franco.week07.ZooManagement;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Enclosure {

    private String name;

    private List<Animal> animalList;

    public Enclosure(String name) {
        this.name = name;
        this.animalList = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void getFoodStatV1(HashMap< Food,Double> foodStat) {
//        for (Animal ani : animalList) {
//            ani.getFoodStats(foodStat);
//        }
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("├── Enclosure: " + name + "\n");
        if (animalList.isEmpty()) {
            sb.append("│   ├── (Empty)\n");
        } else {
            for (Animal animal : animalList) {
                sb.append("│   ├── " + animal.toString() + "\n");
            }
        }
        return sb.toString();
    }
}
