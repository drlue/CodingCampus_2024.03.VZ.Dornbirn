package christian.week08.schoolSimulationV2;

import christian.week08.schoolSimulationV2.humans.Human;
import christian.week08.schoolSimulationV2.rooms.Room;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Room>listOfRooms;
    private ArrayList<Human>listOfHumans;

    public School (String name){
        this.name = name;
    }

    //======================================================================================================get=========

    //======================================================================================================set=========
    //======================================================================================================create======
    //==================================================================================================add/remove======
    //==================================================================================================alter===========
    //==================================================================================================simulate========

    public void simulateDay(){
        for (int day = 0; day < 10; day++) {
            for (int hour = 0; hour < 23; hour++) {
                System.out.println(hour + ":00");
                if(hour >= 8 && hour <= 16){
                    for(Room room : listOfRooms){
                        room.takeDataFromTimetable(hour);
//                        room.simulateLesson();
                    }
                }
            }
        }
    }
}
