package christian.week08.SchuleSimulationV1.personV1;

import java.util.ArrayList;

public class Schulklasse {
    private String name;
    private ArrayList<Schueler> listOfSchueler;

    public Schulklasse(String name) {
        this.name = name;
        listOfSchueler = new ArrayList<>();
    }
    //======================================================================================================get=========

    public String getName() {
        return name;
    }

    public String getNameOfSchuelerAtIdx(Integer index) {
        return listOfSchueler.get(index).getName();
    }

    public Integer getLengthfromSchuelerList() {
        return listOfSchueler.size();
    }

    //======================================================================================================set=========
    //======================================================================================================create======
    //==================================================================================================add/remove======
    public void addSchuelerToKlasse(Schueler schueler) {
        listOfSchueler.add(schueler);
    }
    //==================================================================================================alter===========
    //==================================================================================================simulate========
}
