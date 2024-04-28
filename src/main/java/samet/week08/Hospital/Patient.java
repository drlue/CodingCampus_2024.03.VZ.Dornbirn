package samet.week08.Hospital;

public class Patient {

    private String name;
    private int age;
    private String illness;


     public enum PatientStatus {
        Mild , Moderate, Serious
    }
    private PatientStatus status;

    public Patient(String name, int age, String illness,PatientStatus status) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.status = status;
    }

    public String getIllness() {
        return illness;
    }

    public PatientStatus getStatus() {
        return status;
    }

    public int getAge() {
        return age;
    }

    public void setStatus(PatientStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

}
