package christian.week06.tiergartenRemastered;

import java.util.Map;

public class Tier {
    private String name;
    private String gattung;
    private Futter futter;
    private float futterMenge;
    private boolean gefuettert;

    public Tier(String name, String gattung, Futter futter, float futterMenge){
        this.name =  name;
        this.gattung =  gattung;
        this.futter = futter;
        this.futterMenge = futterMenge;
        this.gefuettert = false;
    }

    public void printStructure(){

        System.out.println("|       |---"+name+","+gattung);
    }

    public String getName (){
        return name;
    }

    public String getGattung(){
        return gattung;
    }

    public void getFutterBedarf(Map<Futter,Float>futterBedarf){
        if (futterBedarf.containsKey(futter)){
            futterBedarf.put(futter, futterBedarf.get(futter) + futterMenge);
        } else {
            futterBedarf.put(futter, futterMenge);
        }
    }

    public void fuettern(){
        gefuettert = true;
    }

    public void resetGefuettert (){
        gefuettert = false;
    }
}
