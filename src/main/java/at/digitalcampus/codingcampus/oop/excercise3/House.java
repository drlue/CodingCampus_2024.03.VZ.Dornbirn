package at.digitalcampus.codingcampus.oop.excercise3;

import at.digitalcampus.codingcampus.oop.excercise2.Person;

import java.util.ArrayList;
import java.util.List;

public class House {

    ////////////////// MEMBER VARIABLEN ///////////////////////////
    private int doors;
    private int windows;
    private String address;
    private List<Person> residents;

    ////////////////// KONSTRUKTOR ///////////////////////////
    public House(int doors, int windows, String address) {
        this.doors = doors;
        this.windows = windows;
        this.address = address;
        this.residents = new ArrayList<>();
    }

    ////////////////// GETTER & SETTER ///////////////////////

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public List<Person> getResidents() {
        return residents;
    }
    public void setResidents(List<Person> residents) {
        this.residents = residents;
    }

    ////////// METHODEN//////////////////////////////

    //Methode zum Hinzufügen einer Person zum Haus
    public void addPerson(Person person) {
        residents.add(person);
    }

    ////////////////// TOSTRING UEBERSCHREIBEN ///////////////////////////
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("House: ").append(address).append("\n");
        string.append("Doors: ").append(doors).append(", ");
        string.append("Windows: ").append(windows).append("\n");
        string.append("Residents:\n");
        for (Person person : residents) {
            string.append(person.toString()).append("\n");
        }
        return string.toString();
    }
}
