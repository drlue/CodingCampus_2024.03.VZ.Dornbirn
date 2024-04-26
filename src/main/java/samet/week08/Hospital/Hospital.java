package samet.week08.Hospital;

import ardijanla.ConsoleColors;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String name;
    private List<Department> departments;

    public Hospital(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Welcome to the Sacred Heart Hospital");
        return sb.toString();
    }
}



