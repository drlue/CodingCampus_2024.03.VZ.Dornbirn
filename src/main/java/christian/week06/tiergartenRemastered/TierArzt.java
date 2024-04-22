package christian.week06.tiergartenRemastered;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TierArzt {
    Random random = new Random();
    private String name;
    private List<Gehege> gehegeList;

    public TierArzt(String name) {
        this.name = name;
        this.gehegeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void getGehegeList() {
        for (Gehege x : gehegeList) {
            System.out.println("       |---" + x.getName());
        }
    }

    public void addGehegeToList(Gehege gehege) {
        if (!gehegeList.contains(gehege)) {
            this.gehegeList.add(gehege);
        }
    }

    public void removeGehegeFromList(Gehege gehege) {
        if (gehegeList.contains(gehege)) {
            this.gehegeList.remove(gehege);
        }
    }

    public void rundgang() {
        ArrayList<Tier> krankeTiere = new ArrayList<>();
        for (Gehege g : gehegeList) {
            krankeTiere.addAll(g.tierArztbesuch());
        }
        Tier notfall = null;
        if (krankeTiere.size() > 0) {
            for (Tier x : krankeTiere) {
                if (notfall != null && x.lebendig() && (notfall.getHp() / notfall.getMaxHP())*100 > (x.getHp() / x.getMaxHP())*100) {
                    notfall = x;
                } else {
                    notfall = x;
                }
            }
            System.out.printf("%s muss dringend behandelt werden! Das Tier hat noch %.2f Prozent seiner Lebenspunkte!\n", notfall.getName(), (notfall.getHp() / notfall.getMaxHP()) * 100);
            float heilung = notfall.getMaxHP() * (random.nextInt(30, 101)) / 100;
            notfall.hpAenderung(heilung);
            System.out.printf("%s hat %s behandelt(%.2f Hp Heilung). %s hat aktuell %.2f Hp\n", name, notfall.getName(), heilung, notfall.getName(), notfall.getHp());
            krankeTiere.removeAll(krankeTiere);
        } else {
            System.out.printf("%s macht Pause\n", name);
        }

    }


}
