package ardijanla.week4.day01;


import java.util.Random;

public class ClassTesting {

    static Random rnd = new Random();

    public static void main(String[] args) {
        //Create random Boolean and check with Method booleanValue the value of the Variable and print it out.
        Boolean bool = rnd.nextBoolean();
        boolean boolValue = bool.booleanValue();
        System.out.println(boolValue);

        //Return boolean hashcode
        boolean bool1 = rnd.nextBoolean();
        int hashValue = Boolean.hashCode(bool1);
        System.out.println(hashValue);

        // String get a substring out of a existing string Get the name and the begin index is 14
        String myString = "Mein Name ist Ardijan";
        String myName = myString.substring(14);
        printTesting(myString,myName);

        //Replace method Replaces Char A with C and stores it in a new Value.
        String myString1 = "AAAAABBBBBB";
        String stringWithoutA = myString1.replace('A','C');
        printTesting(myString1,stringWithoutA);

        //Normalize the string with the method .toLowerCase
        String weirdEmail = "ArDIJan.kAjTaZi@hoTMAil.Com";
        String normalizedString = weirdEmail.toLowerCase();
        printTesting(weirdEmail,normalizedString);

        System.out.println("A".compareTo("C"));

    }


    public static void printTesting(String firstValue,String secondValue){
        System.out.println();
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
    }
}

