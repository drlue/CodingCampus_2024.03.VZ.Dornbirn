package katherina.week08.Schwarzwaldklinik;

import static java.lang.String.valueOf;

public class Abteilung {
private String name;

    private Art art;

    enum Art {
        AMBULANZ,
        STATION
    }

public Abteilung(String name, Art art){
    this.name=name;
    this.art =art;
}

    public String getName() {
    return name;
    }

    public void printStructure() {
        System.out.printf("│    ├── Abteilung (%s): %s%n", art, name);
    }
}
