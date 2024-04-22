package franco.week07.ZooManagement;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zoo {
    private String name;
    private int foundingYear;
    private List<Enclosure> enclosureList;
    private List<Caretaker> caretakerList;

    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.enclosureList = new ArrayList<>();
        this.caretakerList = new ArrayList<>();

    }
    public String getName() {
        return name;
    }
    public void addCaretakerAndTask(Caretaker carer, Enclosure enc) {

        if (!caretakerList.contains(carer)) {
            caretakerList.add(carer);
        }

    }

    public void addEnclosure(Enclosure enclosure) {
        enclosureList.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
    }



    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Unvalid name, please retry...");
        }
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder("├──----Zoo: " + name + ", founded " + foundingYear + "\n");
        for (Enclosure e : enclosureList) {
            sb.append(e.toString());
        }
        return sb.toString();
    }
}

