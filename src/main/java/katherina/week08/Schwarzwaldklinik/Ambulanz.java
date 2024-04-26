package katherina.week08.Schwarzwaldklinik;

import static katherina.week08.Schwarzwaldklinik.Patient.fetchHealth;

public class Ambulanz {
    private String open;
    private Warteraum warteraum;
    private Patient patient;
    private int platz;

    public Ambulanz(String open){
        this.open=open;
    }

    public boolean patientenVerteilung(Patient patient){
       boolean schwerkrank=true;
        fetchHealth(patient);
        if (!schwerkrank){
            schwerkrank=false;
            System.out.println("Patient geht direkt in den Warteraum.");
        }else{
            System.out.println("Patient wird auf Station aufgenommen.");
        }
        return schwerkrank;
    }
}

