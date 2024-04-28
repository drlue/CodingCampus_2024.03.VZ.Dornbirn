package samet.week08.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Stationary extends Department {

    private List<Room> rooms;


    public Stationary(String name) {
        super(name);
        this.rooms = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            List<Bed> beds = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                Bed bed = new Bed(j + 1);
                beds.add(bed);
            }
            Room room = new Room(beds, 100 + i);
            rooms.add(room);
        }
    }

    public void addPatient(Patient patient) {
        super.addPatient(patient);
        System.out.println(patient.getName() + " wurde in die " + super.getName() + " aufgenommen. ");
    }

    public void medicate(Patient patient) {
        boolean patientIsAssigned = false;
        for (Room room : rooms) {
            for (Bed bed : room.getBedsList()) {
                if (!bed.isOccupied()){
                    bed.setPatient(patient);
                    System.out.printf("Patient %s is being treated in the Room %s  in Bed %s%n", patient.getName(), room.getRoomNumber(), bed.getBednumber());
                    patientIsAssigned = true;
                    break;
                }
            }
            if (patientIsAssigned){
                break;
            }
        }
    }
}
