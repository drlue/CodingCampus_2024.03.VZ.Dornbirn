package christian.week05;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Logging {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            log(1, "Achtung");
            log(2, "Achtung");
            log(3, "Achtung");
        }

    }

    public static void log(int severity, String message) {
        File file = new File("C:\\Users\\schmi\\Desktop\\test\\log.txt");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy.MM.dd. kk:mm:ss");

        try {
            if (file.length() > 1000000) {
                Scanner sc = new Scanner(file);
                File fileOld = new File("C:\\Users\\schmi\\Desktop\\test\\log.old.txt");
                FileOutputStream fos2 = new FileOutputStream(fileOld);
                PrintStream ps2 = new PrintStream(fos2);

                while (sc.hasNextLine()) {
                    ps2.print(sc.nextLine()+"\n");
                } ps2.close();


            } else {

                FileOutputStream fos = new FileOutputStream(file, true);
                PrintStream ps = new PrintStream(fos);
                if (severity == 1) {
                    ps.println(df.format(LocalDateTime.now()) + " | Error: " + message);
                } else if (severity == 2) {
                    ps.println(df.format(LocalDateTime.now()) + " | Warning: " + message);
                } else {
                    ps.println(df.format(LocalDateTime.now()) + " | Info: " + message);
                }
                ps.close();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Die Datei existiert nicht oder es fehlen Zugriffsrechte!");
        }
    }
}
