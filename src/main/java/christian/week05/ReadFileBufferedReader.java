package christian.week05;

import java.io.*;

public class ReadFileBufferedReader {
    public static void main(String[] args) {
        File log = new File("C:\\Users\\schmi\\Desktop\\test\\log.txt");
        readFileConsoleOut(log);
    }

    public static void readFileConsoleOut(File file) {
        String temp;
        try {
            Reader rd = new FileReader(file);
            BufferedReader reader = new BufferedReader(rd);
            while ((temp = reader.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (IOException e) {
            System.out.println("Datei wurde nicht gefunden oder Zugriffsrechte fehlen!");
            e.printStackTrace();
        }

    }
}
