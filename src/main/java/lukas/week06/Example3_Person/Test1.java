package lukas.week06.Example3_Person;

import java.util.Vector;

public class Test1 {

    public static void main(String[] args) {

        Person p1 = new Person("Demian", 180, 73, 32);
        Person p2 = new Person("Lukas", 186, 88, 47);
        Person p3 = new Person("Chrisi", 175, 70, 33);

        Vector<Person> persons = new Vector<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        PersonStats pStats = new PersonStats(persons);
        System.out.println(pStats);

        System.out.println("--------------------------------");
        System.out.println("Sort list by name asc:");
        Person.sortPersons(persons, Person.PersonProperty.NAME, true);
        System.out.println(persons);


        System.out.println("Sort list by age desc:");
        Person.sortPersons(persons, Person.PersonProperty.AGE, false);
        System.out.println(persons);

        System.out.println("Sort list by height asc:");
        Person.sortPersons(persons, Person.PersonProperty.HEIGHT, true);
        System.out.println(persons);

        System.out.println("Sort list by weight desc:");
        Person.sortPersons(persons, Person.PersonProperty.WEIGHT, false);
        System.out.println(persons);

    }
}
