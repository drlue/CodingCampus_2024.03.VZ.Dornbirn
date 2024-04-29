package christian.week08.SchuleSimulationV1.personV1;

public class Lehrer extends Person {
    public enum Fach {DEUTSCH, MATHE, ENGLISCH, SPORT, GESCHICHTE, WERKEN, LATEIN}

    private Fach hauptFach;
    private Fach nebenFach;

    public Lehrer(String name, Fach hauptFach, Fach nebenFach) {
        super(name);
        this.hauptFach = hauptFach;
        this.nebenFach = nebenFach;
    }

    //======================================================================================================get=========
    public String getSchulfachString() {
        switch (hauptFach) {
            case MATHE -> {
                return "Mathe";
            }
            case LATEIN -> {
                return "Latein";
            }
            case SPORT -> {
                return "Sport";
            }
            case WERKEN -> {
                return "Werken";
            }
            case DEUTSCH -> {
                return "Deutsch";
            }
            case ENGLISCH -> {
                return "Englisch";
            }
            case GESCHICHTE -> {
                return "Geschichte";
            }
            default -> {
                return "Fernsehen";
            }
        }
    }
    //======================================================================================================set=========
    //======================================================================================================create======
    //==================================================================================================add/remove======
    //==================================================================================================alter===========
    //==================================================================================================simulate========
}
