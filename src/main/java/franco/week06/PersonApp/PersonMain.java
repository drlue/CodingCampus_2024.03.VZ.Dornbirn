package franco.week06.PersonApp;

import lukas.week06.Example3_Person.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        PersonBasics person1 = new PersonBasics("Vincy", 30, 180, 79.8);
        System.out.println(person1.toString());
        List<PersonBasics> personBasicsList = new ArrayList<>();
        personBasicsList.add(person1);
        //perosn


    }

    public static int maxHeight(List<PersonBasics> personBasicsList) {
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < personBasicsList.size(); i++) {



        }
        return maxHeight;

    }



}
