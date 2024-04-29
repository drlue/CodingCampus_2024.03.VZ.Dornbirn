package samet.week09;

import ardijanla.ConsoleColors;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name;
    private List<Room> tasks;


    public Teacher(String name){
        this.name = name;
        this.tasks = new ArrayList<>();

    }


    public String getName() {
        return name;
    }
}
