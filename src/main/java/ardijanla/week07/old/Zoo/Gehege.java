package ardijanla.week07.old.Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gehege {
    private String name;

    private List<Tier> tiere;

    private boolean isChecked;

    private boolean isFeed;
    Random rnd;

    public Gehege(String name) {
        this.name = name;
        tiere = new ArrayList<>();
        isChecked = false;
        isFeed = false;
        rnd = new Random();
    }

    public void tierFuettern(Pfleger pfleger) {

        int rnd1 = rnd.nextInt(0, tiere.size());

        if (!isFeed) {
            System.out.println("Die Tiere in " + name + " werden gefüttert von: " + pfleger.name);
            tierBeobachten(pfleger);
            isFeed = true;
        } else {
            System.out.println("Die Tiere in " + name + " wurden schon von dem Vorherigen Pfleger gefüttert.");
            isFeed = false;
        }

    }

    public void tierBeobachten(Pfleger pfleger) {
        if (tiere.getFirst().gattung.equals(pfleger.favoriteGattung)) {
            System.out.println("Pfleger: " + pfleger.name + " beobachtet " + getTiere().getFirst() + " das er gefüttert hat etwas länger.");
        }
    }

    public void nachbarbeissen() {

        Random rnd = new Random();
        if (rnd.nextDouble() < 0.4){
            for (Tier x : tiere){
                if (!x.equals(this)){
                    int vorherigestier = tiere.indexOf(x) - 1;
                   int lefthealth = x.gesundheit - tiere.get(vorherigestier).biss;
                    x.gesundheit = lefthealth;
                }
            }
        }

    }


    public void gehegeBearbeiten() {
        if (!isChecked) {
            System.out.println(name + " wird bearbeitet\n");
            isChecked = true;
        } else {
            System.out.println(name + " wurde schon vom vorherigen Pfleger bearbeitet.\n");
            isChecked = true;
        }
    }

    public void resetTag() {
        isChecked = false;
    }

    public List<Tier> getTiere() {
        return tiere;
    }

    public void addTier(Tier tier) {
        tiere.add(tier);
    }

    public String getGehegeView() {
        StringBuilder sb = new StringBuilder();
        sb.append("├──- Gehege: ").append(name).append("\n");
        if (tiere.isEmpty()) {
            sb.append("│       ├── (leer)\n");
        } else {
            for (Tier t : tiere) {
                sb.append("│       ├── ").append(t.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
