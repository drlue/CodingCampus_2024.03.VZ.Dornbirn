package lukas.week08.Museum.Rooms;

import lukas.week08.Museum.Art.Artwork;
import lukas.week08.Museum.Persons.Person;

import java.util.List;
import java.util.Vector;

public abstract class Room {

    private String name;
    private Vector<Person> persons;
    private List<Room> neighbors;


    public Room (String name) {
        this.name = name;
        persons = new Vector<>();
        neighbors = new Vector<>();
    }

    //---method
    public void addNeighbor(Room neighbor) {
        neighbors.add(neighbor);
    }

    public void addPerson(Person person) {
        persons.add(person);
    }


    //---print

    public String neighborString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < neighbors.size(); i++) {
            sb.append(i > 0 ? ", " : "");
            sb.append(neighbors.get(i).name);
        }
        return sb.toString();
    }

    public String printRoom(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s (Neighbors: %s)%n", name, neighborString()));
        return sb.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
