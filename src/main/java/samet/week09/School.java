package samet.week09;


import ardijanla.ConsoleColors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class School {

    private String name;
    private List<Room> rooms;
    private List<Teacher> teachers;
    private List<SchoolClass> classes;
    private Direktor direktor;

    public School(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
        this.direktor = new Direktor("Herr Beckenbauer Direktor der HTL Dornbirn");
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addSchoolClasses(SchoolClass schoolClass) {
        classes.add(schoolClass);
    }

    public List<Room> getRooms() {
        return rooms;
    }


    public void startDay() {
        System.out.println(ConsoleColors.GREEN + "---- Morgen in der Schule beginnt----\n" + ConsoleColors.RESET);
        Random random = new Random();
        for (Teacher teacher : teachers) {
            System.out.println(ConsoleColors.BLUE + teacher.getName() + ConsoleColors.RESET + " kommt in die Schule.");
        }
        for (SchoolClass schoolClass : classes) {
            for (Student student : schoolClass.getStudentList()) {
                System.out.println(student.getName() + " kommt in die Schule.");
                if (student.toLate()) {
                    System.out.println(ConsoleColors.RED + student.getName() + ConsoleColors.RESET + " ist zu spät und muss zum Direktor gehen.");
                    direktor.schimpfen(student);
                }
            }
        }
    }
}





