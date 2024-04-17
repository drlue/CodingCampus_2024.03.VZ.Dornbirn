package demian.week08.Zoo;

import ardijanla.ConsoleColors;

import java.sql.SQLOutput;
import java.util.Vector;

public class Zoo {

    private String name;
    private int gruendungsjahr;
    private Vector<Gehege> gehegeliste;
    private Vector<zookeeper> pflegerliste;

    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        gehegeliste = new Vector<>();
        pflegerliste = new Vector<>();
    }

    // ================== SETTER / GETTER ==================

    public void addPfleger(zookeeper pfleger){

        pflegerliste.add(pfleger);
    }

    public void addGehege(Gehege gehege) {
        if (gehege == null) {
            System.out.println("Bitte Name des Geheges einfügen welches hinzugefügt werden soll");
        } else {
            gehegeliste.add(gehege);
        }
    }

    public void deleteGehege(Gehege gehege) {
        this.gehegeliste.remove(gehege);
    }

    public Vector<Gehege> getGehegeliste() {
        return gehegeliste;
    }

    // ================= FUNKTIONEN ============================
    public void printZooStruktur (){
        System.out.printf("|-- %sZoo: " + name + ", gegründet " + gruendungsjahr + "%s\n", ConsoleColors.GREEN_BOLD, ConsoleColors.RESET);
        System.out.print("|-- Pfleger: ");
        for (zookeeper element : pflegerliste){
            System.out.printf(element.getName() + ",");
        }
        System.out.println();
        for (Gehege element : gehegeliste){
            System.out.println("|   |-- " + element.toString());
        }
    }

    public void printPflegerliste (){

    }



}
