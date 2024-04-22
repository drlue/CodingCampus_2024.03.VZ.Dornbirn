package franco.week07.ZooV1Package;

import ardijanla.ConsoleColors;

import java.util.ArrayList;
import java.util.List;

public class CaretakerV1 {
    private String name;
    private List<EnclosureV1> enclosureV1TaskList;
    private String favouriteAnimal;

    public CaretakerV1(String name) {
        this.name = name;
        enclosureV1TaskList = new ArrayList<>();


    }
    public String getFavouriteAnimal() {
        return favouriteAnimal;
    }

    public void setFavouriteAnimal(String favouriteAnimal) {
        this.favouriteAnimal = favouriteAnimal;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void addTask(EnclosureV1 enclosureV1){
        if(!enclosureV1TaskList.contains(enclosureV1)){
            enclosureV1TaskList.add(enclosureV1);
        }
    }
    public void simulatedDay(){
        System.out.printf("%s%s%s start working...%n", ConsoleColors.BLUE, name, ConsoleColors.RESET);
        for (EnclosureV1 enclosure : enclosureV1TaskList){
            enclosure.doClean(this);
            enclosure.checkOnRandomAnimal(this);
        }
    }

    public void printStructure() {
        System.out.printf("|   |-- Caretaker: %s", name);
        for (int i = 0; i < enclosureV1TaskList.size(); i++) {
            if (i == 0) {
                System.out.print(" (Responsible for: ");
            } else {
                System.out.print(", ");
            }
            System.out.print(enclosureV1TaskList.get(i).getName());
            if (i == enclosureV1TaskList.size() - 1) {
                System.out.print(")");
            }
        }
        System.out.println();
    }


}
