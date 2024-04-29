package franco.week08.ClinicSimulation;

import java.util.ArrayList;
import java.util.List;

public abstract class Department {
    protected String name;
    protected List<Patient> patientList;

    public Department(String name) {
        this.name = name;
        this.patientList = new ArrayList<>();

    }

    public abstract void addPatient(Patient Patient);


}
