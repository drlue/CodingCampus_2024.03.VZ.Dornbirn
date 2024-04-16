package lukas.week06.Example3_Person;

import java.util.List;

public class Person {

    private int age;
    private int height;
    private String name;
    private int weight;

    public enum PersonProperty {
        NAME,
        AGE,
        HEIGHT,
        WEIGHT
    };

    //-------------------CONSTRUCTOR-------------------------------
    public Person(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    //------------------GET/SET-------------------------------
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

    //------------------METHODS-------------------------------

    @Override
    public String toString() {
        return String.format("%s %s\n%-10s%3d\n%-10s%3d\n%-10s%3d\n", "Name:", this.name, "Alter:", this.age, "Größe:", this.height, "Gewicht:", this.weight);
    }

    public static void sortPersons(List<Person> persons, PersonProperty property, boolean isAscending){
        //bubblesort
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.size()-i-1; j++) {

                boolean isSwitchNecessary;
                switch (property) {
                    case NAME:
                        isSwitchNecessary = persons.get(j).getName().compareTo(persons.get(j+1).getName()) > 0;
                        break;
                    case AGE:
                        isSwitchNecessary = persons.get(j).getAge() > persons.get(j+1).getAge();
                        break;
                    case HEIGHT:
                        isSwitchNecessary = persons.get(j).getHeight() > persons.get(j+1).getHeight();
                        break;
                    case WEIGHT:
                        isSwitchNecessary = persons.get(j).getWeight() > persons.get(j+1).getWeight();
                        break;
                    default:
                        isSwitchNecessary = false;
                }
                if (isSwitchNecessary == isAscending) {
                    Person tmp = persons.set(j, persons.get(j+1));
                    persons.set(j+1, tmp);
                }
            }
        }

    }



}



