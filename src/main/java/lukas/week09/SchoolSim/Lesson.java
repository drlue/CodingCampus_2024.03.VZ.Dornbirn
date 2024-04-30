package lukas.week09.SchoolSim;

import ardijanla.ConsoleColors;
import lukas.week09.SchoolSim.Persons.Person;
import lukas.week09.SchoolSim.Persons.Teacher;
import lukas.week09.SchoolSim.Rooms.Room;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Lesson {

    private LocalTime lessonStart;
    private String subject;
    private Teacher teacher;
    private Room room;

    public Lesson(String lessonStart, String subject, Teacher teacher, Room room) {
        this.lessonStart = LocalTime.parse(lessonStart, DateTimeFormatter.ofPattern("HH:mm"));
        this.subject = subject;
        this.teacher = teacher;
        this.room = room;
    }

    public LocalTime getLessonStart() {
        return lessonStart;
    }

    public Room getRoom() {
        return room;
    }

    public String getSubject() {
        return ConsoleColors.PURPLE + subject + ConsoleColors.RESET;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void startLesson(LocalTime myTime, SchoolClass schoolClass) {
        System.out.printf("%s Uhr: Die Klasse %s ist in Raum %s und ",myTime, schoolClass.getName(), room.getColoredName());
        if(isTeacherInSchool()) {
            System.out.printf("hat %s-Unterricht bei %s%n", subject, teacher.getColoredName());
        } else {
            System.out.printf("wartet auf %s!%n", teacher.getColoredName());
        }
    }
    private boolean isTeacherInSchool(){
        return teacher.getStatus() == Person.Status.INCLASS;
    }
}
