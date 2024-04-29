package samet.week08.Hospital;

public class Bed {

    private boolean occupied;
    private  int bednumber;
    private Patient patient;


    public Bed(int bednumber){
        this.bednumber = bednumber;
        this.patient = null;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isOccupied() {
        return patient != null;
    }

    public int getBednumber() {
        return bednumber;
    }
}
