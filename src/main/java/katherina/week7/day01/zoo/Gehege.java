package katherina.week7.day01.zoo;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;



public class Gehege {

    public static Random random = new Random();


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

    public void printStructure(Vector<Pfleger> angestellte){
        System.out.printf("│    ├── Gehege: %s", name);
        if (!angestellte.isEmpty()){
            System.out.print(" (Pfleger: ");
            for (int index = 0; index < angestellte.size(); index++) {
                if (index > 0){
                    System.out.print(", ");
                }
                System.out.print(angestellte.get(index).getName());
            }
            System.out.println(")");
        } else {
            System.out.println("     \n     (Achtung! Niemand ist für dieses Gehege zuständig. Bitte ändern!)");
        }
        for (Tier tierchen : tierliste){
            tierchen.printStructure();
        }
        if (tierliste.isEmpty()){
            System.out.println("│        ├── dieses Gehege enthält keine Tiere. Bitte füge Tiere hinzu!");
        }
    }
    public void putzkolonne(Pfleger pfleger){
        System.out.printf("%s putzt das Gehege \"%s\" und füttert alle darin lebenden Tiere.%n", pfleger.getName(), name);
    }

    public void zufallstierBegucken(Pfleger pfleger){
        if (!tierliste.isEmpty()){
            Tier tier = tierliste.get(Zoo.random.nextInt(tierliste.size()));
            if (tier.lebendig()) {
            String message = "beobachtet";

                System.out.println(pfleger.getName() + " " + message + " " + tier.getName());
                if (tier.getGattung().equals(pfleger.getLiebling())){
                    message = "bewundert";
                }
                System.out.printf("%s %s %s.%n",
                        pfleger.getName(),
                        message,
                        tier.getName()
                );
      }else {
                System.out.printf("Das Tier %s wurde von %s aus dem Gehege entfernt, weil es tot ist!\n", tier.getName(), pfleger.getName());
                tierliste.remove(tier);
            }

        }
    }

    public void bissSimulator() {
        for (int index = 0; index < tierliste.size(); index++) {
            if (tierliste.size() > 1) {
                Tier sameGehege;
                int zufallsMenge = random.nextInt(tierliste.size());
                boolean bissfaktor = Math.random() < 0.4;
                System.out.println("Wurde ein Tier gebissen?"+bissfaktor);
                if (bissfaktor) {
                    if (zufallsMenge == tierliste.size() - 1) {
                        sameGehege = tierliste.get(zufallsMenge - 1);
                    } else {
                        sameGehege = tierliste.get(zufallsMenge + 1);
                    }
                    tierliste.get(zufallsMenge).getBiss(sameGehege);
                    tierliste.remove(zufallsMenge);
                    System.out.println("Was ist noch in der Menge drin?"+zufallsMenge);
                }
            }
        }
    }
}




