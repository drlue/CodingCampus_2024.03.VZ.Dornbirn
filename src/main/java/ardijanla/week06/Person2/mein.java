package ardijanla.week06.Person2;

import java.util.Calendar;
import java.util.List;
import java.util.Vector;

public class mein {
    public static void main(String[] args) {
        List<Person> personList = new Vector<>(personListm());

        System.out.println("max " +  PersonStats.getMaxAge(personList));
        System.out.println("min " +  PersonStats.getMinAge(personList));
        System.out.println("avg " +  PersonStats.getAvgAge(personList));




    }

    public static List<Person> personListm(){
        List<Person> personList = new Vector<>();

        personList.add(new Person("Ardijan",169,23,45.6));
        personList.add(new Person("Lukas",186,31,75.0));
        personList.add(new Person("Christian",187,34,12));
        personList.add(new Person("Franco",137,65,453));
        personList.add(new Person("Demian",146,34,34345));
        return personList;
    }


}
