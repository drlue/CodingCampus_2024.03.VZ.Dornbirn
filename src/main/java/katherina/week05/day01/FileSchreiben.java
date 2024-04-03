package katherina.week05.day01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class FileSchreiben {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi! Ich bewahre deine Texte auf, indem ich sie in einer Datei sichere.");
String text = BiggestData.getTextFromConsole("Bitte gib einen Text ein, den ich für dich aufbewahren soll.");


            try {
                FileOutputStream file = new FileOutputStream("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\katherina\\week05\\day01\\assetts\\tmp\\output.txt", true);
                PrintStream printedStream = new PrintStream(file);
                printedStream.println(text);
            }
            catch (FileNotFoundException fnfe){
                System.out.println("Dein Text konnte nicht gespeichert werden. Die Datei wurde nicht erstellt.");
            }
        }
    }
