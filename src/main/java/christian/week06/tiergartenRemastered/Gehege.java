package christian.week06.tiergartenRemastered;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Gehege {

    private String name;
    private List<Tier> tierList;
    private boolean arbeitErledigt;

    public Gehege(String name) {
        this.name = name;
        tierList = new ArrayList<>();
        arbeitErledigt = false;
    }

    Random rnd = new Random();

    public void printStructure() {

        System.out.println("|   |---Gehege: " + name);
        if (!tierList.isEmpty()) {
            for (Tier x : tierList) {
                x.printStructure();
            }
        } else {
            System.out.println("|       |--- (Leer)");
        }

    }

    public String getName() {
        return name;
    }

    public void addTierToList(Tier tier) {
        if (!tierList.contains(tier)) {
            tierList.add(tier);
            System.out.println(tier.getGattung() + " " + tier.getName() + " wurde dem Gehege " + name + " hinzugefügt!");
        } else {
            System.out.println("Tier existiert bereits im Gehege!");
        }
    }

    public void removeTierFromList(Tier tier) {
        if (tierList.contains(tier)) {
            tierList.remove(tier);
            System.out.println(tier.getName() + " wurde aus dem " + name + " entfernt!");
        } else {
            System.out.println(tier.getName() + " ist nicht im " + name);
        }
    }

    public void getFutterBedarf(Map<Futter, Float> futterBedarf) {
        for (Tier tier : tierList) {
            tier.getFutterBedarf(futterBedarf);
        }
    }

    public boolean getArbeitErledigt() {
        return arbeitErledigt;
    }

    public void arbeitErledigen(Pfleger pfleger) {

        arbeitErledigt = true;
        for (Tier x : tierList) {
            x.fuettern(pfleger);

        }
        int rndIndex = rnd.nextInt(0, tierList.size());
        Tier rndTier = tierList.get(rnd.nextInt(tierList.size()));
        String verb = tierList.get(rndIndex).getGattung().equals(pfleger.getLieblingsTierGattung()) ? "bewundert" : "beobachtet";

        System.out.println(pfleger.getName() + " " + verb + " " + tierList.get(rndIndex).getName());


    }

    public void resetArbeitErledigt() {
        arbeitErledigt = false;
        for (Tier x : tierList) {
            x.resetGefuettert();
        }
    }

    public void tierAktivitaetenInGehege(){
        Tier nachbar;
        for(int i = 0;i<tierList.size();i++){
            if (i==tierList.size()-1){
                 nachbar = tierList.get(i-1);
            }else {
                 nachbar = tierList.get(i+1);
            }

            int wahrscheinlichkeit = rnd.nextInt(0,100);
            if(wahrscheinlichkeit <40){
                tierList.get(i).beissen(nachbar);
            }
        }

    }
}
