package gyula.week07.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int established;
    private Vector<Enclosure> enclosureList;

    public Zoo(String name, int established){
        this.name = name;
        this.established = established;
        enclosureList = new Vector<>();
    }

    public void addEnclosure(Enclosure enc){
        if (!enclosureList.contains(enc)){
            enclosureList.add(enc);
        } else {
            System.out.printf("Zoo %s hat die Gehege %s schon drin...%n", name, enc.getName());
        }
    }

    public void printStructure(){
        System.out.printf("|-- Zoo: %s, gegrundet %d%n", name, established);
        for (Enclosure enc : enclosureList){
            enc.printStructure();
        }
    }
}
