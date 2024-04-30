package lukas.week09.SchoolSim;

import ardijanla.ConsoleColors;
import lukas.week09.SchoolSim.Persons.Headmaster;
import lukas.week09.SchoolSim.Persons.Student;
import lukas.week09.SchoolSim.Rooms.Room;

import java.time.LocalTime;
import java.util.Vector;

public class SchoolClass {

    private String name;
    private Vector<Student> students;
    private Vector<Lesson> schedule;

    public SchoolClass(String name) {
        this.name = name;
        this.students = new Vector<>();
        this.schedule = new Vector<>();
    }

    public String getName() {
        return ConsoleColors.GREEN + name + ConsoleColors.RESET;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addLesson(Lesson lesson) {
        schedule.add(lesson);
    }

    private void studentsInClassLeaveSchool() {
        for (Student s : students) {
            s.reset();
        }
    }

    public void activityStudents(LocalTime myTime) {
        for (Student stu : students) {
            stu.activity(myTime);
        }
    }

    public void writeLetterToParents(Headmaster headMaster, int countLate){
        for (Student s: students) {
            s.writeLetterToParents(headMaster, countLate);
        }
    }

    public void activity(LocalTime myTime, Room teachersRoom) {
        //whole class
        for (int i = 0; i < schedule.size(); i++) {
            Lesson les = schedule.get(i);
            if (myTime.equals(les.getLessonStart().minusMinutes(5))) {
                les.getTeacher().goFromToRoom(teachersRoom,les.getRoom());
            }else if (myTime.equals(les.getLessonStart())) {
                les.startLesson(myTime, this);
            } else if (myTime.equals(les.getLessonStart().plusMinutes(45))) {
                if (i < schedule.size() - 1) {
                    System.out.printf("%s Uhr: Klasse %s hat Pause und wechselt in den Raum %s%n", myTime, getName(), schedule.get(i+1).getRoom().getColoredName());
                    les.getTeacher().goFromToRoom(les.getRoom(),teachersRoom);
                } else {
                    System.out.printf("%s Uhr: Klasse %s hat nun frei!%n", myTime, getName());
                    studentsInClassLeaveSchool();
                }
            }


        }
    }






    public void printStudentsInClass() {
        for (Student s : students) {
            System.out.println("      |--" + s);
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
