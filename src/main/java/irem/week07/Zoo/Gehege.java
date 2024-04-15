package irem.week07.Zoo;

import java.util.Vector;

public class Gehege {

    private String name;
    private Vector<Tiere> tiereListe;

    public Gehege(String name) {
        this.name = name;
        this.tiereListe = new Vector<>();
    }

    public void addTiere(Tiere tiere) {
        tiereListe.add(tiere);

    }

    public void removeTiere(Tiere tiere) {
        tiereListe.remove(tiere);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("├── Gehege: " + name + "\n");
        if (tiereListe.isEmpty()) {
            sb.append("│   ├── (leer)\n");
        } else {
            for (Tiere tier : tiereListe) {
                sb.append("│   ├── " + tier.toString() + "\n");
            }
        }
        return sb.toString();
    }
}


