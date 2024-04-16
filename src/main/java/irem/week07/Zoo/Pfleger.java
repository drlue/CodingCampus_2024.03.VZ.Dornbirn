package irem.week07.Zoo;

import java.util.List;
import java.util.Vector;

public class Pfleger {
    private String name;
    private Vector<String> gehegeListe;

    public Pfleger(String name) {
        this.name = name;
        this.gehegeListe = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGehegeListe() {
        return gehegeListe;
    }

    public void addGehege(String gehege) {
        gehegeListe.add(gehege);
    }

    public boolean removeGehege(String gehege) {
        return gehegeListe.remove(gehege);
    }

    @Override
    public String toString() {
        return "Pfleger{" +
                "name='" + name + '\'' +
                ", gehegeListe=" + gehegeListe +
                '}';
    }
}
