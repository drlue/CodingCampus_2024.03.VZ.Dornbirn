package katherina.zoocopyforexperiments;

import java.util.Map;
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
        //Diese Schleife entfernt alle toten Tiere:
        for (int index = 0; index < tierliste.size(); index++) {
            if (!tierliste.get(index).lebendig()) {
                System.out.printf("Das Tier %s wurde von %s aus dem Gehege entfernt, weil es tot ist!\n", tierliste.get(index).getName(), pfleger.getName());
                tierliste.remove(index);
                --index;
            }
        }
        //Diese Abfrage sorgt dafür, dass die Pfleger ein Tier betrachten oder bewundern.
        if (!tierliste.isEmpty()) {
            Tier tier = tierliste.get(Zoo.random.nextInt(tierliste.size()));
            if (tier.getGattung().equals(pfleger.getLiebling())) {
                System.out.println(pfleger.getName() + " bewundert " + tier.getName() + ".");
            } else {
                System.out.println(pfleger.getName() + " beobachtet " + tier.getName() + ".");
            }

        }
    }

    public void getFutterBedarf(Map<Tierfutter, Float> futterBedarf) {
        for (Tier tier : tierliste) {
            tier.getFutterBedarf(futterBedarf);
        }
    }


    public void bissSimulator() {
        if (tierliste.size() != 1) {
            //Erstmal abfragen, ob überhaupt ausreichend Tiere drin sind, um sich gegenseitig zu beißen.
            for (int index = 0; index < tierliste.size(); index++) {
                boolean bissfaktor = Math.random() < 0.4;
                if (bissfaktor) {
                    Tier beisser = tierliste.get(index);
                    Tier opfer = tierliste.get(random.nextInt(tierliste.size()));
                    if (beisser == opfer || !opfer.lebendig()) {
                    } else {
                        beisser.bissBerechnung(beisser, opfer);
                    }
                } else {
                    String[] bravesTier = new String[]{
                            "Manche Tiere gucken lieber zum benachbarten Gehege, als andere Tiere zu beißen.",
                            "Einige Tiere haben keine Lust aufs Drama und verstecken sich",
                            "Einige Tiere gucken einfach nur mega niedlich.",
                            "Manche Tiere versuchen, aus dem Gehege auszubrechen!",
                            "Hups! Statt ein anderes Tier zu beißen, ist dieses hier über die eigenen Füße gestolpert!",
                            "Einige Tiere finden die wilden Pflanzen in ihrem Gehege sehr interessant.",
                            "Dieses Tier spielt lieber mit den Beschäftigungsspielsachen im Gehege.",
                            "Dieses Tier trinkt erst einmal ein bisschen Wasser."
                    };
                    int bravesTierIndex = new Random().nextInt(bravesTier.length);
                    System.out.println(bravesTier[bravesTierIndex]);
                }
            }
        }else{
            System.out.println("In diesem Gehege befinden sich keine Tiere, die einander beißen könnten.");
        }
    }

    public Tier kaputtestesTier() {
        Tier patient = null;
        for (Tier kaputtesTier : tierliste) {
            if (patient == null || kaputtesTier.aktuelleGesundheit() < patient.aktuelleGesundheit()) {
                patient = kaputtesTier;
            }
        }
        return patient;
    }
}








