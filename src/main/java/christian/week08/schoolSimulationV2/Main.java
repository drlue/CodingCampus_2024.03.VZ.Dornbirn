package christian.week08.schoolSimulationV2;

import christian.week08.schoolSimulationV2.humans.Pupil;
import christian.week08.schoolSimulationV2.humans.SchoolClass;
import christian.week08.schoolSimulationV2.humans.Teacher;
import christian.week08.schoolSimulationV2.rooms.Room;

import java.util.Random;

public class Main {
    public static Random rnd = new Random();

    public static void main(String[] args) {

        School school1 = new School("Grundschule");

        Pupil pupil1 = new Pupil("Olaf");
        Pupil pupil2 = new Pupil("Gerhard");
        Pupil pupil3 = new Pupil("Max");
        Pupil pupil4 = new Pupil("Nadine");
        Pupil pupil5 = new Pupil("Horst");
        Pupil pupil6 = new Pupil("Maili");
        Pupil pupil7 = new Pupil("Marina");
        Pupil pupil8 = new Pupil("Oskar");
        Pupil pupil9 = new Pupil("Herbert");
        Pupil pupil10 = new Pupil("Norbert");

        Teacher teacher1 = new Teacher("Paul");
        Teacher teacher2 = new Teacher("Daniel");
        Teacher teacher3 = new Teacher("Heinz");
        Teacher teacher4 = new Teacher("Markus");
        Teacher teacher5 = new Teacher("Leon");

        SchoolClass class1A = new SchoolClass("1A");
        SchoolClass class2A = new SchoolClass("2A");
        SchoolClass class1B = new SchoolClass("1B");
        SchoolClass class2B = new SchoolClass("2B");
        SchoolClass class1C = new SchoolClass("1C");

        class1A.addToClass(pupil1);
        class1A.addToClass(pupil2);
        class2A.addToClass(pupil3);
        class2A.addToClass(pupil4);
        class1B.addToClass(pupil5);
        class1B.addToClass(pupil6);
        class2B.addToClass(pupil7);
        class2B.addToClass(pupil8);
        class1C.addToClass(pupil9);
        class1C.addToClass(pupil10);

        Timetable tTRoom1 = new Timetable("tT1");
        Timetable tTRoom2 = new Timetable("tT2");
        Timetable tTRoom3 = new Timetable("tT3");
        Timetable tTRoom4 = new Timetable("tT4");
        Timetable tTRoom5 = new Timetable("tT5");

        tTRoom1.addSchoolClass(class1A);
        tTRoom1.addSchoolClass(class2A);
        tTRoom1.addSchoolClass(class1B);
        tTRoom1.addSchoolClass(class2B);
        tTRoom1.addSchoolClass(class1C);

        tTRoom2.addSchoolClass(class2A);
        tTRoom2.addSchoolClass(class1B);
        tTRoom2.addSchoolClass(class2B);
        tTRoom2.addSchoolClass(class1C);
        tTRoom2.addSchoolClass(class1A);

        tTRoom3.addSchoolClass(class1B);
        tTRoom3.addSchoolClass(class2B);
        tTRoom3.addSchoolClass(class1C);
        tTRoom3.addSchoolClass(class1A);
        tTRoom3.addSchoolClass(class2A);

        tTRoom4.addSchoolClass(class2B);
        tTRoom4.addSchoolClass(class1C);
        tTRoom4.addSchoolClass(class1A);
        tTRoom4.addSchoolClass(class2A);
        tTRoom4.addSchoolClass(class1B);

        tTRoom5.addSchoolClass(class1C);
        tTRoom5.addSchoolClass(class1A);
        tTRoom5.addSchoolClass(class2A);
        tTRoom5.addSchoolClass(class1B);
        tTRoom5.addSchoolClass(class2B);

        tTRoom1.addTeacher(teacher1);
        tTRoom1.addTeacher(teacher2);
        tTRoom1.addTeacher(teacher3);
        tTRoom1.addTeacher(teacher4);
        tTRoom1.addTeacher(teacher5);

        tTRoom2.addTeacher(teacher2);
        tTRoom2.addTeacher(teacher3);
        tTRoom2.addTeacher(teacher4);
        tTRoom2.addTeacher(teacher5);
        tTRoom2.addTeacher(teacher1);

        tTRoom3.addTeacher(teacher3);
        tTRoom3.addTeacher(teacher4);
        tTRoom3.addTeacher(teacher5);
        tTRoom3.addTeacher(teacher1);
        tTRoom3.addTeacher(teacher2);

        tTRoom4.addTeacher(teacher4);
        tTRoom4.addTeacher(teacher5);
        tTRoom4.addTeacher(teacher1);
        tTRoom4.addTeacher(teacher2);
        tTRoom4.addTeacher(teacher3);

        tTRoom5.addTeacher(teacher5);
        tTRoom5.addTeacher(teacher1);
        tTRoom5.addTeacher(teacher2);
        tTRoom5.addTeacher(teacher3);
        tTRoom5.addTeacher(teacher4);

        Room room1 = new Room("Room101",tTRoom1);
        Room room2 = new Room("Room102",tTRoom2);
        Room room3 = new Room("Room103",tTRoom3);
        Room room4 = new Room("Room104",tTRoom4);
        Room room5 = new Room("Room105",tTRoom5);

        school1.addRoomToList(room1);
        school1.addRoomToList(room2);
        school1.addRoomToList(room3);
        school1.addRoomToList(room4);
        school1.addRoomToList(room5);

        school1.simulateDay();

    }
}
