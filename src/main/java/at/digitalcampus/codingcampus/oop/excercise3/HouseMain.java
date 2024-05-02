package at.digitalcampus.codingcampus.oop.excercise3;

import at.digitalcampus.codingcampus.oop.excercise2.Gender;
import at.digitalcampus.codingcampus.oop.excercise2.Person;
import at.digitalcampus.codingcampus.repetition.excercise1.ConsoleColors;

public class HouseMain {
    public static void main(String[] args) {
        //Erstelle mindestens 3 verschiedene Häuser in der main Methode,
        House h1 = new House(5, 10, "Hauptstrasse 5");
        House h2 = new House(10, 20, "Industrietrasse 34");
        House h3 = new House(2, 3, "Fichtenweg 3");

        // füge einige Personen hinzu
        h1.addPerson(new Person("Max", 20, Gender.MALE));
        h1.addPerson(new Person("Nadine", 35, Gender.FEMALE));
        h2.addPerson(new Person("Summer", 40, Gender.DIVERS));
        h2.addPerson(new Person("Daniel", 13, Gender.MALE));
        h2.addPerson(new Person("Hans", 20, Gender.MALE));
        h3.addPerson(new Person("Christin", 13, Gender.FEMALE));


        //und gib dann das Haus aus.
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(h1);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(h2);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(h3);


    }
}
