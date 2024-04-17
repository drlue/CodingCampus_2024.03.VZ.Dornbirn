package demian.week08.Zoo;

import ardijanla.ConsoleColors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class zookeeper {
    private String name;
    private Vector<Gehege> responsabilities;
    private Tier lieblingstier;

    public zookeeper(String name, Tier lieblingstier) {
        this.name = name;
        responsabilities = new Vector<>();
        this.lieblingstier = lieblingstier;
    }

    public void addResp(Gehege gehege) {
        responsabilities.add(gehege);
    }

    public void printGehegearbeit(Gehege gehege) {
        gehege.setGepflegt(true);
        System.out.println(name + "füttert alle Tiere im " + gehege.getName());
        Vector<Tier> temp = gehege.getTierliste();
        if (!temp.contains(this.lieblingstier)){
            System.out.println(name + "beobachtet die Tiere im Gehege für 1s");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println(name + "beobachtet sein Lieblingstier " + this.lieblingstier.getName() + " für 3s");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder verantworungsbereich = new StringBuilder();
        for (Gehege elemente : responsabilities) {
            verantworungsbereich.append("\n").append("|    --").append(elemente);
        }
        String formatted = String.format("|-- %sPfleger%s: " + name +
                "\n|-- Zuständig für:" + verantworungsbereich, ConsoleColors.BLUE, ConsoleColors.RESET);
        return formatted;
    }
}
