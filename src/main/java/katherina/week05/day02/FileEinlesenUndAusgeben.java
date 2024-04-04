package katherina.week05.day02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEinlesenUndAusgeben {
    public static void main(String[] args) throws FileNotFoundException {
        Path sourcePath = Paths.get("src" + File.separator + "/main/resources/txt/simpleText.txt");
        Path targetPath = Paths.get("src" + File.separator + "/main/java/katherina/week05/day01/assetts/tmp/simpleTextCopy2.txt");

        try {
            copyFile(sourcePath, targetPath);
            System.out.println("Die Datei erfolgreich kopiert. Bitte kontrolliere die Datei! Alles dran?");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copyFile(Path sourcePath, Path targetPath) throws IOException {
        Files.copy(sourcePath, targetPath);
    }
}