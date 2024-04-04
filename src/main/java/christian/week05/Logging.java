package christian.week05;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logging {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            log(1, "Achtung");
            log(2, "Achtung");
            log(3, "Achtung");
            log(4, "Achtung");
        }

    }

    public static void log(int severity, String message) {
        File file = new File("C:\\Users\\schmi\\Desktop\\test\\log.txt");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy.MM.dd. kk:mm:ss");

        try {
            if (file.length() > 1000000) {

                File fileOld = new File("C:\\Users\\schmi\\Desktop\\test\\log.old.txt");
                fileOld.delete();
                file.renameTo(fileOld);

            } else {

                FileOutputStream fos = new FileOutputStream(file, true);
                PrintStream ps = new PrintStream(fos);
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
                ps.close();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Die Datei existiert nicht oder es fehlen Zugriffsrechte!");
        }
    }
}
