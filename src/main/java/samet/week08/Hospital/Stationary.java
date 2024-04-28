package samet.week08.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Stationary extends Department {

    private List<Room> rooms;
    private int room;


    public Stationary(String name, int room) {
        super(name);
        this.room = room;
        this.rooms = new ArrayList<>();
        super.patients = new ArrayList<>();

    }
    public void addPatient(Patient patient){
        patients.add(patient);
        System.out.println(patient.getName()  + " wurde in die " + name +  " aufgenommen. ");
    }
}
