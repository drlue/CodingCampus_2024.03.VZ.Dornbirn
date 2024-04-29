package samet.week09;

import java.util.ArrayList;
import java.util.List;

public class TimeTable {

    private String exercise;
    private List<Room> rooms;


    public TimeTable(String exercise){
        this.exercise = exercise;
        this.rooms = new ArrayList<>();
    }

}
