package lukas.week06.Example3_Person;

import java.util.Collections;
import java.util.Vector;

public class PersonStats {


    private int minHeight;
    private int maxHeight;
    private float avgHeight;

    private int minAge;
    private int maxAge;
    private float avgAge;
    private int minWeight;
    private int maxWeight;
    private float avgWeight;


    private Vector<Person> persons;

    //-----------------CONSTRUCTOR-------------------------------

    public PersonStats(Vector<Person> persons) {
        this.persons = persons;
        minHeight = calcMinHeight();
        maxHeight = calcMaxHeight();
        avgHeight = calcAvgHeight();
        minWeight = calcMinWeight();
        maxWeight = calcMaxWeight();
        avgWeight = calcAvgWeight();
        minAge = calcMinAge();
        maxAge = calcMaxAge();
        avgAge = calcAvgAge();

    }


    //-----------------GET / SET-------------------------------

    //-----------------METHODS-------------------------------
    public int calcMinHeight() {
        int minHeight = Integer.MAX_VALUE;
        for (Person p : persons) {
            if (p.getHeight() < minHeight) {
                minHeight = p.getHeight();
            }
        }
        return minHeight;
    }

    private int calcMaxHeight() {
        int maxHeight = Integer.MIN_VALUE;
        for (Person p : persons) {
            if (p.getHeight() > maxHeight) {
                maxHeight = p.getHeight();
            }
        }
        return maxHeight;
    }

    private float calcAvgHeight() {
        int sum = 0;
        for (Person p : persons) {
            sum += p.getHeight();
        }
        return (float) sum / persons.size();
    }


    private int calcMinWeight() {
        int minWeight = Integer.MAX_VALUE;
        for (Person p : persons) {
            if (p.getWeight() < minWeight) {
                minWeight = p.getWeight();
            }
        }
        return minWeight;
    }

    private int calcMaxWeight() {
        int maxWeight = Integer.MIN_VALUE;
        for (Person p : persons) {
            if (p.getWeight() > maxWeight) {
                maxWeight = p.getWeight();
            }
        }
        return maxWeight;
    }

    private float calcAvgWeight() {
        int sum = 0;
        for (Person p : persons) {
            sum += p.getWeight();
        }
        return (float) sum / persons.size();
    }

    private int calcMinAge() {
        int minAge = Integer.MAX_VALUE;
        for (Person p : persons) {
            if (p.getAge() < minAge) {
                minAge = p.getAge();
            }
        }
        return minAge;
    }

    private int calcMaxAge() {
        int maxAge = Integer.MIN_VALUE;
        for (Person p : persons) {
            if (p.getAge() > maxAge) {
                maxAge = p.getAge();
            }
        }
        return maxAge;
    }

    private float calcAvgAge() {
        int sum = 0;
        for (Person p : persons) {
            sum += p.getAge();
        }
        return (float) sum / persons.size();
    }





    @Override
    public String toString() {
        System.out.printf("%29s\n", "PERSONSTATS");
        //Datatable
        String header = String.format("%5s| %11s| %12s| %12s|\n","", "Age", "Height", "Weight");
        String minLine = String.format("%5s| %10dy| %10dcm| %10dkg|\n","MIN", calcMinAge(), calcMinHeight(), calcMinWeight());
        String maxLine = String.format("%5s| %10dy| %10dcm| %10dkg|\n","MAX", calcMaxAge(), calcMaxHeight(), calcMaxWeight());
        String avgLine = String.format("%5s| %10.1fy| %10.1fcm| %10.1fkg|\n","AVG", calcAvgAge(), calcAvgHeight(), calcAvgWeight());


        return header + "=".repeat(47)+"\n" + minLine + maxLine + avgLine;

    }
}
