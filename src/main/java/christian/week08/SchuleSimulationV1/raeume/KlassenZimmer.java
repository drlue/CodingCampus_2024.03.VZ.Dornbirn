package christian.week08.SchuleSimulationV1.raeume;

import christian.week08.SchuleSimulationV1.personV1.Lehrer;
import christian.week08.SchuleSimulationV1.personV1.Schulklasse;

import java.util.ArrayList;

public class KlassenZimmer extends Raum {

    private ArrayList<Schulklasse> klassenPlan;
    private ArrayList<Lehrer> lehrerPlan;

    public KlassenZimmer(String name) {
        super(name);
        this.klassenPlan = new ArrayList<>();
        this.lehrerPlan = new ArrayList<>();
    }
    //======================================================================================================get=========

    public Schulklasse getKlassefromPlan(int hour) {
        if (hour > 7 && hour < 13) {
            return klassenPlan.get(hour - 8);
        } else {
            return null;
        }
    }

    public Lehrer getLehrer(int hour) {
        if (hour > 7 && hour < 13) {
            return lehrerPlan.get(hour - 8);
        } else {
            return null;
        }

    }

    //======================================================================================================set=========
    //======================================================================================================create======
    //==================================================================================================add/remove======
    public void addToklassenPlan(Schulklasse klasse) {
        klassenPlan.add(klasse);
    }

    public void addToLehrerPlan(Lehrer lehrer) {
        lehrerPlan.add(lehrer);
    }
    //==================================================================================================alter===========
    //==================================================================================================simulate========

}
