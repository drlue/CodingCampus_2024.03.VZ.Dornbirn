package ardijanla.week07.old.Zoo;

import java.util.HashMap;

public class Tier {
    String name;
    String gattung;
    int gesundheit;
    int maxGesundheit;

    int biss;

    HashMap<Futter,Integer> futterBedarf;


    public Tier(String name, String gattung,int maxGesundheit,int biss) {
        this.name = name;
        this.gattung = gattung;
        this.futterBedarf = new HashMap<>();
        this.gesundheit = maxGesundheit;
        this.maxGesundheit = maxGesundheit;
        this.biss = biss;
    }

    public void setFutterBedarf(Futter futter, int menge){
        futterBedarf.put(futter,menge);
    }

    public HashMap<Futter, Integer> getFutterBedarf() {
        return futterBedarf;
    }

    @Override
    public String toString() {
        return name + ", " + gattung;
    }
}
