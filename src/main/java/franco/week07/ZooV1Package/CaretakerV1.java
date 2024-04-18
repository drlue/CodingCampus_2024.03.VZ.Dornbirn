package franco.week07.ZooV1Package;

import java.util.ArrayList;
import java.util.List;

public class CaretakerV1 {
    private String name;
    private List<EnclosureV1> enclosureV1TaskList;

    public CaretakerV1(String name) {
        this.name = name;
        enclosureV1TaskList = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
