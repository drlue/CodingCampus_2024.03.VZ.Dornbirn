package ardijanla.week09.Volksschule;

import java.lang.invoke.CallSite;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Room> rooms;
    private List<Teacher> teachers;
    private List<Student> students;
    private SchoolDirector schoolDirector;

    public School(String name, List<Room> rooms, List<Teacher> teachers, SchoolDirector schoolDirector) {
        this.name = name;
        this.rooms = new ArrayList<>(rooms);
        this.teachers = new ArrayList<>(teachers);
        this.schoolDirector = schoolDirector;
    }
}
