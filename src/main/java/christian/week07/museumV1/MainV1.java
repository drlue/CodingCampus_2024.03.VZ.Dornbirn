package christian.week07.museumV1;

import christian.week07.museumV1.rooms.Corridor;
import christian.week07.museumV1.rooms.Entrance;
import christian.week07.museumV1.rooms.Showroom;

import java.util.Random;

public class MainV1 {
    public static Random rnd = new Random();
    public static void main(String[] args) {
        MuseumV1 museum = new MuseumV1("Das Kabinett des Dr.Fuchsmann");
        museum.initMuseum();
        museum.printStructure();

        for (int day = 0; day < 20; day++) {
            for (int hour = 0; hour < 23; hour++) {

            }

        }
    }
}
