package irem.week07.Zoo;


import java.util.Vector;

public class Zoo {

    private String name;
    private int gruendungsjahr;
    private Vector<Gehege> gehegeListe;


    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        gehegeListe = new Vector<>();

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
}

//    public void printZooStructure() {
//        System.out.println("├── Zoo: " + name + ", gegründet " + gruendungsjahr);
//        for (Gehege gehege : gehegeListe) {
//            System.out.println("│   ├── " + gehege);
//        }
//    }
//    }
//




