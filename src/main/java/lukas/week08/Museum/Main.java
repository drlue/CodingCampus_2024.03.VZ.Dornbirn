package lukas.week08.Museum;

import christian.week04.day03.SearchForWordInText;
import lukas.week08.Museum.Art.Painting;
import lukas.week08.Museum.Rooms.Corridor;
import lukas.week08.Museum.Rooms.ExhibitionRoom;
import lukas.week08.Museum.Rooms.Room;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {


        //================= CONFIGURATION ===================================

        //Build museum
        Museum museum = new Museum("Kunsthistorisches Museum Dornbirn");


        //Rooms
        //--------------------
        Corridor entrance = new Corridor("Entrance");
        museum.addRoom(entrance);
        Corridor corr1 = new Corridor("Corridor 1");
        museum.addRoom(corr1);
        corr1.addNeighbor(entrance);
        entrance.addNeighbor(corr1);

        //rooms in corridor 1
        Vector<ExhibitionRoom> tmpRooms = new Vector<>();
        int nrRooms = 5;
        for (int i = 0; i < nrRooms; i++) {
            ExhibitionRoom room = new ExhibitionRoom("Room"+(10+i));
            museum.addRoom(room);
            room.addNeighbor(corr1);
            tmpRooms.add(room);



            room.addArtwork(new Painting("Painting 1", "Artist 1", 200, 10));




        }
        //add neighbors
        for (int i = 0; i < tmpRooms.size(); i++) {
            corr1.addNeighbor(tmpRooms.get(i));
            if(i>0) {
                tmpRooms.get(i).addNeighbor(tmpRooms.get(i-1));
            }
            if (i<tmpRooms.size()-1) {
                tmpRooms.get(i).addNeighbor(tmpRooms.get(i+1));
            }
        }

        //Artwork
        //--------------------
        Vector<Painting> paintings = new Vector<>();
        paintings.add(new Painting("Mona Lisa", "Leonardo Da Vinci",800000000, 1512));
        paintings.add(new Painting("Salvador Mundi", "Leonardo Da Vinci",450000000, 1510));
        paintings.add(new Painting("Shot Sage Blue Marilyn", "Warhol",195000000, 1964));
        paintings.add(new Painting("Les femmes d'Aiger", "Warhol",195000000, 1964));

        for(ExhibitionRoom er : tmpRooms) {


        }



        museum.printMuseum();





    }

}
