package christian.week05;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logging {
    public static void main(String[] args) {
        for (int i = 0; i < 8000; i++) {
            log(1, "asdfasdfsdf");
            log(2, "sdfasdfsadf");
            log(3, "asdfsdfsdf");
            log(4, "asdfoijgfasdf");
        }

    }

    public static void log(int severity, String message) {
        File file = new File("C:\\Users\\schmi\\Desktop\\test\\log.txt");

        if (file.length() > 1000000) {
            File fileOld = new File("C:\\Users\\schmi\\Desktop\\test\\log.old.txt");
            fileOld.delete();
            file.renameTo(fileOld);
        }
        printInFile(severity, file, message);

    }

    public static void printInFile(int severity, File file, String message) {
        try {
            String[] severityText = {"Ungültige Severity", "Error", "Warning", "Info"};
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy.MM.dd. kk:mm:ss");
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);
            // gyula
            severity = Math.max(severity, 0);
            severity = (severity >= severityText.length) ? 0 : severity;
            ps.printf("%s | %s: %s", df.format(LocalDateTime.now()), severityText[severity], message);
            ps.close();
            // bis hier
        } catch (FileNotFoundException e) {
            System.out.println("Datei existiert nicht oder Zugriffsrechte fehlen!");
            e.printStackTrace();
        }

        /*
        switch (severity) {
            case 1:
                ps.println(df.format(LocalDateTime.now()) + " | Error: " + message);
                break;
            case 2:
                ps.println(df.format(LocalDateTime.now()) + " | Warning: " + message);
                break;
            case 3:
                ps.println(df.format(LocalDateTime.now()) + " | Info: " + message);
                break;
            default:
                ps.println(df.format(LocalDateTime.now()) + " | Ungültige Severity: " + message);
                break;
        }
         */

    }
}
