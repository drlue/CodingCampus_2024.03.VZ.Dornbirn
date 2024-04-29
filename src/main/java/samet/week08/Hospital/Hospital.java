package samet.week08.Hospital;


import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String name;
    private List<Department> departments;

    public Hospital(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Welcome to the Sacred Heart Hospital");
        sb.append("\n");
        return sb.toString();
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    private Ambulance findAmbulanceDepartment() {
        for (Department department : departments) {
            if (department instanceof Ambulance)
                return (Ambulance) department;

        }
        return null;
    }

    public void assignPatients(List<Patient> patients) {
        Ambulance ambulance = findAmbulanceDepartment();
        if (ambulance == null) throw new NullPointerException();
        for (Patient patient : patients) {
            if (ambulance.isPatientTreatable(patient))
                ambulance.addPatient(patient);
            else {
                for (Department dep : departments) {
                    if (dep instanceof Stationary) {
                        dep.addPatient(patient);
                        break;
                    }
                }
            }
        }
    }

    public void treat(){
        for (Department department : departments) {
            for (Patient pat: department.getPatients()) {
                department.medicate(pat);
            }
        }
    }
}



