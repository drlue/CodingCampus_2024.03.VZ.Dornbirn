package christian.week07.museumV1.rooms;

import christian.week07.museumV1.art.Art;
import christian.week07.museumV1.humans.Humans;

import java.util.ArrayList;

import static christian.week07.museumV1.MainV1.rnd;

public abstract class Room {
    private String name;
    private ArrayList<Room> listOfNeighbors;
    private ArrayList<Humans> listOfHumans;
    private ArrayList<Art> listOfArt;

    public Room(String name) {
        this.name = name;
        listOfNeighbors = new ArrayList<>();
        listOfHumans = new ArrayList<>();
        listOfArt = new ArrayList<>();
    }
    //===========================================================================================get==================


    public String getName() {
        return name;
    }


    //==========================================================================================set===================
    //==========================================================================================add/remove============
    //==================================================================Room
    public void addRoomToNeighborsList(Room room) {
        if (!listOfNeighbors.contains(room)) {
            listOfNeighbors.add(room);
        }
    }

    //==================================================================Human
    public void addHumanToList(Humans human) {
        if (!listOfHumans.contains(human)) {
            listOfHumans.add(human);
        }
    }

    public void removeHumanFromList(Humans human) {
        if (listOfHumans.contains(human)) {
            listOfHumans.remove(human);
        }
    }
    //==================================================================Art

    public void addArtToList(Art art) {
        if (!listOfArt.contains(art)) {
            listOfArt.add(art);
        }
    }

    public void removeArtFromList(Art art) {
        if (listOfArt.contains(art)) {
            listOfArt.remove(art);
        }
    }

    //==========================================================================================alter=================
    //==========================================================================================print=================
    public void printNeighbors() {
        for (Room room : listOfNeighbors) {
            System.out.println("|---" + room.getName());
        }
    }

    //==========================================================================================chooseRandom==========
    public Room chooseRndRoom() {
        return listOfNeighbors.get(rnd.nextInt(0, listOfNeighbors.size() - 1));
    }

    public Art chooseRndArt() {
        if (!listOfArt.isEmpty()) {
            return listOfArt.get(rnd.nextInt(0, listOfArt.size() - 1));
        } else {
            return null;
        }
    }

    //==========================================================================================simulate==============


    public void humanActivities(int hour) {
        for (Humans human : listOfHumans) {
            Room rndRoom = chooseRndRoom();
            Art rndArt = chooseRndArt();
            human.simulateActivity(hour, rndRoom,rndArt);
        }
    }
}
