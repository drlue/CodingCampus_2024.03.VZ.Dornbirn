package at.digitalcampus.codingcampus.oop.excercise4;

import at.digitalcampus.codingcampus.oop.excercise2.Gender;
import at.digitalcampus.codingcampus.oop.excercise2.Person;
import at.digitalcampus.codingcampus.repetition.excercise1.ConsoleColors;

public class SortedHouseMain {
    public static void main(String[] args) {

        //Erstelle mindestens 3 verschiedene Häuser in der main Methode,
        SortedHouse sh1 = new SortedHouse(4,10,"Augartenstrasse 5");
        SortedHouse sh2 = new SortedHouse(7, 14, "Kaiser-Franz-Josef-Strasse 30");
        SortedHouse sh3 = new SortedHouse(50,300,"Pontenstrasse 20");

        // füge einige Personen hinzu,
        sh1.addPerson(new Person("Max", 20, Gender.MALE));
        sh2.addPerson(new Person("Nadine", 35, Gender.FEMALE));
        sh2.addPerson(new Person("Summer", 40, Gender.DIVERS));
        sh2.addPerson(new Person("Daniel", 13, Gender.MALE));
        sh2.addPerson(new Person("Hans", 20, Gender.MALE));
        sh3.addPerson(new Person("Christin", 13, Gender.FEMALE));

        // und gib dann das Haus aus.
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(sh1);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(sh2);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(sh3);
    }
}
