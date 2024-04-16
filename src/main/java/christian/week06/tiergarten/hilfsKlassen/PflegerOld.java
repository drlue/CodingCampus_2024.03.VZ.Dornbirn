package christian.week06.tiergarten.hilfsKlassen;

import christian.week06.tiergarten.GehegeOld;

import java.util.ArrayList;
import java.util.List;

public class PflegerOld {
    private String name;
    private List<GehegeOld> gehegeOldList = new ArrayList<GehegeOld>();

    public PflegerOld(String name) {
        this.name = name;
    }

    public void setGehegeList(List<GehegeOld> gehegeOldList) {
        for (GehegeOld g : gehegeOldList){
            int loopCount = 0;
            if(loopCount != (gehegeOldList.size()/2)){
                this.gehegeOldList.add(g);
            }else {
                break;
            }

        }
    }
//    public void tiereFuettern(List<Gehege>gehegeList){
//        for(Gehege g :gehegeList){
//            for(Tier t : g.tierListe){
//                t.setGefuettert();
//                System.out.printf("Pfleger %s hat das Tier %s gefüttert!",this.name,t.getName());
//            }
//
//        }
//
//    }
}
