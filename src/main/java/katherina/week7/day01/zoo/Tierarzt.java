package katherina.week7.day01.zoo;


import java.util.Vector;

public class Tierarzt {
    private String name;
    private Zoo zoo;
    private Vector<Tier> tierliste;

    public Tierarzt(String name) {
        this.name = name;
        tierliste = new Vector<>();
    }

    public void setZooIntern(Zoo zoo) {
        this.zoo = zoo;
    }


    public void addTier(Tier tier) {
        if (tier != null) {
            tier.setTierarztIntern(this);
        }
        tierliste.add(tier);
    }


    public void printStructure() {
        System.out.printf("│  ├── Tier-Doc: %s%n", name);
    }
}

