package lukas.week09.SchoolSim.Persons;

import lukas.week09.SchoolSim.Rooms.Room;

import java.time.LocalTime;

public abstract class Person {

    private String lastName;
    private String firstName;
    private String title;
    protected boolean isInSchool;
    protected boolean isHungry;
    protected int toiletteCounter;
    public enum Status {INCLASS, HASBREAK, ATHOME}
    protected Status status;


    public Person(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.isInSchool = false;
        isHungry = true;
        toiletteCounter = 0;
        status = Status.ATHOME;
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return (title != null ? title + " " : "") + firstName + " " + lastName;
    }
    abstract String getColoredName();
    public String getFirstAndLastName() {
        return firstName + " " + lastName;
    }


    public void goFromToRoom(Room fromRoom, Room toRoom){
        if(isInSchool) {
            System.out.println(getName() + " begibt sich in " + toRoom.getColoredName());
            toRoom.addPerson(this);
            if (fromRoom != null) {
                fromRoom.removePerson(this);
            }
        }
    }

    public void goToRoom(Room room) {
        goFromToRoom(null, room);
    }



    protected abstract boolean enterSchool(LocalTime myTime);

    public void leaveSchool(){

    }

    public void reset(){
        isInSchool = false;
        isHungry = true;
        toiletteCounter = 0;
    }


    @Override
    public String toString() {
        return getColoredName() + " - " + getClass().getSimpleName();
    }



}
