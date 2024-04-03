package irem.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReadEx {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Irem\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\irem\\week05\\TextFileWriteEx.javadatei.txt";

        try {
            //FilePath ist der Dateipfad
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Die Datei wurde nicht gefunden: " );
        }
    }
}