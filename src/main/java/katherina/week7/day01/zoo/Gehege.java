package katherina.week7.day01.zoo;


import java.util.Vector;

public class Gehege {
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
            String message = "beobachtet";
            if (tier.getGattung().equals(pfleger.getLiebling())){
                message = "bewundert";
            }
            System.out.printf("%s %s %s.%n",
                     pfleger.getName(),
                    message,
                    tier.getName()
            );
        }
    }

}




