package lukas.week06.Example3_Person;

import java.util.Vector;

public class Test1 {

    public static void main(String[] args) {

        Person p1 = new Person("Demian", 180, 73, 32);
        Person p2 = new Person("Lukas", 186, 88, 47);
        Person p3 = new Person("Chrisi", 160, 120, 50);

        Vector<Person> persons = new Vector<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        PersonStats pStats = new PersonStats(persons);
        System.out.println(pStats);

    }
}
