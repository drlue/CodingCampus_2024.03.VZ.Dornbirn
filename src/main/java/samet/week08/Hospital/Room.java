package samet.week08.Hospital;

import java.util.List;

public class Room {

    private List<Beds> bedsList;
    private int roomNumber;

    public Room(List<Beds> bedsList, int roomNumber) {
        this.bedsList = bedsList;
        this.roomNumber = roomNumber;
    }
}
