package at.digitalcampus.codingcampus.oop.excercise2;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private Gender gender;

    ////////////////// KONSTRUKTOR ///////////////////////////


    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    public static Comparator<Person> compareByName() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        };
    }

    public static Comparator<Person> compareByAge() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        };
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    ////////////////// GETTER & SETTER ///////////////////////
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    ///////////// TO STRING ///////////////


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
