package ardijanla.week05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class DatenTabellerischDarstellen {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Poelten", "Sankt Poelten","sadsadsadsad"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String path = "C:\\Users\\kaar\\Desktop\\Erster Ordner\\output.txt";
        PrintTabular(firstName, lastName, age, place, distanceFromCapital, path);
    }


    public static void PrintTabular(String[] firstname, String[] lastname, int[] age, String[] place, float[] distanceFromCaptital, String path) {

        try {
            FileOutputStream outputStream = new FileOutputStream(path, true);
            PrintStream printStream = new PrintStream(outputStream);


            //kopfzeile
            String formatString = "%-" + length(firstname) + "s |" + "%-" + length(lastname) + "s |" + "%-" + 3 + "s |" + "%-" + length(place) + "s |" + "%-" + 10 + "s |\n";


            int fulllength = length(firstname) + length(lastname) + length(place) + 3 + 10 + 10;
            StringBuilder spalte = new StringBuilder();
            for (int j = 0; j < fulllength; j++) {
                spalte.append("-");
            }
            System.out.printf(formatString, "Firstname", "Lastname", "age", "place", "distance");
            printStream.printf(formatString, "Firstname", "Lastname", "age", "place", "distance");


            //Data body
            for (int i = 0; i < firstname.length; i++) {
                if (i == 0) {
                    System.out.println();
                }
                System.out.printf(formatString, firstname[i], lastname[i], age[i], place[i], distanceFromCaptital[i]);
                printStream.printf(formatString, firstname[i], lastname[i], age[i], place[i], distanceFromCaptital[i]);

                System.out.println();
            }

            printStream.close();
        } catch (FileNotFoundException fnfb) {

        }

    }

    public static int length(String[] str) {
        int maxNumber = str[0].length();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > maxNumber) {
                maxNumber = str[i].length();
            }
        }
        return maxNumber;
    }
}
