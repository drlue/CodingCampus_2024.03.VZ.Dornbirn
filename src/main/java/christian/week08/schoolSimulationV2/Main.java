package christian.week08.schoolSimulationV2;

import christian.week08.schoolSimulationV2.humans.Pupil;
import christian.week08.schoolSimulationV2.humans.SchoolClass;

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

        SchoolClass class1A = new SchoolClass("1A");
        SchoolClass class2A = new SchoolClass("1A");
        SchoolClass class1B = new SchoolClass("1A");
        SchoolClass class2B = new SchoolClass("1A");
        SchoolClass class1C = new SchoolClass("1A");

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
    }
}
