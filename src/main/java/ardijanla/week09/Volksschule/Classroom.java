package ardijanla.week09.Volksschule;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    String name;

    List<Student> students;

    public Classroom(String name, List<Student> students) {
        this.name = name;
        this.students = new ArrayList<>(students);
    }
}
