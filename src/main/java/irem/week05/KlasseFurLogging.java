package irem.week05;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KlasseFurLogging {

    public static void main(String[] args) {
        KlasseFurLogging SimpleLogger = null;
        log(3, "Guten Morgen!");
        log(2, "Keine passende Aufgabe gefunden");
        log(1, "Dies ist ein Fehler");

    }

    public static void log(int severity, String message) {

        String level;
        switch (severity) {
            case 1:
                level = "ERROR";
                break;
            case 2:
                level = "WARNING";
                break;
            case 3:
                level = "INFO";
                break;
            default:
                level = "UNDEFINED";
        }

        // Erstelle Log-Nachricht
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
        String logMessage = LocalDateTime.now().format(df) + " " + level + ": " + message;

        // Log-Nachricht in die Datei
            try {
                String outputPath = "C:\\Users\\Irem\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\resources\\tmp\\output.txt";
                FileOutputStream luffy = new FileOutputStream(outputPath, true);
                PrintStream zoro = new PrintStream(luffy);
                zoro.println(logMessage);

                zoro.close();
            } catch (FileNotFoundException istmiregal) {
                istmiregal.printStackTrace();

            }
        }
    }



        