package katherina.week7.day01.zoo;

import java.util.Vector;

public class Pfleger {

    private String name;
    private String liebling;

    private Vector<Gehege> bereich;

    public Pfleger(String name, String liebling) {
        this.name = name;
        this.liebling = liebling;
        bereich = new Vector<>();
    }

    public void addBereich(Gehege gehege) {
        if (!bereich.contains(gehege)) {
            bereich.add(gehege);
        }
    }

    public boolean zustaendigkeit(Gehege gehege) {
        return bereich.contains(gehege);
    }

    public String getLiebling() {
        return liebling;
    }


    public String getName() {
        return name;
    }

    public void simulateDay(){
        System.out.printf("%s beginnt den Arbeitstag.%n", name);
        for (Gehege gehege: bereich){
            gehege.putzkolonne(this);
            gehege.zufallstierBegucken(this);

        }
        System.out.printf("%s ist fertig und geht nach Hause.%n",name);
    }
}

