package franco.week08.ClinicSimulation;


import java.util.List;

public class Room { private int roomNummber;
    public List<Bed> bedList;

    public Room(int roomNummber, List<Bed> bedList) {
        this.roomNummber = roomNummber;
        this.bedList = bedList;
    }
}
