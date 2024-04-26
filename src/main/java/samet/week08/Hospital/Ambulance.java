package samet.week08.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Ambulance extends Department {

    private String openingTime;

    private int maxCapacity;



    public Ambulance(String name, String openingTime, int maxCapacity) {
        super(name);
        this.maxCapacity = maxCapacity;
        super.patients = new ArrayList<>();
    }

    @Override
    public void addPatient(Patient patient){
        if (patients.size() < maxCapacity){
            patients.add(patient);
            System.out.println(patient.getName() + " wurde in die Ambulanz "  + "aufgenommen.");
        }else {
            System.out.println("Die Ambulanz "  + name + "ist voll. " + patient.getName() + " muss warten!! ");
        }
    }
}
