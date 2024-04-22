package ardijanla.week06.Person2;

import java.util.List;

public class PersonStats {
    public static int getMaxAge(List<Person> personList){
        int maxAge = personList.getFirst().getAge();
        for (Person x : personList){
            if (maxAge < x.getAge()){
                maxAge = x.getAge();
            }
        }
        return maxAge;
    }

    public static int getMinAge (List<Person> personList){
        int maxAge = personList.getFirst().getAge();
        for (Person x : personList){
            if (maxAge > x.getAge()){
                maxAge = x.getAge();
            }
        }
        return maxAge;
    }

    public static double getAvgAge (List<Person> personList){
        int temp = 0;
        for (Person x : personList){
            temp =+ x.getAge();
        }

        return (double)temp / personList.size();
    }
}
