package aki.week08.zoo;

import java.util.Vector;

public class Zoo {
    private Vector<Enclosure> enclosures; //Eine Liste von Gehegen wird erstellt

    public Zoo() {
        this.enclosures = new Vector<>();
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

    //Struktur des Zoo's wird ausgegeben
    public void printZooStructure() {
        System.out.println("├── Zoo: Wild Park Bregenz, gehege ");
        for (Enclosure enclosure : enclosures) {
            enclosure.printStructure();
        }
    }
}