package christian.week06.Personen;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Person christian = new Person("Christian",178,33,80);
        Person ardi = new Person("Ardi",175,22,70);
        Person demian = new Person("Demian",182,32,72);
        Person aki = new Person("Aki",168,21,60);
        Person lukas = new Person("Lukas",190,45,82);

        List<Person> personList = new ArrayList<>();
        personList.add(christian);
        personList.add(ardi);
        personList.add(demian);
        personList.add(aki);
        personList.add(lukas);
    }
//    public static List sortPersonList ()
}
