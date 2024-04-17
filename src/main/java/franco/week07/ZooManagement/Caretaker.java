package franco.week07.ZooManagement;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private String name;
    private List<Enclosure> enclosureList;

    public Caretaker(String name){
        this.name=name;
        this.enclosureList = new ArrayList<>();
    }
    public void addTask(Enclosure enc){
        if(!enclosureList.contains(enc)){
            enclosureList.add(enc);
        }
    }
    public String getName(){return name;}
    public boolean isResponsible(Enclosure enc){return enclosureList.contains(enc);}
    public void printStructure() {
        System.out.printf("|   |-- Pfleger: %s", name);
        for (int i = 0; i < enclosureList.size(); i++) {
            if (i == 0){
                System.out.printf(" (Zustaendig fuer: ");
            } else {
                System.out.printf(", ");
            }
            System.out.print(enclosureList.get(i).getName());
            if (i == enclosureList.size() - 1){
                System.out.print(")");
            }
        }
        System.out.println();
    }
}
