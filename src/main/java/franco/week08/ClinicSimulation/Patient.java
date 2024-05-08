package franco.week08.ClinicSimulation;

public class Patient {
  private String name;
  private String illness;
   enum HealthStatus{MODERATE,SERIOUS}
     private HealthStatus status;


    public Patient(String name){
        this.name = name;

    }
}
