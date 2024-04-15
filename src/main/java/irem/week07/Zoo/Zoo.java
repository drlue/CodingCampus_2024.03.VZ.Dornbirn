package irem.week07.Zoo;


import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private int gruendungsjahr;
    private List<Gehege> gehegeListe;

    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeListe = new ArrayList<>();

    }

    public void addGehege(Gehege gehege) {
        gehegeListe.add(gehege);
    }

    public void removeGehege(Gehege gehege) {
        gehegeListe.remove(gehege);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("├── Zoo: " + name + ", gegründet " + gruendungsjahr + "\n");
        for (Gehege g : gehegeListe) {
            sb.append(g.toString());
        }
        return sb.toString();
    }

    public void printZooStructure() {
        System.out.println("├── Zoo: " + name + ", gegründet " + gruendungsjahr);
        for (Gehege gehege : gehegeListe) {
            System.out.println("│   ├── " + gehege);
        }
    }

}


