package katherina.week05.day01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SpeicherbareTabelle {
    public static void main(String[] args) {
        String[] firstNames = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String message = joins(firstNames);
        String[] lastName = {"Klein", "Kinderdorfer ", "Al Elmenar", "Schmidt", "Simma"};
        String message2 = joins(lastName);
        int[] age = {40, 78, 5, 18, 81};
        String[] ageString;
        ageString = intToStringArray(age);
        String message3 = joins(ageString);
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Poelten", "Sankt Poelten"};
        String message4 = joins(place);
        System.out.printf("Entfernung zur \nHauptstadt %-3s ", "");
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String[] stringDistanceFromCapital;
        stringDistanceFromCapital = floatToStringArray(distanceFromCapital);
        String message5 = joins(stringDistanceFromCapital);


        try {
            FileOutputStream file = new FileOutputStream("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\katherina\\week05\\day01\\assetts\\tmp\\output.txt", true);
            PrintStream printedStream = new PrintStream(file);
            printedStream.printf("Vorname %-6s ", "");
            printedStream.println(message);
            printedStream.printf("Nachname %-5s ", "");
            printedStream.println(message2);
            printedStream.printf("Alter%-9s ", "");
            printedStream.println(message3);
            printedStream.printf("Wohnort%-7s ", "");
            printedStream.println(message4);
            printedStream.printf("Entfernung zur \nHauptstadt %-3s ", "");
            printedStream.println(message5);
        }
        catch (FileNotFoundException fnfe){
            System.out.println("Dein Text konnte nicht gespeichert werden. Die Datei wurde nicht erstellt.");
        }
    }

    public static String joins(String[] arr) {
        StringBuilder message = new StringBuilder("|");
        for (int index = 0; index < arr.length; index++) {
            message.append(String.format("%25.25s", arr[index] + "|"));
        }
        return message.toString();
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

