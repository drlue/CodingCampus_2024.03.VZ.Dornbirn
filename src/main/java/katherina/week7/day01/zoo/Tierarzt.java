package katherina.week7.day01.zoo;


import java.util.ArrayList;
import java.util.Vector;

public class Tierarzt {
    private String name;
    private Zoo zoo;
    private Vector<Tier> tierliste;

    public Tierarzt(String name) {
        this.name = name;
        tierliste = new Vector<>();
    }

    public void setZooIntern(Zoo zoo) {
        this.zoo = zoo;
    }


    public void addTier(Tier tier) {
        if (tier != null) {
            tier.setTierarztIntern(this);
        }
        tierliste.add(tier);
    }

//    public void healsimulator() {
//        for (Tier krank : tierliste) {
//            if (krank.getMaxGesundheit() == krank.getGesundheit()) {
//            } else {
//                Vector<Tier> patient = new Vector<>();
//                for (int index = 0; index < ((patient.get(patient.size()))/2); index++) {
//                    Tier zwischenspeicher = patient.get(index);
//                    patient.get(index) = patient.get(index - 1);
//                    patient.get(patient.size() - index - 1) = zwischenspeicher;
//                    System.out.println(patient.get(0));
//                }
//
//            }
//
//        }
//    }


    public void printStructure() {
        System.out.printf("│  ├── Tier-Doc: %s%n", name);
    }
}

