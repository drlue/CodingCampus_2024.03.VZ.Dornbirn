package samet.week08.Hospital;

import java.util.List;

abstract class Department {

     protected String name;
     protected List<Patient> patients;

    public Department(String name) {
        this.name = name;
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

    public abstract void addPatient(Patient patient);


}



