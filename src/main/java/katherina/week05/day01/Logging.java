package katherina.week05.day01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Logging {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        try {
            Date today = new Date();
            FileOutputStream file = new FileOutputStream("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\katherina\\week05\\day01\\assetts\\tmp\\log.txt", true);
            PrintStream printedStream = new PrintStream(file);
            DateFormat format = new SimpleDateFormat("yyyy.MM.dd. kk:mm:ss ");
            printedStream.print(format.format(today));
            printedStream.print(log());
            String text = BiggestData.getTextFromConsole("Ergänze deine Eingabe!");
            printedStream.println(": " + text);
            printedStream.println();


        } catch (FileNotFoundException fnfe) {
            System.out.println("Dein Text konnte nicht gespeichert werden. Die Datei wurde nicht erstellt.");
        }
    }


    public static String log() {
        int severityInput = chooseSeverity("Was soll geloggt werden? ", 1, 3);
        String message;
        if (severityInput == 1) {
            message = "ERROR";
            System.out.println("Alles klar, du möchtest einen Fehler loggen.");
        } else if (severityInput == 2) {
            message = "WARNING";
            System.out.println("Alles klar, du möchtest eine Warnung hinterlassen.");
        } else {
            message = "INFO";
            System.out.println("Alles klar, du möchtest über etwas informieren!");
        }
        return message;
    }

    public static int chooseSeverity(String message, int minvalue, int maxvalue) {
        System.out.print(message);
        int severity = Integer.MIN_VALUE;
        while (severity < minvalue || severity > maxvalue) {
            while (!sc.hasNextInt()) {
                System.out.println("Ungültige Eingabe! Wähle eine der Optionen!");
                sc.nextLine();
                System.out.print(message);
            }
            severity = sc.nextInt();
            sc.nextLine();
            if (severity < minvalue || severity > maxvalue) {
                System.out.printf("Ich kann nur drei Zustände annehmen! Gib eine Zahl zwischen %d und %d ein.\n", minvalue, maxvalue);
                System.out.print(message);
            }
        }
        return severity;
    }
}
