package irem.week08.Hospital;

import java.util.List;

public class Room {

    private int roomNummber;
   public List<Bed> bedList;

    public Room(int roomNummber, List<Bed> bedList) {
        this.roomNummber = roomNummber;
        this.bedList = bedList;
    }
}
