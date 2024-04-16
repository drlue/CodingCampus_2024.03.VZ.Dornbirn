package irem.week07.Zoo;

//import gyula.week07.zoo.Pfleger;

import java.util.Vector;

public class Gehege {

    private String name;
    private Vector<Tiere> tiereListe;
    private Vector<Pfleger> pflegerListe;

    public Gehege(String name) {
        this.name = name;
        this.tiereListe = new Vector<>();
        pflegerListe = new Vector<>();
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

        for(Pfleger pf : pflegerListe){
            sb.append("Pfleger: "+pf.getName()+"\n");
        }
        if (tiereListe.isEmpty()) {
            sb.append("│   ├── (leer)\n");
        } else {
            for (Tiere tier : tiereListe) {
                sb.append("│   ├── " + tier.toString() + "\n");
            }
        }
        return sb.toString();
    }

    public void addPfleger(Pfleger pfleger) {
        pflegerListe.add(pfleger);
    }

    public void removePfleger(Pfleger pfleger) {
        pflegerListe.remove(pfleger);
    }
    public void druckePflegerListe() {
        for (Pfleger pfleger : pflegerListe) {
            System.out.println(pfleger);
        }
    }
}

