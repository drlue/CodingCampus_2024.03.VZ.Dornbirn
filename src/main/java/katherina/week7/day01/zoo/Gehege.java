package katherina.week7.day01.zoo;

import java.util.Random;
import java.util.Vector;

public class Gehege {

    public Random random = new Random();


    private String name;
    private Zoo zoo;
    private Vector<Tier> tierliste;

    public Gehege(String name) {
        this.name = name;
        this.zoo = null;
        tierliste = new Vector<>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void addTier(Tier tier) {
        if (tier != null) {
            tier.setGehegeIntern(this);
        }
        tierliste.add(tier);
    }

    public void removeTier(Tier tier) {
        tierliste.remove(tier);
    }

    public void printStructure(Vector<Pfleger> angestellte) {
        System.out.printf("│    ├── Gehege: %s", name);
        if (!angestellte.isEmpty()) {
            System.out.print(" (Pfleger: ");
            for (int index = 0; index < angestellte.size(); index++) {
                if (index > 0) {
                    System.out.print(", ");
                }
                System.out.print(angestellte.get(index).getName());
            }
            System.out.println(")");
        } else {
            System.out.println("     \n     (Achtung! Niemand ist für dieses Gehege zuständig. Bitte ändern!)");
        }
        for (Tier tierchen : tierliste) {
            tierchen.printStructure();
        }
        if (tierliste.isEmpty()) {
            System.out.println("│        ├── dieses Gehege enthält keine Tiere. Bitte füge Tiere hinzu!");
        }
    }

    public void putzkolonne(Pfleger pfleger) {
        System.out.printf("%s putzt das Gehege \"%s\" und füttert alle darin lebenden Tiere.%n", pfleger.getName(), name);
    }


    public void zufallstierBegucken(Pfleger pfleger) {
        if (!tierliste.isEmpty()) {
            for (int index = 0; index < tierliste.size(); index++) {
                if (tierliste.get(index).getGesundheit() < 0)
                    {
                        tierliste.remove(index);
                    System.out.printf("Das Tier %s wurde von %s aus dem Gehege entfernt, weil es tot ist!\n", tierliste.get(index).getName(), pfleger.getName());
                }
            }
            Tier tier = tierliste.get(Zoo.random.nextInt(tierliste.size()));
            if (tier.getGattung().equals(pfleger.getLiebling())) {
                System.out.println(pfleger.getName() + " bewundert " + tier.getName());
            } else {
                System.out.println(pfleger.getName() + " bewundert " + tier.getName());
            }
        }
    }


    public void bissSimulator() {
        if (tierliste.size() != 0) {
            //Erstmal abfragen, ob überhaupt ausreichend Tiere drin sind, um sich gegenseitig zu beißen.
            for (int index = 0; index < tierliste.size(); index++) {
                boolean bissfaktor = Math.random() < 0.4;
                if (bissfaktor) {
                    Tier beisser = tierliste.get(index);
                    Tier opfer = tierliste.get(random.nextInt(tierliste.size()));
                    if (beisser == opfer) {
                    } else {
                        beisser.bissBerechnung(beisser, opfer);
                    }
                }
                //Ich brauche zwei Tiere. Eins, das mit 40% Wahrscheinlichkeit beißt und ein beliebiges anderes, das gebissen wird.
            }
        }
    }

}



