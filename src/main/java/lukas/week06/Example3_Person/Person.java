package lukas.week06.Example3_Person;

import christian.week04.day03.SearchForWordInText;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Person {

    private int age;
    private int height;
    private String name;
    private int weight;

    public Person(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }


    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        } else {
            System.out.println(name + "is not a valid name!");
        }
    }
    public String getName() {
        return this.name;
    }

    public void setHeight(int height) {
        if (height > 0 && height < 260) {
            this.height = height;
        } else {
            System.out.println(Integer.toString(height) + "not between 0 and 260cm");
        }
    }
    public int getHeight() {
        return this.height;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be greater than 0!");
        }
    }
    public int getWeight() {
        return this.weight;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Value of age must be positive!");
        }
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%-10s%3d\n%-10s%3d\n%-10s%3d\n","Name:", this.name, "Alter:", this.age, "Größe:", this.height,"Gewicht:", this.weight);
    }


    public static void calcPersonsStats(Vector<Person> persons){
        int maxHeight = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;



        for (Person p : persons) {
            if(p.getHeight() > maxHeight) {
                maxHeight = p.getHeight();
            }

        }


    }



}



