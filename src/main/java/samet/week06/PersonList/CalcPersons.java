package samet.week06.PersonList;


import java.util.ArrayList;
import java.util.List;

public class CalcPersons {

    public static void main(String[] args) {

        PersonInfos benjamin = new PersonInfos(185, 25, "Benjamin", 89);
        PersonInfos muhammed = new PersonInfos(175, 32, "Muhammed", 79.5);
        PersonInfos anja = new PersonInfos(157, 23, "Anja", 48);
        PersonInfos maria = new PersonInfos(162, 28, "Maria", 59);
        PersonInfos peter = new PersonInfos(181, 49, "Peter", 75);


        ArrayList<PersonInfos> person = new ArrayList<>();
        person.add(benjamin);
        person.add(muhammed);
        person.add(anja);
        person.add(maria);
        person.add(peter);


        System.out.println("Unsorted:");
        printList(person);


        System.out.println("Sorted by Alphabet:");
        sortedByAlphabet(person);




    }


    public static void printList(List<PersonInfos> list) {
        for (PersonInfos p : list) {
            System.out.println(p);
        }
    }

    public static void sortedByAlphabet(List<PersonInfos> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getName().compareTo(list.get(j + 1).getName()) > 0) {
                    var temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    System.out.println(list);
                }
            }
        }
    }
}
