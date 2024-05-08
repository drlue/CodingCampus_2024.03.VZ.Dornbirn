package lukas.week09.SchoolSim.Rooms;

import ardijanla.ConsoleColors;
import lukas.week09.SchoolSim.Persons.Person;

import java.util.Vector;

public abstract class Room {

    private static int idCount = 0;
    private String name;
    private int id;
    protected Vector<Person> personsInRoom;

    public Room(String name) {
        this.name = name;
        idCount++;
        this.id = idCount;
        personsInRoom = new Vector<>();
    }

    public String getName() {
        return name;
    }
    public String getColoredName() {
        return ConsoleColors.RED + name + ConsoleColors.RESET;
    }

    public int getId() {
        return id;
    }

    public void addPerson(Person person){
        personsInRoom.add(person);
    }

    public void removePerson(Person person){
        personsInRoom.remove(person);
    }


    public void reset(){
        personsInRoom.removeAllElements();
    }
    @Override
    public String toString() {
        return getColoredName() + " (Id: " + id + ")";
    }
}
