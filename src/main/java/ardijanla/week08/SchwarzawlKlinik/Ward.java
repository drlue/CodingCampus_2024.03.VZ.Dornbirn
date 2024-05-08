package ardijanla.week08.SchwarzawlKlinik;

import java.util.ArrayList;
import java.util.List;

public class Ward extends Department{
    private List<Room> roomList;
    private List<Patient> patients;

    public Ward(String name) {
        super(name);
        this.roomList = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    public void addRoom(Room room) {
        this.roomList.add(room);
    }

    public void showPatients(){
        for (Patient x : patients){
            System.out.println(x.getName());
        }
    }
}
