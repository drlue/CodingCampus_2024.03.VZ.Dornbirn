package demian.week08.Zoo;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Gehege {
    private String name;
    private Vector<Tier> tierliste;
    private boolean gepflegt;

    // ======== KONSTRUKTOR ===========
    public Gehege(String name) {
        this.name = name;
        this.tierliste = new Vector<>();
        this.gepflegt = false;
    }

    // ========== SETTER / GETTER ========


    public void setGepflegt(boolean gepflegt) {
        this.gepflegt = gepflegt;
    }

    public Vector<Tier> getTierliste() {
        return tierliste;
    }

    public String getName() {
        return name;
    }

    // =========== FUNKTIONEN ============
    public void addAnimal(Tier tier){
        this.tierliste.add(tier);
    }

    public void printAnimals(){
        for(Tier element : tierliste){
            System.out.println(element);
        }
    }

    @Override
    public String toString() {
        StringBuilder Tiere = new StringBuilder();
        for (Tier element : tierliste){
            Tiere.append("\n").append("|-------->").append(element);
        }
        String formatted = String.format("%sGehege: " + name + "%s" + Tiere , ConsoleColors.CYAN_BOLD, ConsoleColors.RESET);
        return formatted;
    }
}
