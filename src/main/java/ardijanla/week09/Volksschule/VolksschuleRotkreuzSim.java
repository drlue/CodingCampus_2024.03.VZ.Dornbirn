package ardijanla.week09.Volksschule;

import java.util.ArrayList;
import java.util.List;

public class VolksschuleRotkreuzSim {
    public static void main(String[] args) {

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Ardijan"));
        teacherList.add(new Teacher("Petrus"));
        teacherList.add(new Teacher("juergen"));

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Irem"));
        studentList.add(new Student("christian"));
        studentList.add(new Student("Lukas"));
        studentList.add(new Student("Gyula"));

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("sheogorat"));
        studentList1.add(new Student("derdumme"));
        studentList1.add(new Student("talos"));
        studentList1.add(new Student("Deadra"));


        List<Room> roomList = new ArrayList<>();
        roomList.add(new Gym("Gym room "));
        roomList.add(new Tech("Tech room"));


        SchoolDirector schoolDirector = new SchoolDirector("Purin");

        School Rotkreuz = new School("Rotkreuz",roomList,teacherList,schoolDirector);





    }
}
