package katherina.week04.day03;

//Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

//
// Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.


import java.util.Arrays;

public class DieErsteTabelle {
    public static void main(String[] args) {
        System.out.printf("Vorname %-6s ", "");
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String message = joins(firstName);
        System.out.println(message);
        System.out.printf("Nachname %-5s ", "");
        String[] lastName = {"Klein", "Kinderdorfer ", "Al Elmenar", "Schmidt", "Simma"};
        String message2 = joins(lastName);
        System.out.println(message2);
        System.out.printf("Alter%-9s ", "");
        int[] age = {40, 78, 5, 18, 81};
        String[] ageString;
        ageString = intToStringArray(age);
        String message3 = joins(ageString);
        System.out.println(message3);
        System.out.printf("Wohnort%-7s ", "");
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Poelten", "Sankt Poelten"};
        String message4 = joins(place);
        System.out.println(message4);
        System.out.printf("Entfernung zur \nHauptstadt %-3s ", "");
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String[] stringDistanceFromCapital;
        stringDistanceFromCapital = floatToStringArray(distanceFromCapital);
        String message5 = joins(stringDistanceFromCapital);
        System.out.println(message5);
    }

    public static String joins(String[] arr) {
        for (int index = 0; index < arr.length; index++) {
            arr[index] = String.format("%25.25s", arr[index]);
        }
        return  String.join("|",Arrays.toString(arr));
    }

    public static String[] intToStringArray(int[] intArr) {
        String[] array = new String[intArr.length];
        for (int index = 0; index < array.length; index++) {
            array[index] = Integer.toString(intArr[index]);
        }
        return array;
    }

    public static String[] floatToStringArray(float[] floatArr) {
        String[] array = new String[floatArr.length];
            for (int index = 0; index < array.length; index++) {
                array[index] = String.valueOf(floatArr[index]);
            }
        return array;
    }

}
