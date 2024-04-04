package lukas.week05;

import lukas.Helper;

import java.io.*;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilesLogging {

    public static void main(String[] args) {
        log(3, "Guten Morgen!");
        log(2, "Keine passende Aufgabe gefunden");
        log(1, "Fataler Crash");

    }


    public static void log(int severity, String message) {
        //String path = "C:\\Users\\LZE\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\lukas\\assets\\tmp";
        Path lukasDir = Helper.getUserDirectory("lukas");
        Path logFilePath = Path.of(lukasDir.toString(),"assets", "tmp", "log.txt");
        System.out.println(logFilePath.toString());
        File logFile = new File(logFilePath.toUri());

        String[] severities = {"", "ERROR", "WARNING", "INFO"};

        if (!logFile.exists()) {
            try {
                if (logFile.createNewFile()) {
                    System.out.println("File created (" + logFile.getAbsolutePath() + ")");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        try {
            FileOutputStream fos = new FileOutputStream(logFile, true);
            PrintStream ps = new PrintStream(fos);
            ps.printf("%s: ", new SimpleDateFormat("yyyy.MM.dd. hh:mm:ss").format(new Date()));
            ps.printf("%s: %s\n", severities[severity], message);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
