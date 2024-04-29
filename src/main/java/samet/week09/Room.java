package samet.week09;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String name;
    private List<Student> students;
    private List<TimeTable> timeTables;


    public Room(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.timeTables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addTimeTable(TimeTable timeTable){
        timeTables.add(timeTable);
    }
}
