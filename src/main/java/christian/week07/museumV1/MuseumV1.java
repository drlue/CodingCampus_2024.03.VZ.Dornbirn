package christian.week07.museumV1;

import christian.week07.museumV1.humans.Humans;
import christian.week07.museumV1.rooms.Corridor;
import christian.week07.museumV1.rooms.Entrance;
import christian.week07.museumV1.rooms.Room;
import christian.week07.museumV1.rooms.Showroom;

import java.util.ArrayList;

public class MuseumV1 {

    private String name;
    private ArrayList<Room> listOfRooms;

    public MuseumV1(String name) {
        this.name = name;
        listOfRooms = new ArrayList<>();
    }
    //===========================================================================================get==================
    //==========================================================================================set===================
    //==========================================================================================add/remove============
    public void addRoomToList(Room room){
        if(!listOfRooms.contains(room)){
            listOfRooms.add(room);
        }
    }
    //==========================================================================================alter=================
    //==========================================================================================inittialize===========

    public void initMuseum(){
        Showroom showroom1 =  new Showroom("Mittelalter-Galerie");
        Showroom showroom2 = new Showroom("Die Wunder der Antike");
        Showroom showroom3 = new Showroom("Wunder der Neuzeit");
        Showroom showroom4 = new Showroom("Steinraum");
        Showroom showroom5 = new Showroom("Edelstein-Galerie");
        Corridor corridor1 = new Corridor("Corridor1");
        Entrance entrance =  new Entrance("Entrance");

        this.addRoomToList(showroom1);
        this.addRoomToList(showroom2);
        this.addRoomToList(showroom3);
        this.addRoomToList(showroom4);
        this.addRoomToList(showroom5);
        this.addRoomToList(corridor1);
        this.addRoomToList(entrance);

        entrance.addRoomToNeighborsList(corridor1);

        corridor1.addRoomToNeighborsList(entrance);
        corridor1.addRoomToNeighborsList(showroom1);
        corridor1.addRoomToNeighborsList(showroom2);
        corridor1.addRoomToNeighborsList(showroom3);
        corridor1.addRoomToNeighborsList(showroom4);
        corridor1.addRoomToNeighborsList(showroom5);

        showroom1.addRoomToNeighborsList(corridor1);
        showroom1.addRoomToNeighborsList(showroom2);

        showroom2.addRoomToNeighborsList(showroom1);
        showroom2.addRoomToNeighborsList(showroom3);

        showroom3.addRoomToNeighborsList(showroom2);
        showroom3.addRoomToNeighborsList(showroom4);
        showroom3.addRoomToNeighborsList(corridor1);

        showroom4.addRoomToNeighborsList(showroom3);
        showroom4.addRoomToNeighborsList(showroom5);

        showroom5.addRoomToNeighborsList(showroom4);
        showroom5.addRoomToNeighborsList(corridor1);
    }
    //==========================================================================================print=================

    public void printStructure(){
        for(Room room : listOfRooms){
            System.out.println(room.getName());
            room.printNeighbors();
        }
    }
    //==========================================================================================simulate==============

    public void startSimulation(int hour){
        for(Room room:listOfRooms){
            room.humanActivities(hour);
        }
    }
}
