package at.digitalcampus.codingcampus.oop.excercise2;

import at.digitalcampus.codingcampus.repetition.excercise1.ConsoleColors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {

        //Erstelle mindestens 6 verschiedene Person in der main Methode
        Person p1 = new Person("Max", 20, Gender.MALE);
        Person p2 = new Person("Nadine", 35, Gender.FEMALE);
        Person p3 = new Person("Summer", 40, Gender.DIVERS);
        Person p4 = new Person("Daniel", 13, Gender.MALE);
        Person p5 = new Person("Hans", 20, Gender.MALE);
        Person p6 = new Person("Christin", 13, Gender.FEMALE);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);

        //Anonymous implementation of comparator
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        //Using class with implementation of comparable
        Collections.sort(persons);

        //Using static methods
        Collections.sort(persons, Person.compareByAge());
        Collections.sort(persons, Person.compareByName());

        System.out.println(persons);

        // und gib diese aus.
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(p1);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(p2);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(p3);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(p4);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(p5);
        System.out.printf("%n%sAUSGABE:%s%n", ConsoleColors.BG_GREEN, ConsoleColors.RESET);
        System.out.println(p6);



    }
}
