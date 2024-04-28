package samet.week08.Hospital;

import java.util.List;

public class Room {

    private List<Bed> bedsList;
    private int roomNumber;

    public Room(List<Bed> bedsList, int roomNumber) {
        this.bedsList = bedsList;
        this.roomNumber = roomNumber;
    }
    public List<Bed> getBedsList(){
        return bedsList;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
