package demian.week08.Zoo;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Zoo {

    private String name;
    private int gruendungsjahr;
    private Vector<Gehege> gehegeliste;
    private Vector<zookeeper> zookeeperList;

    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        gehegeliste = new Vector<>();
        zookeeperList = new Vector<>();
    }

    // ================== SETTER / GETTER ==================

    public void addPfleger(zookeeper pfleger) {
        zookeeperList.add(pfleger);
    }

    public Vector<zookeeper> getZookeeperList() {
        return zookeeperList;
    }

    public void addGehege(Gehege gehege) {
        if (gehege == null) {
            System.out.println("Bitte Name des Geheges einfügen welches hinzugefügt werden soll");
        } else {
            gehegeliste.add(gehege);
        }
    }

    public void setGehegeStatusAufUngepflegt() {
        for (Gehege element : gehegeliste) {
            element.setGepflegt(false);
        }
    }

    public void deleteGehege(Gehege gehege) {
        this.gehegeliste.remove(gehege);
    }

    public Vector<Gehege> getGehegeliste() {
        return gehegeliste;
    }

    // ================= FUNKTIONEN ============================
    public void printZooStruktur() {
        System.out.printf("|-- %sZoo: " + name + ", gegründet " + gruendungsjahr + "%s\n", ConsoleColors.GREEN_BOLD, ConsoleColors.RESET);
        System.out.print("|-- Pfleger: ");
        for (zookeeper element : zookeeperList) {
            System.out.printf(element.getName() + ",");
        }
        System.out.println();
        for (Gehege element : gehegeliste) {
            System.out.println("|   |-- " + element.toString());
        }
    }

    public void tagesSimulation() {
        // Alle Zookeeper nacheinander durchgehen:
        for (zookeeper zookeeper : zookeeperList) {
            System.out.printf("%s" + zookeeper.getName() + "legt los%s%n",ConsoleColors.GREEN_BACKGROUND, ConsoleColors.RESET);
            Vector<Gehege> zustaendigkeiten = zookeeper.getResponsabilities();
            // Alle verantworlichen Gehege des aktuellen Zookeepers durchgehen:
            for (Gehege gehege : zustaendigkeiten){
                //Prüfen ob das gehege bereits bearbeitet wurde:
                if (gehege.isGepflegt()){
                    System.out.printf("%s->Das Gehege " + gehege.getName() + " ist bereits bearbeitet worden%s %n", ConsoleColors.CYAN_BRIGHT, ConsoleColors.RESET);
                } else {
                    System.out.println("->Gehege " + gehege.getName() + " bearbeiten");
                    gehege.setGepflegt(true);
                }
            }
        }
    }


}
