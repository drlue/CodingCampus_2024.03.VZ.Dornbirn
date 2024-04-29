package lukas.week08.Museum;

import lukas.week08.Museum.Rooms.Room;

import java.util.Random;
import java.util.Vector;

public class Museum {

    public static Random random = new Random();
    private String name;
    private int openingHour;
    private int closingHour;
    private Vector<Room> rooms;

    //---constructor
    public Museum(String name) {
        this.name = name;
        rooms = new Vector<>();
        openingHour = 8;
        closingHour =18;
    }

//---methods
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getNumberOfRooms(){
        return rooms.size();
    }


    //---print
    public void printMuseum() {
        System.out.println(name);
        for (Room r : rooms) {
            System.out.printf("|--%s%n", r.printRoom());
        }

        
        
    }
    
}
