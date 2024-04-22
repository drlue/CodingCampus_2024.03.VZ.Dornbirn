package aki.week08.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Enclosure> enclosures; //Eine Liste von Gehegen wird erstellt
    private Vector<Guardian> guardianList;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new Vector<>();
        guardianList = new Vector<>();
    }

    //Sucht Gehege. Wenn es keines gibt, dann wird eines erstellt.
    public Enclosure searchAndCreateEnclosure(String enclosureName) {
        for (Enclosure enc : enclosures) {
            if (enc.getName().equals(enclosureName)) {
                return enc;
            }
        }
        Enclosure enc = new Enclosure(enclosureName);
        enclosures.add(enc);
        return enc;
    }


    public void addGuardianAndTask(Guardian gua,Enclosure enc){
        gua.addTask(enc);
        if (!guardianList.contains(gua)){
            guardianList.add(gua);
        }
    }


    //Struktur des Zoo's wird ausgegeben
    public void printZooStructure() {
        System.out.println("├── Zoo: Wild Park Bregenz, gehege ");
        for (Guardian gua : guardianList) {
            gua.printStructure();
        }
        for (Enclosure enc : enclosures) {
            Vector<Guardian> workersOfEnclosure = new Vector<>();
            for (Guardian gua : guardianList) {
                if (gua.isResponsibleFor(enc)) {
                    workersOfEnclosure.add(gua);
                }
            }
            enc.printStructure(workersOfEnclosure);
        }
    }
}
