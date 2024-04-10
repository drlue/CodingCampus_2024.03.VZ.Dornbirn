package ardijanla.week05;

import java.io.*;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class Logging {
    /*
   severity=1  --> ERROR
   severity=2  --> WARNING
   severity=3  --> INFO

   Ergebnis:
   2022.04.26. 09:30:34 INFO: Guten Morgen!
   2022.04.26. 09:31:01 WARNING: Kein passende Aufgabe gefunden
   ...
    */
    public static void main(String[] args) {
//        log(1, "Das ist ein text");
//        log(2, "Keine aufgabe");
//        log(3, "Das ist ein text");
        for (int i = 0; i < 500; i++) {
            log(1, "Text: " + i);
        }

    }

    public static void log(int severity, String message) {

        //Get formatted date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd. kk:mm:ss ");
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDate = dateTime.format(dateTimeFormatter);
        String path = "C:\\Users\\kaar\\Desktop\\Erster Ordner\\output1.txt";

        StringBuilder fullMessage = new StringBuilder(formattedDate);


        switch (severity) {
            case 1:
                fullMessage.append("ERROR: ");
                break;
            case 2:
                fullMessage.append("WARNING: ");
                break;
            case 3:
                fullMessage.append("INFO: ");
                break;
            default:
                fullMessage.append("UNRECOGNIZED SEVERITY: ");
                break;
        }

        checkIfFileToBig(path);
        String finalMessage = fullMessage.append(message).toString();
        writeFileToPath(finalMessage, path);
    }

    private static void writeFileToPath(String log, String path) {

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(path, true));
            writer.append(log);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.printf("There is an exeption in function writeFileToPath() occured. Siehe error message: %s\n", e.getMessage());
        }
    }

    private static void checkIfFileToBig(String path) {

        File file = new File(path);
        File file2 = new File(path + ".old");

        if (file.length() > 10000) {
            file2.delete();
            file.renameTo(file2);
        }
    }
}
