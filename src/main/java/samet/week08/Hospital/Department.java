package samet.week08.Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Department implements ITask {

    private String name;
    private List<Patient> patients;

    public Department(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }
}



