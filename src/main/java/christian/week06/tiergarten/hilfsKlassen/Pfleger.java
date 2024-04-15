package christian.week06.tiergarten.hilfsKlassen;

import christian.week06.tiergarten.Gehege;
import christian.week06.tiergarten.Tier;

import java.util.ArrayList;
import java.util.List;

public class Pfleger {
    private String name;
    private List<Gehege> gehegeList = new ArrayList<Gehege>();

    public Pfleger(String name) {
        this.name = name;
    }

    public void setGehegeList(List<Gehege> gehegeList) {
        for (Gehege g : gehegeList){
            int loopCount = 0;
            if(loopCount != (gehegeList.size()/2)){
                this.gehegeList.add(g);
            }else {
                break;
            }

        }
    }
    public void tiereFuettern(List<Gehege>gehegeList){
        for(Gehege g :gehegeList){
            for(Tier t : g.tierListe){
                t.setGefuettert();
                System.out.printf("Pfleger %s hat das Tier %s gefüttert!",this.name,t.getName());
            }

        }

    }
}
