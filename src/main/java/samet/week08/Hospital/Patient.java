package samet.week08.Hospital;

public class Patient {

    private String name;
    private boolean discharged = false;

    public Patient(String name) {
        this.name = name;
        this.discharged = false;
    }

    public String getName() {
        return name;
    }

    public boolean isDischarged(){
        return discharged;
    }

    public void setDischarged(boolean discharged) {
        this.discharged = discharged;
    }
}
