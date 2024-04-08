package katherina.week05.day01;

import java.io.File;
import java.util.Scanner;


public class BiggestData {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Willkommen zu diesem kleinen Hilfsprogramm, das dir die größte Datei im Ordner ausgibt. ");
        String path = getTextFromConsole("Bitte gib den Ordner an, dessen größte Datei du suchst.");
        directory("", path);
        File large = getLargestFile(path);
        if (large != null) {
            System.out.println("Die GRÖSSTE Datei ist " + large.getAbsolutePath().substring(path.length()));
        } else {
            System.out.println("Es gibt NIX da....");
        }


    }

    public static void directory(String prefix, String path) {
        File file = new File(path.trim().replaceAll("\"", ""));

        if (file.isDirectory()) {
            for (File data : file.listFiles()) {
                if (data.isFile()) {
                    System.out.printf("%7d bytes %s %s \n", data.length(), prefix, data.getName());
                } else {
                    System.out.println(" ".repeat(14) + prefix + data.getName());
                    directory("|-" + prefix, data.getAbsolutePath());
                }
            }
        } else {
            System.out.println("Es handelt sich bei der Eingabe nicht um einen gültigen Dateipfad! Das Programm wird beendet.");
        }
    }

    public static File getLargestFile(String path) {
        File file = new File(path.trim().replaceAll("\"", ""));
        File bestOf = null;
        if (file.isFile()) {
            bestOf = file;
        }
        if (file.isDirectory()) {
            for (File x : file.listFiles()) {
                File candidate = getLargestFile(x.getAbsolutePath());
                if (bestOf == null || bestOf.length() < candidate.length()) {
                    bestOf = candidate;
                }
            }
        }
        return bestOf;

    }

    public static String getTextFromConsole(String message) {
    System.out.print(message);

    String text = sc.nextLine();
    return text;
}
}
