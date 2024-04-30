package lukas.week09.SchoolSim;

import lukas.week09.SchoolSim.Persons.Headmaster;
import lukas.week09.SchoolSim.Persons.Person;
import lukas.week09.SchoolSim.Persons.Student;
import lukas.week09.SchoolSim.Persons.Teacher;
import lukas.week09.SchoolSim.Rooms.Room;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Vector;

public class School {

    public static Random random = new Random();
    private String name;
    private String city;
    private int postcode;
    private Vector<Teacher> teachers;
    private Vector<Room> rooms;
    private Headmaster headmaster;
    private Vector<SchoolClass> schoolClasses;

    public School(String name, String city, int postcode) {
        this.name = name;
        this.city = city;
        this.postcode = postcode;
        this.teachers = new Vector<>();
        this.rooms = new Vector<>();
        this.headmaster = null;
        this.schoolClasses = new Vector<>();
    }

    public void setHeadmaster(Headmaster headmaster) {
        this.headmaster = headmaster;
        teachers.add(headmaster);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addSchoolClass(SchoolClass schoolClass) {
        schoolClasses.add(schoolClass);
    }

    public Teacher getTeacherById(int id) {
        for (Teacher t : teachers) {
            if (t.getId() == id) {
                return t;
            }
        }
        System.out.println("Id von Teacher existiert nicht!");
        return null;
    }

    public Teacher getTeacherByName(String firstAndLastName) {
        for (Teacher t : teachers) {
            if (t.getFirstAndLastName().equals(firstAndLastName)) {
                return t;
            }
        }
        System.out.printf("Teacher mit dem Namen '%s' existiert nicht!", firstAndLastName);
        return null;
    }


    public Room getRoomById(int id) {
        for (Room r : rooms) {
            if (r.getId() == id) {
                return r;
            }
        }
        System.out.println("Id von Room existiert nicht!");
        return null;
    }

    public Room getRoomByName(String name) {
        for (Room r : rooms) {
            if (r.getName().equals(name)) {
                return r;
            }
        }
        System.out.printf("Room mit dem Namen '%s' existiert nicht!%n", name);
        return null;
    }

    public void simulateDays(int nrOfDays) {
        LocalTime actualTime = null;
        int ticksPerHour = 12; //5 min simulation (60min/5)
        for (int day = 0; day < nrOfDays; day++) {
            System.out.printf("---DAY %s---%n", day + 1);
            for (int hour = 0; hour < 24; hour++) {
                for (int tick = 0; tick < ticksPerHour; tick++) {
                    actualTime = LocalTime.parse(hour + ":" + (tick * 5), DateTimeFormatter.ofPattern("H:m"));
                    //System.out.println("Es ist " + actualTime);
                    //LEHRER
                    for (Teacher teacher : teachers) {
                        teacher.activity(actualTime, getRoomByName("Teachers Room"));
                    }
                    //STUDENTS
                    for (SchoolClass schoolClass : schoolClasses) {
                        schoolClass.activityStudents(actualTime);
                    }
                    //SCHOOLCLASS
                    for (SchoolClass schoolClass : schoolClasses) {
                        schoolClass.activity(actualTime, getRoomByName("Teachers Room"));
                    }
                    //HEADMASTER
                    //headmaster.activity(actualTime);
                }
            }
            writeLetterToParents();
        }
    }


    public void writeLetterToParents(){
        for (SchoolClass schoolClass : schoolClasses) {
            schoolClass.writeLetterToParents(headmaster, 3);
        }
    }

    public void reset() {
        for (Room r : rooms) {
            r.reset();
        }
        for (Teacher t : teachers) {
            t.reset();
        }

    }

    public void printStructure() {
        System.out.printf("%s - %d %s%n", name, postcode, city);
        System.out.println("|--Rooms");
        for (Room r : rooms) {
            System.out.println("   |--" + r);
        }
        System.out.println("|--Headmaster");
        System.out.println("   |--" + headmaster);
        System.out.println("|--Teachers");
        for (Teacher t : teachers) {
            System.out.println("   |--" + t);
        }
        System.out.println("|--School Classes");
        for (SchoolClass sc : schoolClasses) {
            System.out.println("   |--" + sc);
            sc.printStudentsInClass();
        }
    }


}
