package samet.week09;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private String name;
    private List<Student> studentList;

    public SchoolClass(String name){
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
