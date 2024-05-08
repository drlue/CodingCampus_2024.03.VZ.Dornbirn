package ardijanla.week08.SchwarzawlKlinik;

public class Ambulance extends Department {

    private int openTime;
    private int closeTime;
    private int capacity;

    public Ambulance(String name, int openTime, int closeTime, int capacity) {
        super(name);
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.capacity = capacity;
    }

    public void processPatient(Patient patient) {
        System.out.println("Patient " + patient.getName() + " wird in der Ambulanz " + name + " behandelt. Er kann jetzt nachhause gehen.");
    }
}
