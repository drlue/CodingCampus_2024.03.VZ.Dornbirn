package franco.week06.ListAndVector;

import java.util.ArrayList;

public class IntroductionList {
    public static void main(String[] args) {

        ArrayList<String>myArray=new ArrayList<>();

        myArray.addFirst("Kiyan");
        myArray.addLast("Franco");
        myArray.add("Azaya");
        myArray.add("Christella");
        myArray.add("Belinda");
        System.out.println(myArray);
        System.out.println(myArray.isEmpty());
        ArrayList<String>mySecondArray=new ArrayList<>();
      //  mySecondArray=myArray.clone();

        System.out.println(mySecondArray);

        for (String name:myArray
             ) {
            System.out.println("Names: "+ name);
        }
        System.out.println(" for loops");
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println("Names: "+ myArray.get(i));

        }
        for (int i = 0; i < 100; i++) {
            mySecondArray.add("ABCDEFG");
        }
        System.out.println(mySecondArray);

    }
}
