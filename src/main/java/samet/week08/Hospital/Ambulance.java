package samet.week08.Hospital;


public class Ambulance extends Department {

    private String openingTime;

    private int maxCapacity;


    public Ambulance(String name, String openingTime, int maxCapacity) {
        super(name);
        this.openingTime = openingTime;
        this.maxCapacity = maxCapacity;
    }

    public boolean isPatientTreatable(Patient patient) {
        return patient.getStatus() == Patient.PatientStatus.Mild || patient.getStatus() == Patient.PatientStatus.Moderate;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public void addPatient(Patient patient) {
        if (super.getPatients().size() < maxCapacity) {
            super.addPatient(patient);
            System.out.println(patient.getName() + " kommt mit " + patient.getIllness() + " ins Sacred Heart Hospital.");
            System.out.println(patient.getName() + " wurde in die Ambulanz " + "aufgenommen.");
        } else {
            System.out.println("Die Ambulanz " + super.getName() + "ist voll. " + patient.getName() + " muss warten!! ");
        }
    }

    public void medicate(Patient patient) {
        System.out.println("Patient " + patient.getName() + " treated in the ambulance department.");
    //    this.removePatient(patient);
    }
}
