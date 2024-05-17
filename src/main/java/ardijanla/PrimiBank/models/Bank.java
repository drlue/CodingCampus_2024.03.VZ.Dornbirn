package ardijanla.PrimiBank.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int id;
    private String name;
    private String location;

    // Constructor
    public Bank(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
