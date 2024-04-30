package samet.week09;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private String name;
    private List<Student> studentList;
    private List<TimeTable> timeTables;

    public SchoolClass(String name){
        this.name = name;
        this.studentList = new ArrayList<>();
        this.timeTables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void addTimetables(TimeTable timeTable){
        timeTables.add(timeTable);

    }
}
