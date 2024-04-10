package christian.week06.Personen;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Person christian = new Person("Christian", 178, 33, 80);
        Person ardi = new Person("Ardi", 175, 22, 70);
        Person demian = new Person("Demian", 182, 32, 72);
        Person aki = new Person("Aki", 168, 21, 60);
        Person lukas = new Person("Lukas", 190, 45, 82);

        List<Person> personList = new ArrayList<>();
        personList.add(christian);
        personList.add(ardi);
        personList.add(demian);
        personList.add(aki);
        personList.add(lukas);

        personlistToString(personList);
        sortPersonListByName(personList);
        System.out.println("\n ========== alphabetisch Sortiert===========\n");
        personlistToString(personList);
        sortPersonListByAge(personList);
        System.out.println("\n ========== nach Alter Sortiert===========\n");
        personlistToString(personList);
        sortPersonListBySize(personList);
        System.out.println("\n ========== nach Groesse Sortiert===========\n");
        personlistToString(personList);
        sortPersonListByWeight(personList);
        System.out.println("\n ========== nach Gewicht Sortiert===========\n");
        personlistToString(personList);

    }

    public static void personlistToString(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());

        }
    }

    public static void sortPersonListBySize(List<Person> list) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).getSize() > list.get(i - 1).getSize()) {
                    Person tempsmall = list.get(i - 1);
                    Person tempbig = list.get(i);
                    list.set(i - 1, tempbig);
                    list.set(i, tempsmall);
                    swapped = true;
                }
            }
        }

    }

    public static void sortPersonListByAge(List<Person> list) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).getAge() > list.get(i - 1).getAge()) {
                    Person tempsmall = list.get(i - 1);
                    Person tempbig = list.get(i);
                    list.set(i - 1, tempbig);
                    list.set(i, tempsmall);
                    swapped = true;
                }
            }
        }

    }

    public static void sortPersonListByWeight(List<Person> list) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).getWeight() > list.get(i - 1).getWeight()) {
                    Person tempsmall = list.get(i - 1);
                    Person tempbig = list.get(i);
                    list.set(i - 1, tempbig);
                    list.set(i, tempsmall);
                    swapped = true;
                }
            }
        }

    }

    public static void sortPersonListByName(List<Person> list) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).getName().compareTo(list.get(i - 1).getName()) < 0) {
                    Person tempsmall = list.get(i - 1);
                    Person tempbig = list.get(i);
                    list.set(i - 1, tempbig);
                    list.set(i, tempsmall);
                    swapped = true;
                }
            }
        }

    }
}
