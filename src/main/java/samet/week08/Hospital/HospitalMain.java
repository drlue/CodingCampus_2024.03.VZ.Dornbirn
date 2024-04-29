package samet.week08.Hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HospitalMain {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Sacred Heart Hospital");
        System.out.println(hospital);

        Ambulance ambulance = new Ambulance("Ambulance ", " 06:00 - 23:00 ", 10);
        Stationary stationary = new Stationary("Statuionary");

        Patient hans = new Patient("Hans", 27, "Grippe", Patient.PatientStatus.Mild);
        Patient josef = new Patient("Josef", 56, "Herzinfarkt", Patient.PatientStatus.Serious);
        Patient ali = new Patient("Ali", 21, "Armbruch", Patient.PatientStatus.Moderate);
        Patient heike = new Patient("Heike", 33, "Schusswunde", Patient.PatientStatus.Serious);

        hospital.setDepartments(new ArrayList<>(Arrays.asList(ambulance, stationary)));

        List<Department> departments = new ArrayList<>();
        departments.add(ambulance);
        departments.add(stationary);

        for (Department dep : departments) {
            if (dep instanceof Ambulance) {
                System.out.println(dep);
            } else {
                System.out.println(dep);
            }
        }

        hospital.assignPatients(Arrays.asList(hans, josef, ali, heike));

        hospital.treat();
        }
    }

