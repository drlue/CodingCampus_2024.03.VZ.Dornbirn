package samet.week08.Hospital;

import java.util.ArrayList;



public class Ambulance extends Department {

    private String openingTime;

    private int maxCapacity;


    public Ambulance(String name, String openingTime, int maxCapacity) {
        super(name);
        this.maxCapacity = maxCapacity;
        super.patients = new ArrayList<>();
    }

    //Brauche eine Methode: Patienten kommen in die ambulanz, je nach Erkrankungsgrad (mild und moderate wird in der Ambulanz behandelt, serious wird an die Station weitergeleitet)

    public void checkPatient() {
        for (Patient patient : patients)
            switch (patient.getStatus()) {
                case Patient.PatientStatus.Mild:
                case Patient.PatientStatus.Moderate:
                    System.out.println(patient.getName() + " wird in der Ambulanz behandelt.");
                    break;
                case Patient.PatientStatus.Serious:
                    System.out.println(patient.getName() + " wird in die Station weitergeleitet.");
                    break;
                default:
                    System.out.println("ungültiger Erkrankungsgrad. ");
            }
    }

    @Override
    public void addPatient(Patient patient) {
        if (patients.size() < maxCapacity) {
            patients.add(patient);
            System.out.println(patient.getName() + " kommt mit " + patient.getIllness() + " ins Sacred Heart Hospital.");
            System.out.println(patient.getName() + " wurde in die Ambulanz " + "aufgenommen.");
        } else {
            System.out.println("Die Ambulanz " + name + "ist voll. " + patient.getName() + " muss warten!! ");
        }
    }
}
